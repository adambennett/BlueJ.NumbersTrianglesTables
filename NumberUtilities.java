


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        String toRet = "";
        int loopCheck = start;
        while (loopCheck < stop)
        {
            toRet += loopCheck;
            loopCheck += step;
        }
        return toRet;
    }

    public static String getEvenNumbers(int start, int stop)
    {
        String toRet = "";
        int temp = start;
        while (temp < stop) {
            if (temp%2==0) {
                toRet += temp;
            }
            temp++;
        }
        return toRet;
    }


    public static String getOddNumbers(int start, int stop) {
        String toRet = "";
        int temp = start;
        while (temp < stop) {
            if (temp%2!=0) {
                toRet += temp;
            }
            temp++;
        }
        return toRet;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String toRet = "";
        int temp = start;
        while (temp <= stop)
        {
            toRet += (int)Math.pow(temp, exponent);
            temp++;
        }
        return toRet;
    }
}
