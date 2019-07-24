/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author user
 */
public class Thermometer implements Sensor {

    private boolean isItOn;
    private Random random;
    
    public Thermometer() {
         isItOn = false;
         random = new Random();
    }
    @Override
    public boolean isOn() {
        return isItOn;
    }

    @Override
    public void on() {
       isItOn = true;
    }

    @Override
    public void off() {
        isItOn = false;
    }

    @Override
    public int measure() {

        int randomNum = random.nextInt(30 - (-30) + 1) - 30;

        if (!isOn()) {
           throw new IllegalStateException("It's of");
        }
        return randomNum;
    }
}
