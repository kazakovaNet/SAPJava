package final_exam_3;

public class Car extends Vehicle implements Steerable {
    private Chassis chassis;
    private Engine engine;

    public Car(String color, int horsepower) {
        chassis = new Chassis(color);
        engine = new Engine(horsepower);
    }

    public String getColor() {
        return chassis.getColor();
    }

    public int getHorsepower() {
        return engine.getHorsepower();
    }

    public void switchEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void left() {
        System.out.println("to the left");
    }

    @Override
    public void right() {
        System.out.println("to the right");
    }

    @Override
    public void move() {
        System.out.println("forward");
    }

    @Override
    public void stop() {
        System.out.println("waiting");
    }
}
