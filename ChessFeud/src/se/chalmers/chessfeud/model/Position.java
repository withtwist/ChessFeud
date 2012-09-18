package se.chalmers.chessfeud.model;

public class Position {
	private int x, y;
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setNewPos(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setNewPos(Position p){
		this.x = p.getX();
		this.y = p.getY();
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Position){
			Position p = (Position) o;
			if(this.x == p.getX() && this.y == p.getY())
				return true;
		}
		return false;
	}
}
