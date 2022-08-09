//静态变量，静态方法的使用
class Static1{
	int mun1=10;   //非静态变量
	static int mun2=20; //静态变量
		
		public static void Static2() {
		//无法从静态上下文中引用非静态 变量 mun1
		//System.out.println("静态方法调用非静态变量:"+mun1);
		System.out.println("静态方法调用静态变量:"+mun2);
		}
		public void Static3() {
		System.out.println("非静态方法调用非静态变量:"+mun1);
		System.out.println("非静态方法调用静态变量:"+mun2);
		}
	}
	
class Zwd15Static{
 public static void main(String[] args){
	 //静态变量不用先创建对象，就能被使用
	 System.out.println("调用静态变量:"+Static1.mun2);
	 //非静态变量必须先创建对象，才能被使用
	 
	 Static1 st = new Static1();
	 
	 System.out.println("调用非静态变量:"+st.mun1);
	 System.out.println("调用静态变量:"+st.mun2);
	 //System.out.println("调用非静态方法+变量:"+st.);
	 st.Static2();//调用静态方法
	 st.Static3();//调用非静态方法
 }
	
}
 