//����������ֻ���ϰ
class Zwd11phone{
	String pm; //Ʒ��(�ַ���)
	int jg;    //�۸�(������Int)
	String ys;  //��ɫ(�ַ���)
	
	public void ddh(String name){ //��˭��绰
		System.out.println("��"+name+"��绰");		
	}
	
	public void fdx(String mdx){//��ʲô���ݵĶ���
		System.out.println("���������ǣ�"+mdx);
	}
	
	public void wyx(){//����Ϸ
		System.out.println("����Ϸ");
	}
	public void kmjg(int kmj){//��������Ǯ
		System.out.println("�����ļ۸���:"+kmj+"Ԫ");
	}
}

class Zwd11{//����main����������JVM���ȵ���
	public static void main (String [] agrs){
		Zwd11phone p = new Zwd11phone();//������(Phone)����
		p.pm="��Ϊ";
		p.jg=1988;
		p.ys="��ɫ";
		System.out.println(p.pm+" - "+p.jg+"Ԫ - "+p.ys);
		System.out.println("------------------------------");
		p.ddh("����");
		p.fdx("��γ�Ϊ��ľ�������");
		p.wyx();
		p.kmjg(1288);
	}
	
	
}