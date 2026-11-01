
package javaapplication2;
    
class Car implements Features {
   String name = "Toyota";
    int speed = 210;
    @Override
    public void displayName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void displaySpeed() {
        System.out.println("Car speed: " + speed + " km/h");
    }
}

