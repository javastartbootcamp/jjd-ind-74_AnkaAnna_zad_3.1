package pl.javastart.task;

import java.sql.SQLOutput;

public class Furniture {
    String type;
    String colour;
    double height;

    public Furniture(String type, String colour, double height) {
        this.type = type;
        this.colour = colour;
        this.height = height;
    }

    void showInfo() {
        System.out.println("W pokoju znajduje się mebel: "
                 + type + ", ma kolor: " + colour
                 + " oraz wysokość: " + height);
    }
}
