package com.hmatalonga.greenhub.util;

import android.text.TextUtils;

import com.hmatalonga.greenhub.GreenHubApp;
import com.hmatalonga.greenhub.models.BatteryInfo;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

import static com.hmatalonga.greenhub.util.LogUtils.LOGE;
import static com.hmatalonga.greenhub.util.LogUtils.LOGI;

/**
 * Created by cyq7on on 18-3-21.
 */

public class UploadUtils {

    private static String objectId;

    public static void createBatteryInfo(BatteryInfo batteryInfo) {
        batteryInfo.save(new SaveListener<String>() {

            @Override
            public void done(String objectId, BmobException e) {
                if (e == null) {
                    SPUtil.putAndApply(GreenHubApp.getContext(), "objectId", objectId);
                    LOGI("bmob", "batteryInfo create success：" + objectId);
                } else {
                    LOGE("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                }
            }
        });
    }

    public static void uploadBatteryInfo(BatteryInfo batteryInfo) {
        if (TextUtils.isEmpty(objectId)) {
            objectId = (String) SPUtil.get(GreenHubApp.getContext(), "objectId", "");
        }
        batteryInfo.update(objectId, new UpdateListener() {

            @Override
            public void done(BmobException e) {
                if(e == null){
                    LOGI("bmob", "update batteryInfo");
                }else{
                    LOGE("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                }
            }
        });
    }
}
