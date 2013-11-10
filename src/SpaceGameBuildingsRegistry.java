
public class SpaceGameBuildingsRegistry {
	
	public static SpaceGameBuildingsSolarFarm buildingSolarFarm;
	public static SpaceGameBuildingsCoalMine buildingCoalMine;
	public static SpaceGameBuildingsIronMine buildingIronMine;
	public static SpaceGameBuildingsIronRefinery buildingIronRefinery;
	public static SpaceGameBuildingsLaboratory buildingLaboratory;
	
	
	public static void registerBuildings(){
		
		buildingSolarFarm = new SpaceGameBuildingsSolarFarm(0, "Solar Farm");
		buildingCoalMine = new SpaceGameBuildingsCoalMine(0, "Coal Mine");
		buildingIronMine = new SpaceGameBuildingsIronMine(0, "Iron Mine");
		buildingIronRefinery = new SpaceGameBuildingsIronRefinery(0, "Iron Refinery");
		buildingLaboratory = new SpaceGameBuildingsLaboratory(0, "Laboratory");
	}

}
