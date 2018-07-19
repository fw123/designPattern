package strategypattern;

abstract public class BaseDuck {

	BaseDuck(){
		
	}
	public FlyBehavior flyBehavior;
	
	public abstract void display();
	
	public void swim(){
		System.out.println("红掌拨清波");
	}
	
	public void performFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
