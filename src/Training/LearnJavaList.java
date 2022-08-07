package Training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LearnJavaList {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        HashMap<Integer, Integer> myHash = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            myList.add(i);
            myHash.put(i, new Random().nextInt());
        }

        for (int list : myList) {
            System.out.println(list);
        }

        for (int i = 0; i < myHash.size(); i++) {
            System.out.println(myHash.get(i));
        }


    }
}
