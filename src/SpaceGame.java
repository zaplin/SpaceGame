import java.util.Scanner;
//can you see this
public class SpaceGame{
	
	public static Scanner input = new Scanner(System.in);
	
	public static SpaceGameScience science = new SpaceGameScience(0);
	public static SpaceGameBuildingsRegistry buildings;
	public static SpaceGameResourcesRegistry resources;
	
	@SuppressWarnings("static-access")
	public static void main(String args[]){
		
		resources.registerResources();
		
		resources.resEnergy.setMaxAmount(1000);
		resources.resEnergy.setAmount(100);
		resources.resCoal.setMaxAmount(1000);
		resources.resCoal.setAmount(100);
		resources.resIronOre.setMaxAmount(1000);
		resources.resIronOre.setAmount(100);
		resources.resIronBar.setMaxAmount(1000);
		resources.resIronBar.setAmount(0);
		
		printResources();
		System.out.println();
		
		buildings.registerBuildings();
		
		buildings.buildingSolarFarm.build();
		buildings.buildingIronMine.build();
		buildings.buildingCoalMine.build();
		
		printBuildings();		
		System.out.println();
		
		while(true){
				
				
				
					System.out.println("What do you want to do? \"build\" or \"wait\" or \"check\" ");
					String choice = input.next();
					System.out.println();
					if(choice.equalsIgnoreCase("build")){
						
						break;
					}
					else if(choice.equalsIgnoreCase("wait")){
						
						//solar farm update
						buildings.buildingSolarFarm.update();
						
						//coal mine update
						buildings.buildingCoalMine.update();
						
						//iron mine update
						buildings.buildingIronMine.update();
						
						//iron refinery update
						buildings.buildingIronRefinery.update();
						
						//science lab update
						buildings.buildingLaboratory.update();
						
						//capacity checks
						resources.resEnergy.capacityCheck();
						resources.resCoal.capacityCheck();
						resources.resIronOre.capacityCheck();
						resources.resIronBar.capacityCheck();
												
						
					}
					else if(choice.equalsIgnoreCase("check")){
						
						printResources();
						System.out.println();
						printBuildings();
						System.out.println();
					}
					else{
						
						System.out.println("invalid choice");
					}
				
				
				
				}
		
		
		
	}
	
	
	
	@SuppressWarnings("static-access")
	public static void printResources(){
		
		resources.resEnergy.printResources();
		resources.resCoal.printResources();
		resources.resIronOre.printResources();
		resources.resIronBar.printResources();
	}
	
	public static void printBuildings(){
		
		buildings.buildingSolarFarm.printBuildings();
		buildings.buildingCoalMine.printBuildings();
		buildings.buildingIronMine.printBuildings();
		buildings.buildingIronRefinery.printBuildings();
		buildings.buildingLaboratory.printBuildings();
	}
	
	
}
