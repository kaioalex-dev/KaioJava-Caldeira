package java_puro;

import java_puro.controller.HelloController;
import java_puro.service.GCService;
import java_puro.service.IHelloService;

public class Main {
    public static void main(String[] args){
        IHelloService gcService = new GCService();
        HelloController helloController = new HelloController(gcService);
        helloController.hello();
    }

}
