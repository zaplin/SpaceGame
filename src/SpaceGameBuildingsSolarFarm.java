
public class SpaceGameBuildingsSolarFarm extends SpaceGameBuildings {

	public SpaceGameBuildingsSolarFarm(int am, String name) {
		super(am, name);
		
	}
	
	public void update(){
		
		for (int i = 0; i < getAmount(); i++) {
			
			SpaceGameResourcesRegistry.resEnergy.setAmount(SpaceGameResourcesRegistry.resEnergy.getAmount() + 20);
			System.out.println("Solar farm generated 20 energy");
		}
	}

}
