package final_exam_3;

import java.util.Random;

public class Road {
    public static final String RIGHT = "right";
    public static final String LEFT = "left";
    public static final String BLOCKED = "blocked";
    public static final String STRAIGHT = "straight";
    private String[] course = {RIGHT, LEFT, BLOCKED, STRAIGHT};

    private String determineCourse() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return course[n];
    }

    public boolean isStraight() {
        return this.determineCourse().equals(Road.STRAIGHT);
    }

    public boolean isBlocked() {
        return this.determineCourse().equals(Road.BLOCKED);
    }

    public boolean turnsRight() {
        return this.determineCourse().equals(Road.RIGHT);
    }

    public boolean turnsLeft() {
        return this.determineCourse().equals(Road.LEFT);
    }
}
