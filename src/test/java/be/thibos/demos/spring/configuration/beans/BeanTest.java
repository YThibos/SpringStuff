package be.thibos.demos.spring.configuration.beans;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import be.thibos.demos.spring.configuration.HelloConfig;

@SpringBootTest // TODO 2 See docs, what does this do?
@Import(HelloConfig.class)
class BeanTest {

	@Autowired HeyBean heyBean;
	@Autowired CounterBean counterBean;
	@Autowired CounterBean counterBean2;

	@Test
	@Disabled("FIXME")
	void hiCoyote() {
		assertThat(heyBean.ohai()).isEqualTo("Hi, Coyote!");
	}

	@Test
	@Disabled("FIXME TOO")
	void counterBean() {
		assertThat(counterBean.countAndReturn()).isOne();
		assertThat(counterBean2.countAndReturn()).isOne();
	}
}
