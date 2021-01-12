package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data

public class Radio {
    private int currentRadioStation;
    private int maxStation = 10;
    private int minStation = 0;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

//    public Radio(int currentRadioStation, int maxStation, int minStation, int currentVolume, int maxVolume, int minVolume) {
//        this.currentRadioStation = currentRadioStation;
//        this.maxStation = maxStation;
//        this.minStation = minStation;
//        this.currentVolume = currentVolume;
//        this.maxVolume = maxVolume;
//        this.minVolume = minVolume;
//    }

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