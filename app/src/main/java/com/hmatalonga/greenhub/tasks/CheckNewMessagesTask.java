package com.hmatalonga.greenhub.tasks;

import android.content.Context;
import android.os.AsyncTask;

import com.hmatalonga.greenhub.BuildConfig;
import com.hmatalonga.greenhub.Config;
import com.hmatalonga.greenhub.util.SettingsUtils;

public class CheckNewMessagesTask extends AsyncTask<Context, Void, Void> {

    protected Void doInBackground(final Context... params) {
        String url = SettingsUtils.fetchServerUrl(params[0]);

        if (BuildConfig.DEBUG) {
            url = Config.SERVER_URL_DEVELOPMENT;
        }

       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GreenHubAPIService service = retrofit.create(GreenHubAPIService.class);

        final int last = SettingsUtils.fetchLastMessageId(params[0]);

        Call<List<JsonObject>> call = service.getMessages(
                Specifications.getAndroidId(params[0]),
                last
        );
        call.enqueue(new Callback<List<JsonObject>>() {
            @Override
            public void onResponse(Call<List<JsonObject>> call, Response<List<JsonObject>> response) {
                if (response == null) {
                    EventBus.getDefault().post(
                            new StatusEvent(
                                    params[0].getString(R.string.event_server_response_failed)
                            )
                    );
                    return;
                }
                if (response.body() != null && response.body().size() > 0) {
                    final Realm realm = Realm.getDefaultInstance();
                    Message message = null;

                    for (JsonObject el : response.body()) {
                        message = new Message(
                                el.get("id").getAsInt(),
                                el.get("title").getAsString(),
                                el.get("body").getAsString(),
                                el.get("created_at").getAsString()
                        );
                        if (realm.where(Message.class).equalTo("id", message.id).count() == 0) {
                            try {
                                realm.beginTransaction();
                                realm.copyToRealm(message);
                                realm.commitTransaction();
                            } catch (RealmPrimaryKeyConstraintException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    realm.close();

                    if (message != null) {
                        SettingsUtils.saveLastMessageId(params[0], message.id);
                    }
                    if (SettingsUtils.isMessageAlertsOn(params[0])) {
                        Notifier.newMessageAlert(params[0]);
                    }
                }
            }

            @Override
            public void onFailure(Call<List<JsonObject>> call, Throwable t) {
                t.printStackTrace();
                EventBus.getDefault().post(
                        new StatusEvent(params[0].getString(R.string.event_server_not_responding))
                );
            }
        });*/
        return null;
    }
}
