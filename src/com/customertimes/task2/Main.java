package com.customertimes.task2;

//2) Create a new interface "Converter". This interface should have one method "convert(double celsius)".
//Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
// which convert celsius degrees to kelvins or fahrenheits accordingly.

public class Main {
    public static void main(String[] args) {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();

        fahrenheitConverter.convert(13);
        kelvinConverter.convert(7);
    }
}