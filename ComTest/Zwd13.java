//��������Ϸ
import java.util.Scanner;

class Zwd13NumGame{
	public static void main(String [] arges){
			int mun= (int) (Math.random()*100)+1;
	  for (int x=0;x<=10;x++){
		  System.out.println("��������Ҫ�µ�����(0-100):");
		   Scanner sc = new Scanner(System.in);
            int sc1 = sc.nextInt();
         	if (sc1>=1 && sc1<=100){
			if (mun == sc1){System.out.println("�������:"+mun);break;
		  }else
		  {System.out.println("��´���: �������"+mun+",��µ���:"+sc1);}
			}else
			{System.out.println("����������ִ���");}
	 	  }
	}
}