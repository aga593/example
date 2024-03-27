public class ToLine {
    int[][] data ;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        int[] res = new int[data.length * data[0].length];
        int x = 0;
        for (int i = 0 ; i < data.length ; i++) {
            int[] dat = data[i];
            for (int j = 0 ; j < dat.length ; j++) {
                res[x + j] = dat[j];
            }
            x += dat.length;
        }
        return res;
    }
}
