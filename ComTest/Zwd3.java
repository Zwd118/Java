 import java.util.Scanner;
class Zwd3 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ķ���:");
		 int a1 = sc.nextInt();
		 if (a1>0 && a1<=60){System.out.println("������");} else 
		 if (a1>60 && a1<=70){System.out.println("����");}  else
		 if (a1>70 && a1<=80){System.out.println("��");}  else
		 if (a1>80 && a1<=90){System.out.println("��");}  else
		 if (a1>90 && a1<=100){System.out.println("����");}  else
			 {System.out.println("���볬��100����С��0");}
	}
	
}