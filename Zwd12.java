//�������� �� �������͵�����
class Zwd12DemoJ{
      int a1=10;
	  int a2=20;
	public void jbxl(int a1,int a2){
		System.out.println("�������͵���a1+a2="+(a1+a2));
	}
}
class Zwd12DemoY{
	public void yylx(Zwd12DemoJ z){
		System.out.println("��������������(������)");
	}
}
class Zwd12{
	public static void main(String [] args){
	Zwd12DemoJ Zj = new Zwd12DemoJ();
	Zj.jbxl(20,40);//�������͵���

	Zwd12DemoY Zy = new Zwd12DemoY();//�������͵���
	Zy.yylx(Zj);
	
	}
}


/*class Demo{
	public int sum(int a,int b){
		System.out.println("������sum�����£�"+(a+b));
		return a+b;
	}
}

class Student{
	public void show(){
		System.out.println("ѧ���е�Show");
	}
}

class StudenDemo {
	public void method (Student s){
		//s.show();
		System.out.println("ѧ����Demo��Show");
	}

}

class ArgsTest {
	public static void main(String [] args){
		Demo d = new Demo();  //���࿪�ռ�
		int saa = d.sum(10,20);         //��������ķ���
		System.out.println("������MAIN��������DEMO��"+saa);
		
		StudenDemo sd = new StudenDemo();
		Student s1 = new Student();
		sd.method(s1);
		
		
	}
}
*/