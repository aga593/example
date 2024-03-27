public class LimitingRectangle {
    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    int getMin(int ind) {
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < points.length ; i++) {
            if (points[i][ind] <= min) min = points[i][ind];
        }
        return min;
    }

    int getMax(int ind) {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < points.length ; i++) {
            if (points[i][ind] >= max) max = points[i][ind];
        }
        return max;
    }

    int getWidth() {
        return this.getMax(0) - this.getMin(0);
    }

    int getHeight() {
        return this.getMax(1) - this.getMin(1);
    }

    String getBorders() {
        String str = "нижняя точка по Y, " + getMin(1) + " верхняя точка по Y, " + getMax(1) + " левая точка по Х, " + getMin(0) + " правая точка по Х " + getMax(0);
        return str;
    }
}
