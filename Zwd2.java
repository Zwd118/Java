import java.util.Scanner;

class Zwd2 {
	public static void main (String [ ] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("�������һ������:");
	int a1 = sc.nextInt();
	System.out.println("������ڶ�������:");
	int a2 = sc.nextInt();
	//System.out.println("���������������:");
	//int a3 = sc.nextInt();
	//int a4= a1>a2 ? a1:a2;
	//a4= a4>a3 ? a4:a3;
	//System.out.println("���ֵ��:"+a1>a2 ? (a1>a3 ? a1:a3):(a2>a3 ? a2:a3));
	if (a1%2==0) {System.out.println("a1��ż��");} else {System.out.println("a1������");}
	if (a2%2==0) {System.out.println("a2��ż��");} else {System.out.println("a2������");}		
	}
	
}