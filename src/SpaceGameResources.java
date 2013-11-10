
public class SpaceGameResources{
	
  private int amount;
  private int maxAmount;
  private String resourceName;
  
  public SpaceGameResources(int am, int maxAm, String name){
	  
	  amount = am;
	  maxAmount = maxAm;
	  resourceName = name;
	  
  }
  
  public void printResources(){
	  
	  System.out.println("you have " + amount + "/" + maxAmount + " " + resourceName);
  }
  
  public void capacityCheck(){
	  
	  if(amount > maxAmount){
		  
		  amount = maxAmount;
		  System.out.println(resourceName + " exceeded capacity");
	  }
  }
					
  public int getAmount() {
	  return amount;
  }

  public int getMaxAmount() {
	  return maxAmount;
  }

  public String getResourceName() {
	  return resourceName;
  }

  public void setAmount(int amount) {
	  this.amount = amount;
  }

  public void setMaxAmount(int maxAmount) {
	  this.maxAmount = maxAmount;
  }

  public void setResourceName(String resourceName) {
	  this.resourceName = resourceName;
  }
  
}
