package tictactoe;

import lombok.Data;

@Data
public class Board {

    private Cell[][] board;


    public Board(int size) {
        board = new Cell[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                board[i][j] = new Cell();
            }
        }
    }

    public boolean update(Piece piece, int x, int y){
        //update board if valid else throw exception
        if(x<3 && y <3 && board[x][y] != null){
            board[x][y].setPiece(piece);
            return true;
        }else return false;
    }

    public Result getResult(){
        //check all diagonal
        for(int i=0; i<3; i++){
            if(board[i][0].getPiece() != null && board[i][1].getPiece() != null && board[i][2].getPiece() != null){
                if(board[i][0].getPiece().pieceType == board[i][1].getPiece().pieceType &&
                        board[i][0].getPiece().pieceType == board[i][2].getPiece().pieceType
                ) return Result.win(board[i][0].getPiece().pieceType);
            }
        }

        for(int i=0; i<3; i++){
            if(board[0][i].getPiece() != null && board[1][i].getPiece() != null && board[2][i].getPiece() != null) {
                if (board[0][i].getPiece().pieceType == board[1][i].getPiece().pieceType &&
                        board[0][i].getPiece().pieceType == board[2][i].getPiece().pieceType
                ) return Result.win(board[0][i].getPiece().pieceType);
            }
        }

        //diag 1
        if(board[0][0].getPiece() != null && board[1][1].getPiece() != null && board[2][2].getPiece() != null
                && board[0][0].getPiece().pieceType == board[1][1].getPiece().pieceType &&
                board[0][0].getPiece().pieceType == board[2][2].getPiece().pieceType
        ) return Result.win(board[0][0].getPiece().pieceType);

        //diag 2

        if(board[0][2].getPiece() != null && board[1][1].getPiece() != null && board[2][0].getPiece() != null  &&
                board[0][2].getPiece().pieceType == board[1][1].getPiece().pieceType &&
                board[0][2].getPiece().pieceType == board[2][0].getPiece().pieceType
        ) return Result.win(board[0][2].getPiece().pieceType);

        //check for space left
        int count =0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j].getPiece() == null) count++;
            }
        }
        return count > 0 ? Result.unfinished(): Result.draw();
    }

}
