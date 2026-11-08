
 
package javaapplication2;
public class Airplane extends Features{
     public Airplane(){
         super("f16",1100);
     }

    @Override
    public void displayName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void displaySpeed() {
        System.out.println("Airplane speed: " + speed + " km/h");
    }
}

