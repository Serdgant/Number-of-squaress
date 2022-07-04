package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shoudNumberOfSquares() {
        SQRService service = new SQRService();
        int minimumValue = 100;
        int maximumValue = 300;
        int expected = 8;
        int actual = service.numberOfSquares(minimumValue, maximumValue);
        assertEquals(expected, actual);
    }

    @Test
    void shoudNumberOfSquaresMinimum() {
        SQRService service = new SQRService();
        int minimumValue = 10;
        int maximumValue = 100;
        int expected = 1;
        int actual = service.numberOfSquares(minimumValue, maximumValue);
        assertEquals(expected, actual);
    }

    @Test
    void shoudNumberOfSquaresMinimumValueBoundary() {
        SQRService service = new SQRService();
        int minimumValue = 10;
        int maximumValue = 99;
        int expected = 0;
        int actual = service.numberOfSquares(minimumValue, maximumValue);
        assertEquals(expected, actual);
    }

}