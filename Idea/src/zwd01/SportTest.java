package zwd01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SportTest {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("=========1.输入     2.查询     0.退出=========");
		System.out.println("请选择:");

		String sr12 = sc.next();

		while("1".equals (sr12)){

			System.out.print("请输入姓名：");
			String name = sc.next();

			System.out.print("请输入年龄：");
			String age = sc.next();

			System.out.print("请输入国籍：");
			String gj = sc.next();

			//	char [] chs ={name,age,gj}; //写入数组chs中,类型不相符，以后解决
			//	String str = new String(chs);

			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C://Data//osw.txt",true),"GBK");
			osw.write(name+","+age+","+gj+",");
			osw.write("\n");
			osw.flush();

			System.out.print("继续录入吗(y/n)?");
			String sf = sc.next();
			if("n".equals (sf) | "N".equals (sf)){
				System.out.println("已退出，谢谢使用！");
				osw.flush();
				osw.close();
				break;
				// Object exit;
			}
		}


		while("2".equals (sr12)){
			System.out.println("查询功能");

		}

	}
}


