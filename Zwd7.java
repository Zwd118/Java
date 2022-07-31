//小芳存钱到哪一天，达到100元
//import java.util.Scanner;
class Zwd7{
	public static void main (String [] args){
		//Scanner sc = new nextInt();
		//int a1 = sc.nectInt();
	double mqs = 0;//钱数
	for(int mts=1;mqs<=100;mts++){
	    	mqs=mqs+2.5;
			if (mts%5==0){mqs=mqs-6;}
			if (mqs>=100){System.out.println("到第"+mts+"天达到"+mqs);}
	}
		//System.out.println("到第"+mts+"天达到100元");
		//System.out.println("最后计算结果是:"+mts);
	}
}