package com.example.decorator.decorators;

import com.example.decorator.cakes.Cake;

public class SugarDecorator extends CakeDecorator {
    public SugarDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public Integer getPrice(){
        return cake.getPrice()+4;
    }
}
