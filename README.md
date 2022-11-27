# chess

The two important txt files to read are Documentation.txt and Chess Submission Output.txt

The contents of both files are below as well:
-----------------------------------------------------------------------------------------------------------------
Documentation:

The extension work was not done.

Unaltered files: Main,  IllegalMoveException, InvalidPositionException, Position, PieceColor
New files: Pawn, Bishop, Knight, Rook, Queen, King
Altered files: Board, Piece, Player

Overview of changes:
Board: Changed the initialisation of the pieces (i.e. instead of new Piece(arguments...) it is new Rook(arguments...), etc).
Player: References to Piece.KING_VALUE are changed to King.KING_VALUE



Piece: It is now an abstract class.
	The methods changed are:
		validNextPositions(): Now an abstract method. Every case for the switch statement is now put inside the respective class.
				              Therefore, the logic for calculating the valid moves for each piece is unchanged.
		name():  Now an abstract method. It returns this.name (annoyingly just keeping the name method in the Piece class caused it
			     to fail the automated testing, even if it had the same effect and duplicated less code)
		value(): Now an abstract method. Every case for the switch statement is put inside the respective class.
		icon():  Now an abstract method. Every case for the switch statement is put inside the respective class.
		computePawnNextPositions():   This is moved to the Pawn class
		addPawnPositionIfValid():     This is moved to the Pawn class
		computeKnightNextPositions(): This is moved to the Knight class
	The fields changed are:
		this.KING_VALUE: It is now a static field belonging to the class King, not Piece.


New classes:
There is no "original" code; everything was copied and pasted from Piece into the respective class. 

--------------------------------------------------------------------------------------------------------------------
Chess Submission Output


Test harness binary found
Compiled submission found

- Running test declares_icon[Pawn]: Each kind of piece should implement icon()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Pawn.icon()

- Running test declares_name[Pawn]: Each kind of piece should implement name()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Pawn.name()

- Running test declares_validNextPositions[Pawn]: Each kind of piece should implement validNextPositions()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Pawn.validNextPositions()

- Running test declares_value[Pawn]: Each kind of piece should implement value()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Pawn.value()

- Running test hasAncestorClass_withAppropriateAbstractMethods[Pawn]: Each kind of piece should extend a class which has validNextPositions(), icon(), name() and value() as abstract methods

- Running test hasKING_VALUEinCorrectPlace[Pawn]: Should put KING_VALUE in the correct class

- Running test declares_icon[Rook]: Each kind of piece should implement icon()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Rook.icon()

- Running test declares_name[Rook]: Each kind of piece should implement name()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Rook.name()

- Running test declares_validNextPositions[Rook]: Each kind of piece should implement validNextPositions()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Rook.validNextPositions()

- Running test declares_value[Rook]: Each kind of piece should implement value()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Rook.value()

- Running test hasAncestorClass_withAppropriateAbstractMethods[Rook]: Each kind of piece should extend a class which has validNextPositions(), icon(), name() and value() as abstract methods

- Running test hasKING_VALUEinCorrectPlace[Rook]: Should put KING_VALUE in the correct class

- Running test declares_icon[King]: Each kind of piece should implement icon()
- Checking for method declared in class uk.ac.cam.mh2169.chess.King.icon()

- Running test declares_name[King]: Each kind of piece should implement name()
- Checking for method declared in class uk.ac.cam.mh2169.chess.King.name()

- Running test declares_validNextPositions[King]: Each kind of piece should implement validNextPositions()
- Checking for method declared in class uk.ac.cam.mh2169.chess.King.validNextPositions()

- Running test declares_value[King]: Each kind of piece should implement value()
- Checking for method declared in class uk.ac.cam.mh2169.chess.King.value()

- Running test hasAncestorClass_withAppropriateAbstractMethods[King]: Each kind of piece should extend a class which has validNextPositions(), icon(), name() and value() as abstract methods

- Running test hasKING_VALUEinCorrectPlace[King]: Should put KING_VALUE in the correct class

- Running test declares_icon[Queen]: Each kind of piece should implement icon()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Queen.icon()

- Running test declares_name[Queen]: Each kind of piece should implement name()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Queen.name()

- Running test declares_validNextPositions[Queen]: Each kind of piece should implement validNextPositions()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Queen.validNextPositions()

- Running test declares_value[Queen]: Each kind of piece should implement value()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Queen.value()

- Running test hasAncestorClass_withAppropriateAbstractMethods[Queen]: Each kind of piece should extend a class which has validNextPositions(), icon(), name() and value() as abstract methods

- Running test hasKING_VALUEinCorrectPlace[Queen]: Should put KING_VALUE in the correct class

- Running test declares_icon[Knight]: Each kind of piece should implement icon()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Knight.icon()

- Running test declares_name[Knight]: Each kind of piece should implement name()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Knight.name()

- Running test declares_validNextPositions[Knight]: Each kind of piece should implement validNextPositions()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Knight.validNextPositions()

- Running test declares_value[Knight]: Each kind of piece should implement value()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Knight.value()

- Running test hasAncestorClass_withAppropriateAbstractMethods[Knight]: Each kind of piece should extend a class which has validNextPositions(), icon(), name() and value() as abstract methods

- Running test hasKING_VALUEinCorrectPlace[Knight]: Should put KING_VALUE in the correct class

- Running test declares_icon[Bishop]: Each kind of piece should implement icon()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Bishop.icon()

- Running test declares_name[Bishop]: Each kind of piece should implement name()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Bishop.name()

- Running test declares_validNextPositions[Bishop]: Each kind of piece should implement validNextPositions()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Bishop.validNextPositions()

- Running test declares_value[Bishop]: Each kind of piece should implement value()
- Checking for method declared in class uk.ac.cam.mh2169.chess.Bishop.value()

- Running test hasAncestorClass_withAppropriateAbstractMethods[Bishop]: Each kind of piece should extend a class which has validNextPositions(), icon(), name() and value() as abstract methods

- Running test hasKING_VALUEinCorrectPlace[Bishop]: Should put KING_VALUE in the correct class

Pass: 36 out of 36 tests passed
