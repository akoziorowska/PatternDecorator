package com.example.decorator;

import com.example.decorator.cakes.BrownCake;
import com.example.decorator.cakes.Cake;
import com.example.decorator.cakes.WhiteCake;
import com.example.decorator.decorators.CakeDecorator;
import com.example.decorator.decorators.FruitDecorator;
import com.example.decorator.decorators.IceDecorator;
import com.example.decorator.decorators.SugarDecorator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);

        Cake whiteCake = new WhiteCake();
        System.out.println("cena bialego ciastka wynosi"+whiteCake.getPrice() +"a z lodami="+new IceDecorator(whiteCake).getPrice());
        whiteCake = new SugarDecorator(whiteCake);
        System.out.println("cena bialego ciastka z cukrem="+whiteCake.getPrice());
        whiteCake=new IceDecorator((whiteCake));
        System.out.println("cena bialego ciastka z cukrem i lodem="+ whiteCake.getPrice());

        Cake brownCake = new BrownCake();
        brownCake = new SugarDecorator(brownCake);
        brownCake = new IceDecorator(brownCake);
        brownCake = new FruitDecorator(brownCake);
        System.out.println("cena brazowego ze wszelkimi mozliwymi dodatkami: "+ brownCake.getPrice());
    }
}
