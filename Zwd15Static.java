//��̬��������̬������ʹ��
class Static1{
	int mun1=10;   //�Ǿ�̬����
	static int mun2=20; //��̬����
		
		public static void Static2() {
		//�޷��Ӿ�̬�����������÷Ǿ�̬ ���� mun1
		//System.out.println("��̬�������÷Ǿ�̬����:"+mun1);
		System.out.println("��̬�������þ�̬����:"+mun2);
		}
		public void Static3() {
		System.out.println("�Ǿ�̬�������÷Ǿ�̬����:"+mun1);
		System.out.println("�Ǿ�̬�������þ�̬����:"+mun2);
		}
	}
	
class Zwd15Static{
 public static void main(String[] args){
	 //��̬���������ȴ������󣬾��ܱ�ʹ��
	 System.out.println("���þ�̬����:"+Static1.mun2);
	 //�Ǿ�̬���������ȴ������󣬲��ܱ�ʹ��
	 
	 Static1 st = new Static1();
	 
	 System.out.println("���÷Ǿ�̬����:"+st.mun1);
	 System.out.println("���þ�̬����:"+st.mun2);
	 //System.out.println("���÷Ǿ�̬����+����:"+st.);
	 st.Static2();//���þ�̬����
	 st.Static3();//���÷Ǿ�̬����
 }
	
}
 