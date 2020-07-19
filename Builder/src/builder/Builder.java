package builder;

import builder.example.Pizza;
import builder.exercise.Block;

import java.awt.*;

public class Builder {

    public static void main(String[] args) {
        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 50).addChees(true)
                .addSauce(true).takeaway(true).build();
        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 42).addChees(true)
                .addSauce(false).takeaway(false).build();
        System.out.println(margharita);
        System.out.println(capriciosa);

        //Block square = new Block.BlockBuilder("Square").setShape("Square").setColor(Color.RED).setPenWidth(10).build();
        //Block circle = new Block.BlockBuilder("Circle").setColor(Color.GREEN).setPenWidth(20).build();
        //System.out.println(square);
        //System.out.println(circle);
    }
}
