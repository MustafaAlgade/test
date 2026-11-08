
package javaapplication2;

public class Features {
    String name;
    int speed;

    public Features(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}
