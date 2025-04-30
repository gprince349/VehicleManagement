package tictactoe;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Cell {
    private Piece piece;

    public boolean isEmpty(){
        return piece == null;
    }
}
