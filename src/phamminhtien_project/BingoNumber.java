package phamminhtien_project;

public  class BingoNumber {
	public BingoNumber(int number) {
		super();
		this.number = number;
	}
	public String representation;
	public int number;
	public char letter;
	public boolean called;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public boolean isCalled() {
		return called;
	}
	public void setCalled() {
		int a=(this.number-1)/15;
		switch(a) {
		case 1:
			if(this.letter=='B')this.called=true;
			break;
		case 2:
			if(this.letter=='I')this.called=true;
			break;
		case 3:
			if(this.letter=='N')this.called=true;
			break;
		case 4:
			if(this.letter=='G')this.called=true;
			break;
		case 5:
			if(this.letter=='O')this.called=true;
			break;
		default:
			this.called= false;
		}
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