public class Main {
    public static void main(String[] args) {
       Car car = new Car("Ferrari Carrera");
       runRace(car);
       var ferrari = new GasPoweredCar("Ferrari Carrera", 15.4,6);
        runRace(ferrari);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
        System.out.println();
    }
}