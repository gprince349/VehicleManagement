package tictactoe;

import lombok.Data;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

@Data
public class GameControl {
    private Deque<Player> players;
    private Board board;

    public GameControl(){
        board = new Board(3);
        players = new ArrayDeque<>();
        players.addFirst(new Player(new PieceX(), "X"));
        players.addFirst(new Player(new PieceO(), "O"));
    }

    void startGame(){

        while(board.getResult().getState() == GameState.UNFINISHED){

            Player player = players.getFirst();
            //print turn

            //input
            System.out.println("Enter x y for "+ player.getName() + " ");
            Scanner scanner = new Scanner(System.in);
            int x= scanner.nextInt();
            int y= scanner.nextInt();

            //update board
            boolean isSuccessful = board.update(player.getPiece(), x, y);
            //validate result
            if(!isSuccessful){
                System.out.println("Enter correct position");
                continue;
            }

            players.removeFirst();
            players.addLast(player);
        }

        System.out.println(board.getResult());
    }

}
