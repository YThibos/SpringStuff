package be.thibos.demos.spring.configuration.beans;

public class HeyInfrabelBean implements HeyBean {

	@Override
	public String ohai() {
		return "Hi, Infrabel?";
	}
}
