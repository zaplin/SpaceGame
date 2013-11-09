public class SpaceGameBuildings{
	
	private int solarFarms;
	private int coalMines;
	private int ironMines;
	private int ironRefineries;
	private int laboratories;
	
	private int capacitors;
	private int coalBins;
	private int ironOreBins;
	private int ironBarBins;
	
	public SpaceGameBuildings(int sFarms, int cMines, int iMines, int iRef, int lab, int cap, int cBin, int iOreBin, int iBarBin){
		
		solarFarms = sFarms;
		coalMines = cMines;
		ironMines = iMines;
		ironRefineries = iRef;
		laboratories = lab;
		
		capacitors = cap;
		coalBins = cBin;
		ironOreBins = iOreBin;
		ironBarBins = iBarBin;
		
				
	}
	
	public void printBuildings(){
		
		System.out.println("you have " + solarFarms + " solar farms");
		System.out.println("you have " + coalMines + " coal mines");
		System.out.println("you have " + ironMines + " iron mines");
		System.out.println("you have " + ironRefineries + " refineries");
		System.out.println("you have " + laboratories + " laboratories");
	}
	
	public int getSolarFarms(){
		
		return solarFarms;
	}
	
	public int getCoalMines(){
		
		return coalMines;
	}
	
	public int getIronMines(){
		
		return ironMines;
	}
	
	public int getIronRefineries(){
		
		return ironRefineries;
	}
	
	public int getLaboratories(){
		
		return laboratories;
	}
	
	public int getCapacitors(){
		
		return capacitors;
	}
	
	public int getCoalBins(){
		
		return coalBins;
	}
	
	public int getIronOreBins(){
		
		return ironOreBins;
	}
	
	public int getIronBarBins(){
		
		return ironBarBins;
	}
	
	public void setSolarFarms(int sFarm){
		
		solarFarms = sFarm;
	}
	
	public void setCoalMines(int cMine){
		
		coalMines = cMine;
	}
	
	public void setIronMines(int iMines){
		
		ironMines = iMines;
	}
	
	public void setIronRefineries(int iRef){
		
		ironRefineries = iRef;
	}
	
	public void setCapacitors(int cap){
		
		capacitors = cap;
	}
		
	
}
