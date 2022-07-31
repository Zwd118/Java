import java.util.Scanner;

class Zwd2 {
	public static void main (String [ ] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入第一个数字:");
	int a1 = sc.nextInt();
	System.out.println("请输入第二个数字:");
	int a2 = sc.nextInt();
	//System.out.println("请输入第三个数字:");
	//int a3 = sc.nextInt();
	//int a4= a1>a2 ? a1:a2;
	//a4= a4>a3 ? a4:a3;
	//System.out.println("最大值是:"+a1>a2 ? (a1>a3 ? a1:a3):(a2>a3 ? a2:a3));
	if (a1%2==0) {System.out.println("a1是偶数");} else {System.out.println("a1是奇数");}
	if (a2%2==0) {System.out.println("a2是偶数");} else {System.out.println("a2是奇数");}		
	}
	
}