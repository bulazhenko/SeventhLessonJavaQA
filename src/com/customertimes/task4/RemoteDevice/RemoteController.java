package com.customertimes.task4.RemoteDevice;

public class RemoteController {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.powerOn();
        tv.setChannel(10);
        tv.currentChannel();
        tv.upVolume();
        tv.downVolume();
        tv.mute();
        tv.setChannel(4);
        tv.currentChannel();
        tv.upVolume();
        tv.powerOff();
    }
}

