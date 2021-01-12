package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {
    @Test
    void shouldRadioStationNumber() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldKeyNext() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(8);
        radio.nextStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldKeyPrev() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(2);
        radio.prevStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldOverMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldLessMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldStationLessMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldStationOverMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(12);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldKeyPlus() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        radio.plusVolume();
        assertEquals(8, radio.getCurrentVolume());

    }

    @Test
    void shouldKeyMinus() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(6);
        radio.minusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    void shouldMaxValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    void shouldLessMinValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());

    }


    @Test
    void shouldOverMinValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }


}
