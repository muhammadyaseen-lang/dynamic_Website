package com.example.converter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureServiceTest {

    @Test
    void testCelsiusToFahrenheit_FreezingPoint() {
        double result = TemperatureService.celsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.001, "0°C should be 32°F");
    }

    @Test
    void testCelsiusToFahrenheit_BoilingPoint() {
        double result = TemperatureService.celsiusToFahrenheit(100);
        assertEquals(212.0, result, 0.001, "100°C should be 212°F");
    }

    @Test
    void testFahrenheitToCelsius_FreezingPoint() {
        double result = TemperatureService.fahrenheitToCelsius(32);
        assertEquals(0.0, result, 0.001, "32°F should be 0°C");
    }

    @Test
    void testFahrenheitToCelsius_BoilingPoint() {
        double result = TemperatureService.fahrenheitToCelsius(212);
        assertEquals(100.0, result, 0.001, "212°F should be 100°C");
    }

    @Test
    void testRoundTripConversion() {
        double originalCelsius = 37.5;
        double fahrenheit = TemperatureService.celsiusToFahrenheit(originalCelsius);
        double convertedBack = TemperatureService.fahrenheitToCelsius(fahrenheit);
        assertEquals(originalCelsius, convertedBack, 0.001, "Round-trip conversion failed");
    }
}
