package spring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_xml.controller.HelloController;
import spring_xml.service.GCService;
import spring_xml.service.IHelloService;

public class Main {
    public static void main(String[] args){
      ApplicationContext context = new ClassPathXmlApplicationContext();
      HelloController helloController = (HelloController)  context.getBean("exemplo.xml");
      helloController.hello();
    }

}
