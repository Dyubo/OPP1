package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    @Test
    void shouldRadioStationNumber() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(7);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldKeyNext() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldKeyPrev() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(2);
        radio.prevStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldOverMax() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldLessMin() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldStationLessMin() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldStationOverMax() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(12);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldKeyPlus() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        radio.plusVolume();
        assertEquals(8, radio.getCurrentVolume());

    }

    @Test
    void shouldKeyMinus() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(6);
        radio.minusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    void shouldMaxValue() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void shouldLessMinValue() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxValue() {
        ru.netology.Radio radio = new ru.netology.Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());

    }


    @Test
    void shouldOverMinValue() {
        ru.netology.Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

}
