package uk.ac.cam.mh2169.chess;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece{
    static public int KING_VALUE = 10000;
    public King(Position piecePosition, PieceColor pieceColor, Board board) {
        super('K', piecePosition, pieceColor, board);
    }

    @Override
    public List<Position> validNextPositions() {
        List<Position> nextPositions = new ArrayList<>();
        position.getAllDiagonalMoves(1, board(), nextPositions);
        position.getAllStraightMoves(1, board(), nextPositions);
        return nextPositions;
    }

    @Override
    public char icon() {
        boolean colourSwitch = pieceColor == PieceColor.BLACK;
        return colourSwitch ? '♚' : '♔';
    }

    @Override
    public int value() {
        return King.KING_VALUE;
    }

    @Override
    public char name() {
        return name;
    }
}
