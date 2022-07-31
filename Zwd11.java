//面向类对象，手机练习
class Zwd11phone{
	String pm; //品牌(字符型)
	int jg;    //价格(数字型Int)
	String ys;  //颜色(字符型)
	
	public void ddh(String name){ //给谁打电话
		System.out.println("给"+name+"打电话");		
	}
	
	public void fdx(String mdx){//发什么内容的短信
		System.out.println("短信内容是："+mdx);
	}
	
	public void wyx(){//玩游戏
		System.out.println("玩游戏");
	}
	public void kmjg(int kmj){//可卖多少钱
		System.out.println("可卖的价格是:"+kmj+"元");
	}
}

class Zwd11{//建立main主类给虚拟机JVM最先调用
	public static void main (String [] agrs){
		Zwd11phone p = new Zwd11phone();//创建类(Phone)对象
		p.pm="华为";
		p.jg=1988;
		p.ys="黑色";
		System.out.println(p.pm+" - "+p.jg+"元 - "+p.ys);
		System.out.println("------------------------------");
		p.ddh("马云");
		p.fdx("如何成为你的竞争对手");
		p.wyx();
		p.kmjg(1288);
	}
	
	
}