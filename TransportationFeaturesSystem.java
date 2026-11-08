package javaapplication2;
public class TransportationFeaturesSystem { 
    public static void main(String[] args){

        Car car = new Car();
        Airplane airplane = new Airplane();
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        Ship ship = new Ship();

        car.displayName();
        car.displaySpeed();

        airplane.displayName();
        airplane.displaySpeed();

        human.displayName();
        human.displaySpeed();

        bicycle.displayName();
        bicycle.displaySpeed();

        ship.displayName();
        ship.displaySpeed();
    }
}




