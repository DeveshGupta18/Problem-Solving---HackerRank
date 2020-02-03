import java.util.*;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        //int sum=0;
        System.out.println(a);
        int countArray[] = new int[a.get(a.size() - 1) + 1];
        for (int i = 0; i < a.size(); i++) {
            countArray[a.get(i)] += 1;
        }
        int result = 0;
        for (int i = countArray.length-1; i>0; i--)
            result = Math.max(result, countArray[i] + countArray[i-1]);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);

        System.out.println(pickingNumbers(a));
    }
}
