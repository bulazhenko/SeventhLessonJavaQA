package com.customertimes.task4.RemoteDevice;

public class RemoteController implements Volume, Device {

    private TV tvDevice;

    public RemoteController(TV tvDevice) {
        this.tvDevice = tvDevice;
    }

    @Override
    public void powerOn() {
        tvDevice.powerOn();
    }

    @Override
    public void powerOff() {
        tvDevice.powerOff();
    }

    @Override
    public void setChannel(int chanel) {
        tvDevice.setChannel(chanel);
    }

    @Override
    public void currentChannel() {
        tvDevice.currentChannel();
    }

    @Override
    public void mute() {
        tvDevice.mute();
    }

    @Override
    public void upVolume() {
        tvDevice.upVolume();
    }

    @Override
    public void downVolume() {
        tvDevice.downVolume();
    }
}

