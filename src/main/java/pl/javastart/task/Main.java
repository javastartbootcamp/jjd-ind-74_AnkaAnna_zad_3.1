package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Furniture furniture1 = new Furniture();
        furniture1.type = "Stolik";
        furniture1.colour = "brązowy";
        furniture1.height = 65.5;
        furniture1.showInfo();

        Furniture furniture2 = new Furniture();
        furniture2.type = "Fotel";
        furniture2.colour = "beżowy";
        furniture2.height = 45.5;
        furniture2.showInfo();
    }
}
