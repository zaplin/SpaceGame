
public class SpaceGameBuildingsIronRefinery extends SpaceGameBuildings{

	public SpaceGameBuildingsIronRefinery(int am, String name) {
		super(am, name);
		
	}
	
	public void update(){
		
		if(SpaceGameResourcesRegistry.resCoal.getAmount() >= 5 || SpaceGameResourcesRegistry.resIronOre.getAmount() >= 5){
			
			SpaceGameResourcesRegistry.resIronOre.setAmount(SpaceGameResourcesRegistry.resIronOre.getAmount() - 5);
			SpaceGameResourcesRegistry.resCoal.setAmount(SpaceGameResourcesRegistry.resCoal.getAmount() - 5);
			SpaceGameResourcesRegistry.resIronBar.setAmount(SpaceGameResourcesRegistry.resIronBar.getAmount() + 5);
			System.out.println("Iron refinery produced 5 iron bars");
		}
		else{
			
			if(SpaceGameResourcesRegistry.resCoal.getAmount() < 5){
				
				System.out.println("Iron refinery did not have enough coal");
			}
			if(SpaceGameResourcesRegistry.resIronOre.getAmount() < 5){
				
				System.out.println("Iron refinery did not have enough iron ore");
			}
		}
	}

}
