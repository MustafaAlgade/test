
package javaapplication2;
public class Human  extends Features {
    public Human( ){
        super ("Mustafa",10);
        
    }
    @Override
    public void displayName() {
        System.out.println("Name: " + name);
    }

    @Override
    public void displaySpeed() {
        System.out.println("Human speed: " + speed + " km/h");    }

    
}
