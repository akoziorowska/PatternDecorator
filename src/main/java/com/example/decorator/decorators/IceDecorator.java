package com.example.decorator.decorators;

import com.example.decorator.cakes.Cake;

public class IceDecorator extends CakeDecorator {
    public IceDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public Integer getPrice(){
        return cake.getPrice()+7;
    }
}
