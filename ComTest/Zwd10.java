//���������
import java.util.Scanner;
class Zwd10 {
	public static void main (String [] args){
		System.out.println("�����뵽����:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] [] yhsjx = new int [x] [x];
		for (int a=0;a<x;a++){ 
		     yhsjx[a][0] = 1;             //��һ�и�ֵΪ1
             yhsjx[a][a] = 1;		     //���һ�и�ֵΪ1
		     for (int b=1;a>1;b++){
				 	//System.out.println("a:"+a+" b:"+b);
					if(b>a){break;}
				 yhsjx[a][b] =yhsjx[a-1][b-1]+yhsjx[a-1][b];   //��������ֵ
			 }	 	
		}
		for (int a=0;a<x;a++){   //��������
			for (int b=0;b<=a;b++){
				System.out.print(yhsjx[a][b]+"\t");
			}
				System.out.println();
		}
	}
}