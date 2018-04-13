package restful.api.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import restful.api.service.HelloWorldService;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	HelloWorldService hws = (HelloWorldService) ac.getBean("helloWorldService");

	@RequestMapping(value = "/helloworld")

	public @ResponseBody String helloWorld() throws Exception {

		return hws.helloWorld();
	}

	@RequestMapping(value = "/helloworld/{name}")

	public @ResponseBody String helloWorld(@PathVariable("name") String name) throws Exception {
		
		return hws.helloWorld(name);
		
	}

}
