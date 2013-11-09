import java.util.Scanner;
//can you see this
public class SpaceGame{
	
	public static Scanner input = new Scanner(System.in);
	
	public static SpaceGameScience science = new SpaceGameScience(0);
	public static SpaceGameBuildings buildings = new SpaceGameBuildings(1, 1, 1, 1, 0, 1, 1, 1, 1);
	public static SpaceGameResourcesRegistry resources;
	
	public static void main(String args[]){
		
		
		System.out.println();
		buildings.printBuildings();
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
						for (int i = 0; i<buildings.getSolarFarms(); i++){
							
							resources.resEnergy.setAmount(resources.resEnergy.getAmount() + 20);
							System.out.println("solar farm produced 20 energy");
						}
						
						//coal mine update
						for (int i = 0; i<buildings.getCoalMines(); i++){
							
							if(resources.resEnergy.getAmount() >= 5){
								
								resources.resEnergy.setAmount(resources.resEnergy.getAmount() - 5);
								resources.resCoal.setAmount(resources.resCoal.getAmount() + 5);
								System.out.println("coal mine produced 5 tonnes of coal");
							}
							else{
								
								System.out.println("not enough energy for coal mine");
							}
						}
						
						//iron mine update
						for (int i = 0; i<buildings.getIronMines(); i++){
							
							if(resources.resEnergy.getAmount() >= 5){
								
								resources.resEnergy.setAmount(resources.resEnergy.getAmount() - 5);
								resources.resCoal.setAmount(resources.resCoal.getAmount() - 5);
								System.out.println("iron mine produced 5 tonnes of iron ore");
							}
							else{
								
								System.out.println("not enough energy for iron mine");
							}
						}
						
						//iron refinery update
						for (int i = 0; i<buildings.getIronRefineries(); i++){
							
							if(resources.resCoal.getAmount() >= 5 && resources.resIronOre.getAmount() >= 5){
								
								resources.resCoal.setAmount(resources.resCoal.getAmount() - 5);
								resources.resIronOre.setAmount(resources.resIronOre.getAmount() - 5);
								resources.resIronBar.setAmount(resources.resIronBar.getAmount() + 5);
								System.out.println("iron refinery produced 5 iron bars");
							}
							else{
								
								System.out.println("not enough iron or coal for iron refinery");
							}
						}
						//science lab update
						for (int i = 0; i < buildings.getLaboratories(); i++) {
							
							if(resources.resEnergy.getAmount() >= 5){
								
								resources.resEnergy.setAmount(resources.resEnergy.getAmount() - 5);
								science.setScience(science.getScience() + 5);
								System.out.println("scince lab produced 5 science");
							}
							else{
								
								System.out.println("not enough energy for science lab");
							}
							
							
						}
						//capacity checks
						if(resources.resEnergy.getAmount() > resources.resEnergy.getMaxAmount()){
							
							resources.resEnergy.setAmount(resources.resEnergy.getMaxAmount());
							System.out.println("Energy exceeded capacity");
						}
						
						if(resources.resCoal.getAmount() > resources.resCoal.getMaxAmount()){
							
							resources.resCoal.setAmount(resources.resCoal.getMaxAmount());
							System.out.println("coal exceeded capacity");
						}
												
						break;
					}
					else if(choice.equalsIgnoreCase("check")){
						
						
						System.out.println();
						buildings.printBuildings();
						System.out.println();
					}
					else{
						
						System.out.println("invalid choice");
					}
				
				
				
				}
		
		
		
	}
	
	
	
}
