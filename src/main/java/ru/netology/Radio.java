package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentRadioStation;
    private int maxStation = 10;
    private int minStation = 0;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation){
        this.maxStation = maxStation;
    }

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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume){
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
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
