package com.hmatalonga.greenhub.models;

import cn.bmob.v3.BmobObject;

/**
 * Created by cyq7on on 18-3-21.
 */

public class BatteryInfo extends BmobObject {

    private int health;
    private int level;
    private int plugged;
    private boolean present;
    private int scale;
    private int status;
    private String technology;
    private float temperature;
    private float voltage;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPlugged(int plugged) {
        this.plugged = plugged;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

}
