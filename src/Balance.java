public class Balance {

    static int r = 0;
    static int l = 0;

    void addRight(int n) {
        r += n ;
    }

    void addLeft(int n) {
        l += n ;
    }

    public static String getSituation() {
        String result = "=";
        if (r > l) result = "R";
        else if (l > r) result = "L";
        else return result;
        return result;
    }

}

