package java1_ArrayLists_and_HashMaps_Exercise_2;

import java.util.ArrayList;
import java.util.HashMap;

class Bookshelf {
    private ArrayList<Clue> usedClues = new ArrayList<>();
    private ArrayList<Clue> unusedClues = new ArrayList<>();
    private HashMap<String, ArrayList<Clue>> clueHashMap;
    
    public void saveClues(ArrayList<Clue> clues){
        for(Clue clue : clues){
            if(clue.getUsed()){
                usedClues.add(clue);
            } else {
                unusedClues.add(clue);
            }
        }
    }

	void buildHashMap() {
	    clueHashMap = new HashMap();
	    clueHashMap.put("used", usedClues);
	    clueHashMap.put("unused", unusedClues);
	}
	
	
	// please just leave this code as it is,
	// it helps you to get an output if you run your code.
	// Also, it might server as a reference for using a foreach loop. ;-)
	void printHashMap(){
	    for (String key : clueHashMap.keySet()){
	        System.out.println("The clue list \""  + key + "\" contains the clues:");
	        for(Clue clue : clueHashMap.get(key)){
	            System.out.println("\t" + clue);
	        }
	    }
	}

}
