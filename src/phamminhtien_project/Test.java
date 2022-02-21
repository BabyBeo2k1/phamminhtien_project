package phamminhtien_project;

public class Test  {
	
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int [][] a=new int [5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=i*j+j;
			}
		}
		BingoClass test=new BingoClass();
		test.setCard(a);
		System.out.println("hello");
		System.out.println(test.card[1][1]);
		test.printCard();
	}

}
