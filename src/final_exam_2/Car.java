package final_exam_2;

public class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Brumm");
    }

    void move(String input) {
        System.out.println(input);
    }
}