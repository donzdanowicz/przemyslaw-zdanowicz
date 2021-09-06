package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
