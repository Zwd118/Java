//遍历数组和获取数组里面的最大值
class Zwd9 {
	public static void main (String [] args){
		int [] a = {1,2,3,4,5,6,7,10};
		int [] b = {11,22,33,44,55,66,77,1010,5111,1212,1313,1414,1515,1818,1919};
		blsza(a);
		blszb(b);
	}
	public static void blsza (int [] a){//遍历数组
		for (int a0=0; a0<a.length; a0++){
			if (a0==a.length-1){//最后一个不加“，”
				System.out.print(a[a0]);
			}else{
			System.out.print(a[a0]+" , ");//非最后一个
		}
		}
			System.out.println();
	}
	public static void blszb (int [] b){//遍历数组获取最大值
		 int max = 0;
		 int min = 0;
		for (int a0=0; a0<b.length; a0++){
			 max = max>b[a0] ? max : b[a0];
		}
		for (int a0=0; a0<b.length; a0++){
			 min = b[0];
			 min = min<b[a0] ? min : b[a0];
		}
		System.out.println("最大值:"+max+" 最小值:"+min);
	}
}