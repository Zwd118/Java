package zwd01;

public class Sport {

	private String name;
	private int age;
	private String gj;


	//public Sport (){
	//	super();
	//	}


	public Sport(String name,int age,String gj){
		super();
		this.name = name;
		this.age = age;
		this.gj = gj;
	}

	//getXxx()/setXxx()
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getGj(){
		return gj;
	}
	public void setGj(String gj){
		this.gj = gj;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

	public String toString(){   //?????§Ö?????????
		return "[ ĞÕÃû:"+name+" ÄêÁä£º"+age+" ¹ú¼®:"+gj+"]";
	}
}
