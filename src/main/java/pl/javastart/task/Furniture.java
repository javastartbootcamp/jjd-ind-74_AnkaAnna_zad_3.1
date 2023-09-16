package pl.javastart.task;

public class Furniture {
        String type;
        String colour;
        double height;
        void showInfo () {
            System.out.println("W pokoju znajduje się mebel: "
                    + type + ", ma kolor: " + colour
                    + " oraz wysokość: " + height);
        }
}
