package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class LogInitListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent e) {
		System.out.println("Logger initialized.........");
	}

	public void contextDestroyed(ServletContextEvent e) {
		System.out.println("Logger DeAllocated......");
	}

}
