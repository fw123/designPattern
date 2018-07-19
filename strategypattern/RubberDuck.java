package strategypattern;

public class RubberDuck extends BaseDuck {

	public RubberDuck() {
		super();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("红掌拨清波");
	}

}
