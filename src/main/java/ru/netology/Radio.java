package ru.netology;

public class Radio {
    private int currentRadioStation = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int keyNext;
    private int keyPrev;

    private int currentVolume = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int keyPlus;
    private int keyMinus;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation)
            currentRadioStation = maxStation;
        if (currentRadioStation < minStation)
            currentRadioStation = minStation;

        this.currentRadioStation = currentRadioStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getKeyNext() {
        {
            keyNext = currentRadioStation + 1;
        }
        if (keyNext > maxStation) {
            keyNext = minStation;
        }

        return keyNext;
    }

    public void setKeyNext(int keyNext) {

        this.keyNext = keyNext;
    }

    public int getKeyPrev() {
        {
            keyPrev = currentRadioStation - 1;
        }
        if (keyPrev < minStation)
            keyPrev = maxStation;
        return keyPrev;
    }

    public void setKeyPrev(int keyPrev) {
        this.keyPrev = keyPrev;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            currentVolume = maxVolume;
        if (currentVolume < minVolume)
            currentVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getKeyPlus() {
        {
            keyPlus = currentVolume + 1;
        }
        if (keyPlus > maxVolume)
            keyPlus = maxVolume;
        return keyPlus;
    }

    public void setKeyPlus(int keyPlus) {
        this.keyPlus = keyPlus;
    }

    public int getKeyMinus() {
        {
            keyMinus = currentVolume - 1;
        }
        if (keyMinus < minVolume)
            keyMinus = minVolume;
        return keyMinus;
    }

    public void setKeyMinus(int keyMinus) {
        this.keyMinus = keyMinus;
    }
}







