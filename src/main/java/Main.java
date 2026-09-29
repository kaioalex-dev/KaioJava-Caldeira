import controller.HelloController;
import service.GCService;
import service.IHelloService;

public class Main {
    public static void main(String[] args){
        IHelloService gcService = new GCService();
        HelloController helloController = new HelloController(gcService);
        helloController.hello();
    }

}
