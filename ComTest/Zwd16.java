//һ����ģ���̬����飬�������飬���췽����ִ��˳��
class Fu {
  String name1="����ϼ";  //��Ա����
  int age1=30;      //��Ա����

	public static void getname(){System.out.println("Fu�ྲ̬��Ա����");}
	
	{System.out.println("FU������");}//��3����
	
	static {System.out.println("FU�ྲ̬�����");}//��1����
}

class Zi extends Fu {
   
	static {System.out.println("Zi�ྲ̬�����");}	//��2����
	
	{System.out.println("Zi������");}//��4����
	
	public void show(){
			System.out.println("show�޲ι�������:"+super.name1);
		}//��5����

	public void show(int a1){
			if (a1==1){System.out.println("show1�вι�������:"+super.age1);}else
			if (a1==2){System.out.println("show2�вι�������:"+super.name1);}
		}//��5����
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