package final_exam;

import java.util.ArrayList;

public class Detective {
    private ArrayList<Robot> robots = new ArrayList<>();
    public void buildRobot(int i) {
        String[] colors = {"red", "green", "blue"};
        robots.add(new Robot(colors[i]));
    }

    //select one of the options to insert here
    //(have a look at the last line of code of class Story first)
    @Override
    public String toString() {
        String output =  "Hello, I'm Duke.\n";
        output += "My robots are:\n";
        for (Robot r : robots) {
            output += r.color + "\n";
        }
        return output;
    }
}
