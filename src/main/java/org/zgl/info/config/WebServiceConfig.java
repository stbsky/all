package org.zgl.info.config;
import javax.xml.ws.Endpoint;
 
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zgl.info.webService.UserService;


@Configuration
public class WebServiceConfig {
	
	@Bean
	public ServletRegistrationBean newServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/cxf/*");
	}

	
	@Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public UserService demoJsonService(){
        return new UserService();
    }
	
    
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(springBus(), demoJsonService());
	    endpoint.publish("/userService");
	    return endpoint;
	}

}