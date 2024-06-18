package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics {
    private double price;

    @Override
    public String toString() {
        return "Statistics{" +
                "price=" + price +
                '}';
    }
}