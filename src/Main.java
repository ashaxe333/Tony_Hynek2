import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Map map = new Map(2);
        map.fillBoard();
        System.out.println(Arrays.deepToString(map.getBoard()));
        System.out.println(map);
        Move move = new Move();
        move.playerMove(map,1,1);
        System.out.println(Arrays.deepToString(map.getBoard()));
        map.write();
    }
}