package be.thibos.demos.spring.configuration.beans;

public class CounterBeanImpl implements CounterBean {

	private int counter = 0;

	@Override
	public int countAndReturn() {
		return ++counter;
	}
}
