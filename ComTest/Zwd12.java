//基本类型 和 引用类型的区别
class Zwd12DemoJ{
      int a1=10;
	  int a2=20;
	public void jbxl(int a1,int a2){
		System.out.println("基本类型调用a1+a2="+(a1+a2));
	}
}
class Zwd12DemoY{
	public void yylx(Zwd12DemoJ z){
		System.out.println("这里是引用类型(引用类)");
	}
}
class Zwd12{
	public static void main(String [] args){
	Zwd12DemoJ Zj = new Zwd12DemoJ();
	Zj.jbxl(20,40);//基本类型调用

	Zwd12DemoY Zy = new Zwd12DemoY();//引用类型调用
	Zy.yylx(Zj);
	
	}
}


/*class Demo{
	public int sum(int a,int b){
		System.out.println("这里是sum方法下："+(a+b));
		return a+b;
	}
}

class Student{
	public void show(){
		System.out.println("学生中的Show");
	}
}

class StudenDemo {
	public void method (Student s){
		//s.show();
		System.out.println("学生中Demo的Show");
	}

}

class ArgsTest {
	public static void main(String [] args){
		Demo d = new Demo();  //给类开空间
		int saa = d.sum(10,20);         //引用类里的方法
		System.out.println("这里是MAIN方法下用DEMO："+saa);
		
		StudenDemo sd = new StudenDemo();
		Student s1 = new Student();
		sd.method(s1);
		
		
	}
}
*/