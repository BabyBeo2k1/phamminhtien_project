package phamminhtien_project;

public class Test  {
	
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		BingoNumber [][] a=new BingoNumber [5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				BingoNumber tmp=new BingoNumber(i*j+j);
				a[i][j]=tmp;
				if(i==j) {
					a[i][j].called=true;
				}
			}
		}
		if(a[4][1].called)System.out.println("its work");
		BingoClass test=new BingoClass();
		test.setCard(a);
		System.out.println("hello");
		System.out.println(test.card[1][1]);
		if(test.card[4][1].called)System.out.println("its work");
		test.printCard();
		test.winner=test.checkWinner();
		Boolean res= test.checkWinner();
		if(res.booleanValue()) {
			System.out.println("you won");
		}else {
			System.out.println("you lost");
		}
		
	}

}
