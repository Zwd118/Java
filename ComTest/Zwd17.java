//内部类，外部类，变量的调用方法

class Zwd17outer{            //外部类
	public int num = 10;
	class Zwd17Inner {       //内部类
	    public int num = 20;
		public void show(){
			int num = 30;
			System.out.println(new Zwd17outer().num); //这里要先输入10,也可以如下：
			System.out.println(Zwd17outer.this.num);  //这里也是10
			System.out.println(this.num); //这里要输入20
			System.out.println(num);//这里要输入30
		}
	}
}

class Zwd17 {    //jvm调用的类
	public static void main(String[]args){
		Zwd17outer.Zwd17Inner zz = new Zwd17outer().new Zwd17Inner();
		zz.show();
		}
}