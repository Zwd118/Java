 import java.util.Scanner;
class Zwd3 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生的分数:");
		 int a1 = sc.nextInt();
		 if (a1>0 && a1<=60){System.out.println("不及格");} else 
		 if (a1>60 && a1<=70){System.out.println("及格");}  else
		 if (a1>70 && a1<=80){System.out.println("良");}  else
		 if (a1>80 && a1<=90){System.out.println("好");}  else
		 if (a1>90 && a1<=100){System.out.println("优秀");}  else
			 {System.out.println("输入超出100或者小于0");}
	}
	
}