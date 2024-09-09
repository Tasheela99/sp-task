import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {
    public static void main(String[] args) {
        String[] strList = new String[]{"A", "B", "C", "D", "E"};
        int[] intList = new int[]{1, 3, 5, 7, 9};
        ProblemTwo problem = new ProblemTwo();
        List<Object> combinedList = problem.combineAlternating(strList,intList);
        System.out.println("Combined list: " + combinedList);
    }

    private List<Object> combineAlternating(String[] strList,int[] intList) {
        List<Object> combinedList = new ArrayList<>();
        int maxLength = Math.max(intList.length, strList.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < strList.length) {
                combinedList.add(strList[i]);
            }

            if (i < intList.length) {
                combinedList.add(intList[i]);
            }

        }
        return combinedList;
    }
}
