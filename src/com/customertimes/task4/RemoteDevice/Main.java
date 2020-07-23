package com.customertimes.task4.RemoteDevice;

//4) Write a project named "Remote Device". Create a class "RemoteController" which will be simulation the real one to control the TV.
// Create interfaces Device and Volume. The "Device" interface should have methods powerOn(), powerOff(),
// setChannel(int channel), and currentChannel(); The "Volume" interface should have methods "upVolume(), downVolume() and mute();
//Write an abstract class TVDevice which will be implementing interfaces Volume and Device
// and has the fields String modelName and boolean isOn (Tip: You don't need to implement methods from the interface if
// you class is abstract).
//Write a class "TV" which extends the class TVDevice. Implements all the methods.
//Write a class RemoteController to control your TV.
//Example of the structure in the attachments.

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("LG");
        RemoteController remoteController = new RemoteController(tv);
        remoteController.powerOn();
        remoteController.setChannel(10);
        remoteController.currentChannel();
        remoteController.upVolume();
        remoteController.downVolume();
        remoteController.mute();
        remoteController.setChannel(4);
        remoteController.currentChannel();
        remoteController.upVolume();
        remoteController.powerOff();
    }
}
