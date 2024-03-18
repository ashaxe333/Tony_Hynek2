import java.util.Arrays;

public class Map {

    private int sizeX;

    private char X = 'X';
    private char O = 'O';
    private char N = ' ';
    private char[][] board;

    public Map(int sizeX) {
        setSizeX(sizeX);
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        if(sizeX < 3){
            this.sizeX = 3;
        } else if (sizeX > 50) {
            this.sizeX = 50;
        } else {
            this.sizeX = sizeX;
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public void fillBoard(){
        board = new char[sizeX][sizeX];
        for (char[] row: board){
            Arrays.fill(row, N);
        }

    }

    @Override
    public String toString() {
        return "Map{" +
                "sizeX=" + sizeX +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
