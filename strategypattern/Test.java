package strategypattern;

public class Test {
	public static void main(String[] args) {
		BaseDuck duck = new RubberDuck();
		duck.display();
		duck.performFly();
		duck.setFlyBehavior(new FlyWithRocket());
		duck.performFly();
	}
}
