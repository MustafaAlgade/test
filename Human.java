
package javaapplication2;
public class Human  implements Features {
      String name = "Ahmed";
    int speed = 6;

    @Override
    public void displayName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void displaySpeed() {
        System.out.println("Human speed: " + speed + " km/h");    }

    
}
