//代码块的执行先后顺序
class dmk1{
	int aa=1;
	{int a = 100;System.out.println("构造代码块A:"+(a+aa));}	//aa每次执行完就释放了
	public dmk1(int x){System.out.println("构造方法:"+x);}
	static {System.out.println("静态代码块A");}//(静态代码块只执行一次)
}

class Zwd14Dmk{
	static int dd=44; 
	static int ee=55;
	static {int bb=22; int cc=33;System.out.println("静态代码块B:"+(bb+cc));}//静态代码块先执行(只执行一次)
	       {int dd=44; int ee=55;System.out.println("构造代码块F:"+(dd+ee));}//非静态代码块不执行
	public static void main (String [] args){
		{int b = 2; int c = 3;System.out.println("局部代码块:"+(b+c));}//局部代码块
		System.out.println("-------------------");
		dmk1 dk1  = new dmk1(1);
		System.out.println("-------------------");
		dmk1 dk2 = new dmk1(2);
		System.out.println("-------------------");
		dmk1 dk3 = new dmk1(3);
		System.out.println("-------------------");
		dmk1 dk4 = new dmk1(4);
		System.out.println("-------------------");
		System.out.println("方法内用方法外变常量:"+(dd+ee));//只能在方法内执行方法外变常量
	}
}