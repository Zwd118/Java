//�ڲ��࣬�ⲿ�࣬�����ĵ��÷���

class Zwd17outer{            //�ⲿ��
	public int num = 10;
	class Zwd17Inner {       //�ڲ���
	    public int num = 20;
		public void show(){
			int num = 30;
			System.out.println(new Zwd17outer().num); //����Ҫ������10,Ҳ�������£�
			System.out.println(Zwd17outer.this.num);  //����Ҳ��10
			System.out.println(this.num); //����Ҫ����20
			System.out.println(num);//����Ҫ����30
		}
	}
}

class Zwd17 {    //jvm���õ���
	public static void main(String[]args){
		Zwd17outer.Zwd17Inner zz = new Zwd17outer().new Zwd17Inner();
		zz.show();
		}
}