 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String toRet = "";
        for (int i = 0; i < numberOfStars; i++) {
            toRet += "*";
        }
        return toRet;
    }
    
    public static String getTriangle(int numberOfRows) {
        if (numberOfRows < 1) { return ""; }
        String toRet = "";
        for (int i = 1; i <= numberOfRows; i++) {
            toRet += getRow(i) + "\n";
        }
        return toRet;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
