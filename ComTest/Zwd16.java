//一个类的：静态代码块，构造代码块，构造方法的执行顺序
class Fu {
  String name1="林青霞";  //成员变量
  int age1=30;      //成员变量

	public static void getname(){System.out.println("Fu类静态成员方法");}
	
	{System.out.println("FU类代码块");}//第3出现
	
	static {System.out.println("FU类静态代码块");}//第1出现
}

class Zi extends Fu {
   
	static {System.out.println("Zi类静态代码块");}	//第2出现
	
	{System.out.println("Zi类代码块");}//第4出现
	
	public void show(){
			System.out.println("show无参构造代码块:"+super.name1);
		}//第5出现

	public void show(int a1){
			if (a1==1){System.out.println("show1有参构造代码块:"+super.age1);}else
			if (a1==2){System.out.println("show2有参构造代码块:"+super.name1);}
		}//第5出现
}		


class Zwd16 {
   public static void main(String [] args){
   Zi z = new Zi();
   z.show();
   System.out.println("----------------");
   z.show(1);
   System.out.println("----------------");
   z.show(2);
   }

}