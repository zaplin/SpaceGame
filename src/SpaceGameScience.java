public class SpaceGameScience{
	
	private int science;
	
	public SpaceGameScience(int sci){
		
		science = sci;
	}
	
	public void printScience(){
		
		System.out.println("you have" + science + "science");
	}
	
	public void setScience(int sci){
		
		science = sci;
	}
	
	public int getScience(){
		
		return science;
	}
	
}