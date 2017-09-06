package kd;

public class Domino {
	
	private Square leftSquare;
	private Square rightSquare;
	private int number;
	
	public Domino(){
		
	}
	public void printIt(){
		System.out.print(this.leftSquare.getCrowns() + "" + this.leftSquare.getName() + " " + this.rightSquare.getCrowns() + "" + this.rightSquare.getName() + this.number);
	}

	public void setLeft(Square leftSquare){
		this.leftSquare = leftSquare;
	}

	public void setRight(Square rightSquare){
		this.rightSquare = rightSquare;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	public void setLeftCrowns(int num){
		this.leftSquare.setCrowns(num);
	}
	public void setRightCrowns(int num){
		this.rightSquare.setCrowns(num);
	}
	public int getLeftCrowns(){
		return this.leftSquare.getCrowns();
	}
	public int getRightCrowns(){
		return this.rightSquare.getCrowns();
	}
	public int getNumber(){
		return this.getNumber();
	}
	
	
}
