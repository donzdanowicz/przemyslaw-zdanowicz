package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 1;
        numbers[1] = 15;
        numbers[2] = 4;
        numbers[3] = 11;
        numbers[4] = 5;
        numbers[5] = 9;
        numbers[6] = 84;
        numbers[7] = 63;
        numbers[8] = 6;
        numbers[9] = 12;
        numbers[10] = 5;
        numbers[11] = 44;
        numbers[12] = 15;
        numbers[13] = 19;
        numbers[14] = 45;
        numbers[15] = 1;
        numbers[16] = 15;
        numbers[17] = 6;
        numbers[18] = 17;
        numbers[19] = 10;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(19.35, average);
    }
}
