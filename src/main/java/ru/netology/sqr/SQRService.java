package ru.netology.sqr;

public class SQRService {


    public int numberOfSquares(int minimumValue, int maximumValue) {


        int counter = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= minimumValue && i * i <= maximumValue) {
                counter++;

            }
        }

        return counter;

    }


}
