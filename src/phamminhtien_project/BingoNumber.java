package phamminhtien_project;

public  class BingoNumber {
	public BingoNumber(int number) {
		super();
		this.number = number;
	}
	public String representation;
	public int number;
	public char letter;
	public boolean called=false;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public char getLetter() {
		return letter;
	}
	public void setLetter() {
		int a=(this.number-1)/15;
		switch(a) {
			case 1:
				this.letter='B';
				break;
			case 2:
				this.letter='I';
				break;
			case 3:
				this.letter='N';
				break;
			case 4:
				this.letter='G';
				break;
			case 5:
				this.letter='O';
				break;
			}
		
	}
	public boolean isCalled() {
		return called;
	} 
	public void setCalled(boolean called) {
		this.called=called;
	}
	public String getRepresentation() {
		return representation;
	}
	public void setRepresentation() {
		String a= this.letter+ " "+ String.valueOf(this.number);
		this.representation =a;
		if(this.called)this.representation+=" *";
	}
	
}