package phamminhtien_project;

public  class BingoClass {
	public BingoClass() {
		super();
	}
	public int [][] card=new int [5][5];
	public boolean winner;
	public int[][] getCard() {
		return card;
	}
	public void setCard(int[][] card) {
		this.card = card;
	}
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	public void printCard() {
		System.out.println("  B  I  N  G  O" );
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) { 
				System.out.printf("%3d",this.card[i][j]);
			}
			System.out.print('\n');
		}
	}
}
