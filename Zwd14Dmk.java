//������ִ���Ⱥ�˳��
class dmk1{
	int aa=1;
	{int a = 100;System.out.println("��������A:"+(a+aa));}	//aaÿ��ִ������ͷ���
	public dmk1(int x){System.out.println("���췽��:"+x);}
	static {System.out.println("��̬�����A");}//(��̬�����ִֻ��һ��)
}

class Zwd14Dmk{
	static int dd=44; 
	static int ee=55;
	static {int bb=22; int cc=33;System.out.println("��̬�����B:"+(bb+cc));}//��̬�������ִ��(ִֻ��һ��)
	       {int dd=44; int ee=55;System.out.println("��������F:"+(dd+ee));}//�Ǿ�̬����鲻ִ��
	public static void main (String [] args){
		{int b = 2; int c = 3;System.out.println("�ֲ������:"+(b+c));}//�ֲ������
		System.out.println("-------------------");
		dmk1 dk1  = new dmk1(1);
		System.out.println("-------------------");
		dmk1 dk2 = new dmk1(2);
		System.out.println("-------------------");
		dmk1 dk3 = new dmk1(3);
		System.out.println("-------------------");
		dmk1 dk4 = new dmk1(4);
		System.out.println("-------------------");
		System.out.println("�������÷�����䳣��:"+(dd+ee));//ֻ���ڷ�����ִ�з�����䳣��
	}
}