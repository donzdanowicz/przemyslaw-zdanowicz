package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("1111111111"));
        Country germany = new Country("Germany", new BigDecimal("2222222222"));
        Country france = new Country("France", new BigDecimal("3333333333"));
        Country usa = new Country("USA", new BigDecimal("4444444444"));
        Country mexico = new Country("Mexico", new BigDecimal("5555555555"));
        Country niger = new Country("Niger", new BigDecimal("6666666666"));
        Country egypt = new Country("Egypt", new BigDecimal("7777777777"));
        Country china = new Country("China", new BigDecimal("8888888888"));
        Country japan = new Country("Japan", new BigDecimal("9999999999"));

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent northAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        northAmerica.addCountry(usa);
        northAmerica.addCountry(mexico);
        africa.addCountry(niger);
        africa.addCountry(egypt);
        asia.addCountry(china);
        asia.addCountry(japan);

        World world = new World();

        world.add(europe);
        world.add(africa);
        world.add(northAmerica);
        world.add(asia);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("49999999995");
        assertEquals(expectedPeopleQuantity, totalPeopleQuantity);



    }
}
