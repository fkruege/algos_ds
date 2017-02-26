package interviews;

/**
 * Created by fkruege on 2/17/2017.
 */
public class Car {

    private String _carName = "";

    public Car(String carName){
        _carName = carName;
    }

    public String getCarName(){
        return _carName;
    }

    public static void main(String[] args){
        Car car = new Car("Oldsmobile");
        upgradeCar(car);
        System.out.println("Car name: " + car.getCarName());
    }

    public static void upgradeCar(Car car){
        car = new Car("Tesla");
    }


}
