package se.chalmers.chessfeud.model;

public class ChessBoard {
	private Piece[][] board;
	
	public ChessBoard(){
		board = new Piece[8][8];
		for(int x = 0; x < board.length; x++)
			for(int y = 0; y < board[x].length; y++)
				board[x][y] = Rules.startBoard(x, y);
	}
	
	public Piece getPiece(Position p){
		return board[p.getX()][p.getY()];
	}
	
	public boolean isMoveLegal(Piece piece, Position pos){
		return false;
	}
	
	
}
