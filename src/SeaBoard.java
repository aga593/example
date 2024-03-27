public class SeaBoard {
    private String[][] field;

    public SeaBoard() {
        field = new String[10][10];
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                field[i][j] = ".";
            }
        }
    }

    public String[][] getField() {
        return field;
    }

    public void shoot(int line, int column, String issue) {
        if (issue.equals("m")) field[line][column] = "#";
        else if (issue.equals("h")) field[line][column] = "x";
        else if (issue.equals("d")) {
            int[][] vokrug = new int[][] {{line - 1, column}, {line + 1, column},
                                         {line, column - 1}, {line, column + 1},
                                         {line - 1, column - 1}, {line - 1, column + 1},
                                         {line + 1, column - 1}, {line + 1, column + 1}};

            for (int[] i : vokrug) {
                if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals(".") ) {
                    field[i[0]][i[1]] = "#";
                }
            }
            field[line][column] = "x";
        }
    }

    String check(int line, int column) {
        return field[line][column];
    }

}
