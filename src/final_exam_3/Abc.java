package final_exam_3;

public class Abc {
    static int result = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(count(i));
        }
    }

    static int count(int number) {
        return result += number;
    }
}
