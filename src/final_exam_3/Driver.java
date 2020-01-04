package final_exam_3;

public class Driver {
    public Driver() {
    }

    public void drive(Car car, Road road) {
        if (road.isStraight()) {
            car.move();
        } else if (road.isBlocked()) {
            car.stop();
        } else if (road.turnsLeft()) {
            car.left();
        } else if (road.turnsRight()) {
            car.right();
        }
    }
}