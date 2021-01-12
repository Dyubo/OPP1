package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int maxStation = 9;
    private int minStation = 0;

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation) {
            this.currentRadioStation = minStation;
            return;
        }
        if (currentRadioStation < minStation) {
            this.currentRadioStation = maxStation;
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {

        if (currentRadioStation >= maxStation) {
            currentRadioStation = minStation;
            return;
        }
        currentRadioStation++;
    }

    public void prevStation() {

        if (currentRadioStation <= minStation) {
            currentRadioStation = maxStation;
            return;
        }
        currentRadioStation--;

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void minusVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }


    public void plusVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }
}