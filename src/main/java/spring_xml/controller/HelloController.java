package spring_xml.controller;

import spring_xml.service.GCService;
import spring_xml.service.IHelloService;

public class HelloController {

    private IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    public void hello(){
        System.out.println(helloService.hello());
    }

    public GCService getHelloService() {
        return helloService;
    }
}
