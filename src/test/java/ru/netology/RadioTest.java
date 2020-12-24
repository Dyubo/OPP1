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
        assertEquals(9, radio.getKeyNext());
    }

    @Test
    void shouldKeyPrev() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(2);
        assertEquals(1, radio.getKeyPrev());
    }

    @Test
    void shouldKeyPlus() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        assertEquals(8, radio.getKeyPlus());

    }

    @Test
    void shouldKeyMinus() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(9, radio.getKeyMinus());
    }

    @Test
    void shouldOverMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        assertEquals(0, radio.getKeyNext());
    }

    @Test
    void shouldLessMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        assertEquals(9, radio.getKeyPrev());
    }

    @Test
    void shouldMaxValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getKeyPlus());

    }

    @Test
    void shouldLessMinValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getKeyMinus());
    }

    @Test
    void shouldOverMaxValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getKeyPlus());

    }


    @Test
    void shouldOverMinValue() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getKeyMinus());
    }

    @Test
    void shouldStationLessMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getKeyPrev());
    }

    @Test
    void shouldStationOverMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getKeyNext());
    }

}
