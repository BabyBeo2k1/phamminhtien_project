package phamminhtien_project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class BingoPlayer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner order= new Scanner(System.in);
		String language = order.next();
		String class_name =order.next();
		String file_card=order.next();
		String file_play=order.next();
		
		try {
			File player_card= new File(file_card);
			Scanner scan_file=new Scanner(player_card);
			BingoNumber [][]a=new BingoNumber[5][5];
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					int data=scan_file.nextInt();
					BingoNumber tmp= new BingoNumber(data);
					a[i][j]=tmp;
				}
			}
		}catch(FileNotFoundException e){
			System.out.println("An error occur: Please enter a valid card file\n");
		}
		
		try {
			File call= new File(file_play);
			Scanner scan_call=new Scanner(call);
			int []call_num;
			while(scan_call.hasNextInt()) {
				int tmp = scan_call.nextInt();
				
			}
		}catch(FileNotFoundException e){
			System.out.println("An error occur: Please enter a valid call file\n");
		}
		
	}

}
