
public class SpaceGameResourcesRegistry {
	
	public static SpaceGameResourcesEnergy resEnergy;
	public SpaceGameResourcesCoal resCoal;
	public SpaceGameResourcesIronOre resIronOre;
	public SpaceGameResourcesIronBar resIronBar;
	
	public void registerResources(){
		
		resEnergy = new SpaceGameResourcesEnergy(100, 1000, "Energy");
		resCoal = new SpaceGameResourcesCoal(100, 1000, "coal");
		resIronOre = new SpaceGameResourcesIronOre(100, 1000, "Iron Ore");
		resIronBar = new SpaceGameResourcesIronBar(0, 1000, "Iron Bar");
	}

}
