package strategypattern;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("纹丝不动");
	}

}
