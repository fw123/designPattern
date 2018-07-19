package strategypattern;

public class FlyWithRocket implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("火箭加速");
	}

}
