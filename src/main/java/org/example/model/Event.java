package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.List;

@ToString
public class Event  {
    String product;
    Statistics stats;
    List<Other> others;



    public List<Other> getOthers() {
        return others;
    }

    public void setOthers(List<Other> others) {
        this.others = others;
    }

    public Event(String product, Statistics stats) {
        this.product = product;
        this.stats = stats;
    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Statistics getStats() {
        return stats;
    }

    public void setStats(Statistics stats) {
        this.stats = stats;
    }


}