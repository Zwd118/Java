 import java.util.Scanner;
class Zwd4 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		String xq1="";
		while (xq1!="H"){
		System.out.println("请输入A-G:");
		String xq = sc.next();
		switch (xq) {
		case "A" : System.out.println("星期一");break;
		case "B" : System.out.println("星期二");break;
		case "C" : System.out.println("星期三");break;
		case "D" : System.out.println("星期四");break;
		case "E" : System.out.println("星期五");break;
		case "F" : System.out.println("星期六");break;
		case "G" : System.out.println("星期日");break;
		case "H" : xq1="H";System.out.println("退出");break;
		default:System.out.println("录入有误！");break;
		}}
		
	
	}
}