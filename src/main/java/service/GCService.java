package service;
import service.IHelloService;

public class GCService implements  IHelloService {

    @Override
    public String hello(){
        return "Hello GC 26";
    }

}
