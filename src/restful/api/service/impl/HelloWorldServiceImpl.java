package restful.api.service.impl;

import restful.api.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld() {
		// TODO Auto-generated method stub
		
		return "Hello World!!!";
	}

	@Override
	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hello World " +name + " !";
	}

}
