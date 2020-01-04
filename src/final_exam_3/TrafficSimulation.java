package final_exam_3;

public class TrafficSimulation {
    public static void main(String[] args) {
        Road road = new Road();
        Car car = new Car("green", 120);
        Driver duke = new Driver();
        TrafficSimulation.run(road, car, duke);
    }

    private static void run(Road road, Car car, Driver driver) {
        while (true) {
            //in real life, we would need a way to stop
            //the simulation
            driver.drive(car, road);
        }
    }
}
