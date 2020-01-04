package java1_HashMap_Exercise_1;

import java.util.HashMap;

class Door {
    private HashMap<String, AccessCode> doorCodes = new HashMap<>();

    public void addDoorKey(String key, AccessCode value) {
        doorCodes.put(key, value);
    }

    public HashMap<String, AccessCode> getDoorCodes() {
        return doorCodes;
    }

    public void useCode(String key) {
        AccessCode accessCode;

        if (doorCodes.containsKey(key)) {
            accessCode = doorCodes.get(key);

            accessCode.setNumberOfTimesUsed(accessCode.getNumberOfTimesUsed() + 1);

            if (accessCode.getNumberOfTimesUsed() > 2) {
                accessCode.setValid(false);

                System.out.println("AccessCode no longer valid");
            } else {
                System.out.println("AccessCode valid");

            }
        } else {
            System.out.println("AccessCode invalid");
        }
    }
}
