public class Separator {
    private int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    int[] even() {
        int x = 0, y = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] % 2 == 0) x++;
        }
        int[] even = new int[x];
        for (int i =0 ; i < array.length ; i++){
            if (array[i] % 2 == 0) {
                even[y] = array[i];
                y++;
            }
        }
        return even;
    }

    int[] odd() {
        int w = 0, z = 0;

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] % 2 != 0) w++;
        }
        int[] odd = new int[w];
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] % 2 != 0) {
                odd[z] = array[i];
                z++;
            }
        }
        return odd;
    }

}
