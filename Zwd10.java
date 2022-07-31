//杨辉三角形
import java.util.Scanner;
class Zwd10 {
	public static void main (String [] args){
		System.out.println("请输入到几行:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int [] [] yhsjx = new int [x] [x];
		for (int a=0;a<x;a++){ 
		     yhsjx[a][0] = 1;             //第一列赋值为1
             yhsjx[a][a] = 1;		     //最后一列赋值为1
		     for (int b=1;a>1;b++){
				 	//System.out.println("a:"+a+" b:"+b);
					if(b>a){break;}
				 yhsjx[a][b] =yhsjx[a-1][b-1]+yhsjx[a-1][b];   //给其他赋值
			 }	 	
		}
		for (int a=0;a<x;a++){   //遍历数组
			for (int b=0;b<=a;b++){
				System.out.print(yhsjx[a][b]+"\t");
			}
				System.out.println();
		}
	}
}