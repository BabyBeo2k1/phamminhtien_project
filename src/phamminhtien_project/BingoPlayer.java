package phamminhtien_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class BingoPlayer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Format command as: java BingoPlayer <file_card> <file_play>:");
			Scanner order= new Scanner(System.in);
			String language=order.next();
			String class_name=order.next();
			String file_card=order.next();
			String file_play=order.next();
		
		ArrayList<BingoClass> cards= new ArrayList<BingoClass>();
		try{
			File player_card= new File(file_card);
		
			Scanner scan_file=new Scanner(player_card);
			
		
			while(scan_file.hasNext()) {
				BingoNumber [][]a=new BingoNumber[5][5];
				for(int i=0;i<5;i++) {
					for(int j=0;j<5;j++) {
						int data=scan_file.nextInt();
						BingoNumber tmp= new BingoNumber(data);
						a[i][j]=tmp;
					}
				}
				BingoClass tmp_card= new BingoClass();
				tmp_card.setCard(a);
				cards.add(tmp_card);
			}
		}catch(FileNotFoundException e) {
			System.out.println ("An error occur at card file:");
			e.printStackTrace();
		}
		
		ArrayList<BingoNumber> player_call_order=new ArrayList<BingoNumber>();
		try {
			File call= new File(file_play);
			Scanner scan_call=new Scanner(call);
			while(scan_call.hasNextInt()) {
				int tmp =scan_call.nextInt();
				BingoNumber tmp_pco=new BingoNumber(tmp);
				player_call_order.add(tmp_pco);
			}
		}catch(FileNotFoundException e){
			System.out.println("An error occur at calling file: ");
			e.printStackTrace();
		}
		for(int i=0;i<player_call_order.size();i++) {
			for(int j=0;j<cards.size();j++) {
				if(!cards.get(j).isWinner()) {
					cards.get(j).checkNumber(player_call_order.get(i).getNumber());
					cards.get(j).checkWinner();
					if(cards.get(j).isWinner()) {
						System.out.printf("the card number %d has won at call number %d\n",j,i);
						cards.get(j).printCard();
					}
				}
			}
		}
	}

}
