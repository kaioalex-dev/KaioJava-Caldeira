package controller;

import service.IHelloService;

public class HelloController {

    private IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void hello(){
        System.out.println(helloService.hello());
    }
}
