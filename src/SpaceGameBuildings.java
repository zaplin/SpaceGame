public class SpaceGameBuildings{
	
	private int amount;
	private String buildingName;
	
	public SpaceGameBuildings(int am, String name){
		
		amount = am;
		buildingName = name;
	}
	
	public void build(){
		
		amount++;
	}
	
	public void update(){
		
	}
	
	public void printBuildings(){
		
		if(amount > 0){
		
			System.out.println("you have " + amount + " " + buildingName);
		}
	}

	public int getAmount() {
		return amount;
	}

	public String getBuidlingName() {
		return buildingName;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
		
	
}
