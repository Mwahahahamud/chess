package uk.ac.cam.mh2169.chess;

import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece{

    @Override
    public List<Position> validNextPositions() {

        List<Position> nextPositions = new ArrayList<>();
        computeKnightNextPositions(nextPositions);
        return nextPositions;
    }

    @Override
    public char icon() {
        boolean colourSwitch = pieceColor == PieceColor.BLACK;
        return colourSwitch ? '♞' : '♘';
    }

    @Override
    public int value() {
        return 3;
    }

    @Override
    public char name() {
        return name;
    }

    public Knight(Position piecePosition, PieceColor pieceColor, Board board) {
        super('N', piecePosition, pieceColor, board);
    }

    private void computeKnightNextPositions(List<Position> nextPositions) {
        // directions a knight can travel in.
        final int[][] nextPosDeltas =
                new int[][] {
                        {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
                        {2, 1}, {-2, 1}, {2, -1}, {-2, -1}
                };

        // iterate through all possible positions, getting any valid next positions
        for (int[] posDeltaPair : nextPosDeltas) {
            position.addPosAtDelta(posDeltaPair[0], posDeltaPair[1], board(), nextPositions);
        }
    }
}
