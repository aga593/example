/*public class Squirrel {
    int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {
        return nuts[index];
    }

    public int maxNuts() {
        if (nuts.length > 1) {
            int[] arr = nuts.clone();
            arr[1] = max(arr[1], arr[0] + arr[1]);
            if (arr[1] < 0) arr[1] = 0;
        }
    }

    public static int max(int a, int b) {
        if (a >= b) return a;
        return b;
    }

}
*/