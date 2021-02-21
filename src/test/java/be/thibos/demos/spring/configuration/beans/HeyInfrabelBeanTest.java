package be.thibos.demos.spring.configuration.beans;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import be.thibos.demos.spring.configuration.HelloConfig;

@SpringBootTest // TODO 2 See docs, what does this do?
@Import(HelloConfig.class)
class HeyInfrabelBeanTest {

	@Autowired HeyBean heyBean;

	@Test
	@Disabled("FIXME")
	void hiCoyote() {
		Assertions.assertThat(heyBean.ohai()).isEqualTo("Hi, Coyote!");
	}
}
