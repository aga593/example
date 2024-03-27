public class ToTable {
    int[] data ;
    int x , y ;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        int[][] dwuhmerny = new int[x][y];
        int st = 0;
        for (int i = 0 ; i < x ; i++) {
            for (int j = st ; j < st + y ; j++){
                dwuhmerny[i][j - st] = data[j];
            }
            st += y;
        }
        return dwuhmerny;
    }

}
