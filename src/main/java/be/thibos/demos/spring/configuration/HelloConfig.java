package be.thibos.demos.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import be.thibos.demos.spring.configuration.beans.CounterBean;
import be.thibos.demos.spring.configuration.beans.CounterBeanImpl;
import be.thibos.demos.spring.configuration.beans.HeyBean;
import be.thibos.demos.spring.configuration.beans.HeyInfrabelBean;

@Configuration
public class HelloConfig {

	@Bean
	public HeyBean heyBean() {
		return new HeyInfrabelBean();
	}

	@Bean
	@Scope("singleton")
	public CounterBean counterBean() {
		return new CounterBeanImpl();
	}

}
