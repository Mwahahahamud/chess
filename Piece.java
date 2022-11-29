/*
 * Copyright 2022 Ben Philps <bp413@cam.ac.uk>, M. Haji
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.mh2169.chess;

import static uk.ac.cam.mh2169.chess.PieceColor.BLACK;
import static uk.ac.cam.mh2169.chess.PieceColor.WHITE;
import static uk.ac.cam.mh2169.chess.Position.Rank.SEVEN;
import static uk.ac.cam.mh2169.chess.Position.Rank.TWO;

import java.util.ArrayList;
import java.util.List;



/*
Changes to fields:
New attribute this.value, which stores the piece's value.
Changes to methods:
validNextPositions(): This is split up and each case is put inside a child class
icon(): This is split up and each case is put inside the child class
computePawnNextPositions(): Put into Pawn class
addPawnPositionIfValid(): Put into Pawn class
computeKnightNextPositions(): Put into Knight class
* */

public abstract class Piece {

//  public static int KING_VALUE = 10000;

  protected Position position;
  protected final PieceColor pieceColor;
  protected final Board board;
  protected final char name;

  public abstract List<Position> validNextPositions();

  public Piece(char name, Position piecePosition, PieceColor pieceColor, Board board) {
    this.name = name;
    this.position = piecePosition;
    this.pieceColor = pieceColor;
    this.board = board;
  }

  /* naming convention:
     K -> king
     P -> pawn
     B -> bishop
     N -> knight
     R -> rook
     Q -> queen
  */

  public abstract char icon();

  
  public abstract int value();
  
 
  public Position position() {
    return position;
  }

  public abstract char name();

  public void moveTo(Position newPosition) {
    position = newPosition;
  }

  public PieceColor colour() {
    return pieceColor;
  }

  public String toString() {
    return name() + " " + position.toString();
  }

  public Board board() {
    return board;
  }
}
