
 
package javaapplication2;
class Airplane implements Features {
      String name = "Boeing";
    int speed = 9100;

    @Override
    public void displayName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void displaySpeed() {
        System.out.println("Airplane speed: " + speed + " km/h");
    }
}

