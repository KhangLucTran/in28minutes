package com.in28minutes.rest.webservices.restful_web_services.helloworld;


import com.in28minutes.rest.webservices.restful_web_services.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World"
    //@RequestMapping(method = RequestMethod.GET, path= "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //hello-world-bean/path-variable/in28minutes
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
