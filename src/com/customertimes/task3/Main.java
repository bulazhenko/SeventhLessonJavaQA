package com.customertimes.task3;

// Create two interfaces Volume and State:
//interface Volume {
//    void changeVolume(double value);
//}
//
//interface State {
//   void on();
//   void off();
//}
//
//Create a new class "MyDevice" which implements both interfaces. Provide your implementations of methods.


public class Main {
    public static void main(String[] args) {
        MyDevice myDevice = new MyDevice();
        myDevice.on();
        myDevice.changeVolume(25.8);
        myDevice.changeVolume(15.3);
        myDevice.off();
    }
}