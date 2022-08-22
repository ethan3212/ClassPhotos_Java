package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> redShirtHeights = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));
        System.out.println(classPhotos(redShirtHeights, blueShirtHeights));     // O(nLog(n) + mLog(m)) time | O(1) space
    }

    // O(nLog(n) + mLog(m)) time | O(1) space
    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights);      // O(nLog(n)) time
        Collections.sort(blueShirtHeights);     // O(nLog(n)) time
        String frontRowColor = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "Red" : "Blue";
        for(int i = 0; i < redShirtHeights.size(); i++) {       // O(n) time
            if(frontRowColor.equals("Red")) {
                if(redShirtHeights.get(i) >= blueShirtHeights.get(i)) {
                    return false;
                }
            } else {
                if(blueShirtHeights.get(i) >= redShirtHeights.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}