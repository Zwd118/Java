//猜数字游戏
import java.util.Scanner;

class Zwd13NumGame{
	public static void main(String [] arges){
			int mun= (int) (Math.random()*100)+1;
	  for (int x=0;x<=10;x++){
		  System.out.println("请输入你要猜的数字(0-100):");
		   Scanner sc = new Scanner(System.in);
            int sc1 = sc.nextInt();
         	if (sc1>=1 && sc1<=100){
			if (mun == sc1){System.out.println("你猜中了:"+mun);break;
		  }else
		  {System.out.println("你猜错了: 随机数是"+mun+",你猜的是:"+sc1);}
			}else
			{System.out.println("你输入的数字错误！");}
	 	  }
	}
}