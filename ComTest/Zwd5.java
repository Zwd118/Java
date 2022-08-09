import java.util.Scanner;
class Zwd5{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入结束数字：");
		int aa = sc.nextInt(); 
		int a1=0;
		int a2=0;
		while (a1<=aa){
	      a2+=a1;
		  a1++;
		  
        }
		System.out.println("最后计算结果是:"+a2);
	}
	
}