
public class SpaceGameResourcesRegistry {
	
	public static SpaceGameResourcesEnergy resEnergy;
	public static SpaceGameResourcesCoal resCoal;
	public static SpaceGameResourcesIronOre resIronOre;
	public static SpaceGameResourcesIronBar resIronBar;
	
	public static void registerResources(){
		
		resEnergy = new SpaceGameResourcesEnergy(0, 0, "Energy");
		resCoal = new SpaceGameResourcesCoal(0, 0, "Coal");
		resIronOre = new SpaceGameResourcesIronOre(0, 0, "Iron Ore");
		resIronBar = new SpaceGameResourcesIronBar(0, 0, "Iron Bar");
	}

}
