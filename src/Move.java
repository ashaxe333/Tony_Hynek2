public class Move {
    private char X = 'X';
    private char O = 'O';
    private int count=1;

    public Move() {
    }
    public void playerMove(Map board,int x,int y){
            if ((x-1 > board.getBoard().length||y-1 > board.getBoard().length )&&(x-1 < board.getBoard().length||y-1 < board.getBoard().length )) {
                throw new IllegalArgumentException();
            }else {
                if (count%2==0){
                    board.getBoard()[x-1][y-1] = O;
                    count++;
                }else{
                    board.getBoard()[x-1][y-1] = X;
                    count++;
                }

            }
        }

    }
