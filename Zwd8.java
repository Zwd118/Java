//99乘法表
import java.util.Scanner;
class Zwd8{
	public static void main (String [] args){
		System.out.println("请输入到几(1-9)：");
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		if (aa>=1 && aa<=9){
		System.out.println("--------------------------------------------------");
		for (int a1=1;a1<=9;a1++){
			for (int a2=1;a2<=a1;a2++){
				System.out.print(a2+"*"+a1+"="+a1*a2+"\t");
			}
			System.out.println();
			if (a1==aa){break;}
			}
			System.out.println("--------------------------------------------------");
		}else{System.out.println("数字录入有误！");}
	    }
		
	}