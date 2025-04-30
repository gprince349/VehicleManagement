package tictactoe;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private GameState state;
    private PieceType winner;

    public static Result win(PieceType winner){
        return new Result(GameState.WINNER, winner);
    }

    public static Result draw() {
        return new Result(GameState.DRAW, null);
    }

    public static Result unfinished() {
        return new Result(GameState.UNFINISHED, null);
    }

    @Override
    public String toString() {
        if (state == GameState.WINNER) {
            return "Winner: " + winner;
        } else if (state == GameState.DRAW) {
            return "Game ended in a draw.";
        } else {
            return "Game is still unfinished.";
        }
    }
}
