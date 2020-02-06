 
import java.util.*;
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize)
    {
        String toRet = "";
        ArrayList<String> tester = new ArrayList<>();
        for (int i = 1; i < tableSize + 1; i++)
        {
            for (int k = 1; k < tableSize + 1; k++)
            {
                int res = (i * k);
                if (res > 99) {
                    tester.add("" + (i * k) + " |");
                }
                else if (res > 9) {
                    tester.add(" " + (i * k) + " |");
                }
                else {
                    tester.add("  " + (i * k) + " |");
                }
            }
            tester.add("\n");
        }
        for (String s : tester) {
            toRet += s;
        }
        System.out.println(toRet);
        return toRet;
    }
}
