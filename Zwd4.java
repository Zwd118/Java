 import java.util.Scanner;
class Zwd4 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String xq1="";
		while (xq1!="H"){
		System.out.println("������A-G:");
		String xq = sc.next();
		switch (xq) {
		case "A" : System.out.println("����һ");break;
		case "B" : System.out.println("���ڶ�");break;
		case "C" : System.out.println("������");break;
		case "D" : System.out.println("������");break;
		case "E" : System.out.println("������");break;
		case "F" : System.out.println("������");break;
		case "G" : System.out.println("������");break;
		case "H" : xq1="H";System.out.println("�˳�");break;
		default:System.out.println("¼������");break;
		}}
		
	
	}
}