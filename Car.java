
package javaapplication2;
    
public class Car extends Features {
   
    public Car( ){
        super ("kia",120);
        
    }
  
     @Override
    public void displayName() {
        System.out.println("Name: " + name);
    }


    @Override
    public void displaySpeed() {
        System.out.println("Car speed: " + speed + " km/h");
    }

}
