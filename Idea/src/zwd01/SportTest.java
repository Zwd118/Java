package zwd01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SportTest {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("=========1.����     2.��ѯ     0.�˳�=========");
		System.out.println("��ѡ��:");

		String sr12 = sc.next();

		while("1".equals (sr12)){

			System.out.print("������������");
			String name = sc.next();

			System.out.print("���������䣺");
			String age = sc.next();

			System.out.print("�����������");
			String gj = sc.next();

			//	char [] chs ={name,age,gj}; //д������chs��,���Ͳ�������Ժ���
			//	String str = new String(chs);

			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C://Data//osw.txt",true),"GBK");
			osw.write(name+","+age+","+gj+",");
			osw.write("\n");
			osw.flush();

			System.out.print("����¼����(y/n)?");
			String sf = sc.next();
			if("n".equals (sf) | "N".equals (sf)){
				System.out.println("���˳���ллʹ�ã�");
				osw.flush();
				osw.close();
				break;
				// Object exit;
			}
		}


		while("2".equals (sr12)){
			System.out.println("��ѯ����");

		}

	}
}


