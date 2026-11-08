
package javaapplication2;



    public class Ship extends Features {
    public Ship() {
        super("Titanic", 40);
    }

    @Override
    public void displaySpeed() {
        System.out.println("Ship speed: " + speed + " km/h");
    }
}

