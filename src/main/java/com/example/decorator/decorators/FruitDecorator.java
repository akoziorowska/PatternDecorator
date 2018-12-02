package com.example.decorator.decorators;

import com.example.decorator.cakes.Cake;

public class FruitDecorator extends CakeDecorator {

    public FruitDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public Integer getPrice(){
        return cake.getPrice()+5;
    }
}
