package final_exam_2;

public class Detective {
    private int age;
    private String name;

    public Detective(String name, int age) {
        name = name;
        this.age = age;
    }

    public Detective() {
        this("Duke", 43);
    }

    @Override
    public String toString() {
        return this.name + this.age;
    }
}
