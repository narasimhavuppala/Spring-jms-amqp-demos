package by.matrosov.rabbitmqjavaspring.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class ActiveMqConfig {

	@Bean
	ActiveMQConnectionFactory getActiveMQ() {
		ActiveMQConnectionFactory obj = new ActiveMQConnectionFactory("guest", "guest", "");
		return obj;

	}

	@Bean
	JmsTemplate getJmsTemplate() {
		return new JmsTemplate(getActiveMQ());
	}

}
