package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Swirl extends NumberCruncherTopLevel implements CrunchOperation {

    public Swirl(float[] values) {
        super(values);
    }

    @Override
    public void crunch(float[] values) {
        float [] tempArr = new float[values.length];

        {
            int i = 0;
            while (i < values.length) {
                tempArr[i] = values[i];
                i++;
            }
        }
        for (int i = 0; i < values.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, values.length);
            int randomNum2 = ThreadLocalRandom.current().nextInt(0, values.length);
            float temp = values[randomNum];
            values[randomNum] = values[randomNum2];
            values[randomNum2] = temp;
            setArr(values);
        }
        if(Arrays.equals(tempArr, values)){
            crunch(values);
        }
    }
}
