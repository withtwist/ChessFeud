package se.chalmers.chessfeud.model;

public class ChessModel {
	private ChessBoard chessBoard;
	private int turn;
	
	public ChessModel(){
		chessBoard = new ChessBoard();
		turn = 0;
	}
	
	private void changeTurn(){
		turn = (turn+1)%2;
	}
	
	
}
