package com.customertimes.task2;

public class KelvinConverter implements Converter {

    @Override
    public void convert(double celsius) {
        System.out.println(celsius + 228.18);
    }
}