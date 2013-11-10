
public class SpaceGameBuildingsCoalMine extends SpaceGameBuildings {

	public SpaceGameBuildingsCoalMine(int am, String name) {
		super(am, name);
		
	}
	
	public void update(){
		
		if(SpaceGameResourcesRegistry.resEnergy.getAmount() >= 5){
			
			SpaceGameResourcesRegistry.resEnergy.setAmount(SpaceGameResourcesRegistry.resEnergy.getAmount() - 5);
			SpaceGameResourcesRegistry.resCoal.setAmount(SpaceGameResourcesRegistry.resCoal.getAmount() + 5);
			System.out.println("Coal mine produced 5 coal");
		}
		else{
			
			System.out.println("Coal mine did not have enough energy");
		}
	}

}
