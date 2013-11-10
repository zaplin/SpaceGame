
public class SpaceGameBuildingsIronMine extends SpaceGameBuildings {

	public SpaceGameBuildingsIronMine(int am, String name) {
		super(am, name);
		
	}
	
	public void update(){
		
		if(SpaceGameResourcesRegistry.resEnergy.getAmount() >= 5){
			
			SpaceGameResourcesRegistry.resEnergy.setAmount(SpaceGameResourcesRegistry.resEnergy.getAmount() - 5);
			SpaceGameResourcesRegistry.resIronOre.setAmount(SpaceGameResourcesRegistry.resIronOre.getAmount() + 5);
			System.out.println("Iron Mine produced 5 iron");
		}
		else{
			
			System.out.println("iron mine did not have enough energy");
		}
	}
	
}
