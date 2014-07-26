
public class tuna {
	private String girlName;
	public void setName(String name){
		girlName=name;
		System.out.println("girlName is set to " + name);
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.println("Saying girlname is " + getName());
	}
}
