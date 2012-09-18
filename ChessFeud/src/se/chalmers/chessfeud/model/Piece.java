package se.chalmers.chessfeud.model;

public abstract class Piece {
	private int team;
	private Position pos;
	
	protected Piece(int team, Position p){
		this.team = team;
		this.pos = p;
	}

	public abstract Position[] canMove();
	
	public boolean move(Position position){
		Position[] validPositions = canMove();
		for(Position p : validPositions)
			if(p.equals(position))
				return true;
		return false;
	}
	
	public int getTeam(){
		return this.team;
	}
	
	public Position getPosition(){
		return pos;
	}
	
	protected void setNewPos(Position p){
		this.pos = p;
	}
}
