package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Stolik", "brązowy", 65.5);
        furniture1.showInfo();

        Furniture furniture2 = new Furniture("Fotel", "beżowy", 45.5);
        furniture2.showInfo();
    }
}
