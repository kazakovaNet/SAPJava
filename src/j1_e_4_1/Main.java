package j1_e_4_1;

public class Main {
    public static void main(String[] args) {
        Robot robby = new Robot("Robby", 2015);
        //step1
        System.out.println(robby.showDetails());
        robby.inspection(2018);
        //step2
        System.out.println(robby.showDetails());
    }
}
