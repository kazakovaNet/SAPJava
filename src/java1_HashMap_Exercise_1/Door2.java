package java1_HashMap_Exercise_1;

import java.util.HashMap;

class Door2 {
    HashMap<String, AccessCode> doorCodes = new HashMap();

    public void addDoorKey(String key, AccessCode value) {
        doorCodes.put(key, value);
    }

    public void useCode(String key) {
        if (!doorCodes.containsKey(key)) {
            System.out.println("AccessCode invalid");
            return;
        }

        AccessCode code = doorCodes.get(key);
        code.setNumberOfTimesUsed(code.getNumberOfTimesUsed() + 1);

        if (code.getNumberOfTimesUsed() > 2) {
            System.out.println("AccessCode no longer valid");
            code.setValid(false);
        } else {
            System.out.println("AccessCode valid");
        }
    }

    public HashMap<String, AccessCode> getDoorCodes() {
        return doorCodes;
    }
}
