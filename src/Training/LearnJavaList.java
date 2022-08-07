package Training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;


public class LearnJavaList {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        HashMap<Integer, Integer> myHash = new HashMap<>();

        for (int i = 5; i > 0; i--) {
            myList.add(i);
            myHash.put(i, new Random().nextInt());
        }

        for (int list : myList) {
            System.out.println(list);
        }
        System.out.println(myList);

        for (int i = 0; i < myHash.size(); i++) {
            System.out.println(myHash.get(i));
        }

        Collections.sort(myList);
        System.out.println(myList);
    }
}
