package phamminhtien_project;

public  class BingoClass {
	public BingoClass() {
		super();
	}
	public BingoNumber [][] card=new BingoNumber [5][5];
	public boolean winner;
	
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	public void printCard() {
		System.out.println("  B   I   N   G   O" );
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) { 
				if(!this.card[i][j].called) {
					System.out.printf("%3d ",this.card[i][j].number);
				}else {
					System.out.printf(" ** ");
				}
			}
			System.out.print('\n');
		}
	}
	public BingoNumber[][] getCard() {
		return card;
	}
	public void setCard(BingoNumber[][] card) {
		this.card = card;
	}
	public Boolean checkNumber(int numcalled) {
		boolean check =false;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(this.card[i][j].number==numcalled) {
					check=true;
					this.card[i][j].called=true;
				}
			}
		}
		Boolean res=new Boolean(check);
		return res;
	}
	private Boolean checkCol(int i) {
		boolean check=true;
		for(int j=0;j<5;j++) {
			if(this.card[j][i].called==false)check=false;
		}
		return check;
	}
	private Boolean checkRow(int i) {
		boolean check=true;
		for(int j=0;j<5;j++) {
			if(this.card[i][j].called==false)check=false;
		}
		return check;
	}
	private Boolean checkMainDiagonal() {
		boolean check=true;
		for(int i=0;i<5;i++) {
			if(this.card[i][i].called==false)check=false;
		}
		return check;
	}
	private Boolean checkOtherDiagonal() {
		boolean check=true;
		for(int i=0;i<5;i++) {
			if(this.card[4-i][i].called==false)check=false;
		}
		return check;
	}
	public Boolean checkWinner() {
		boolean check=false;
		for(int i=0;i<5;i++) {
			
			if(this.checkCol(i))check=true;
			if(this.checkRow(i))check=true;
		}
		if(this.checkMainDiagonal())check=true;
		if(this.checkOtherDiagonal())check=true;
		if(check)this.winner=true;
		return check;
	}

}
