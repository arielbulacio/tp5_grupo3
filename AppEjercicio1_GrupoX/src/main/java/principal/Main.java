package principal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidad.Usuario;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/Beans.xml");
		Usuario p1 = (Usuario)appContext.getBean("Usuario");
		System.out.println(p1.toString());
		
		((ConfigurableApplicationContext)(appContext)).close();
	}	
}
