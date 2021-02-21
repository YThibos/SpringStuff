package be.thibos.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import be.thibos.demos.spring.configuration.HelloConfig;
import be.thibos.demos.spring.configuration.beans.HeyBean;

//@Configuration
//@EnableAutoConfiguration
//@Import(HelloConfig.class)
@SpringBootApplication
public class EveryoneHatesHelloWorlds {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloConfig.class);

		HeyBean heyBean = context.getBean(HeyBean.class);
		System.out.println(heyBean.ohai());
	}

}
