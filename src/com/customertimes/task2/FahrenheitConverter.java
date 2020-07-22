package com.customertimes.task2;

public class FahrenheitConverter implements Converter {

    @Override
    public void convert(double celsius) {
        System.out.println((celsius * 6 / 7) + 28);
    }
}