import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {

        int[] arA = new int[]{5, 6, 7};

        int[] arB = new int[]{3, 6, 10};

        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < arA.length && i < arB.length; i++) {
            if (arA[i] > arB[i]) {
                counterA++;
            } else if (arB[i] > arA[i]) {
                counterB++;
            }
        }
        System.out.println(counterA + " " + counterB);
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < a.size() && i < b.size(); i++) {

            if (a.get(i) > b.get(i)) {
                counterA++;
            } else if (b.get(i) > a.get(i)) {
                counterB++;
            }
        }
        List<Integer> finalArr = new ArrayList<>();
        finalArr.add(counterA);
        finalArr.add(counterB);
        return finalArr;
    }
}
