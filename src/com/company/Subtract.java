package com.company;

public class Subtract extends NumberCruncherTopLevel implements CrunchOperation {

    public Subtract(float[] values) {
        super(values);
    }

    @Override
    public void crunch(float[] values) {
        float[] temp = new float[values.length];
        temp[0] = values[0];
        for (int i = 0; i < values.length - 1; i++) {
            temp[i + 1] = values[i] - values[i + 1];
        }
        values = temp;
        setArr(values);
    }
}
