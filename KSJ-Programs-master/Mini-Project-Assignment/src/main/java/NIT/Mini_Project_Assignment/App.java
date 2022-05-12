package NIT.Mini_Project_Assignment;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.controller.MainController;
import com.vo.PatientVO;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
    	System.out.println( "Welcome Corona Patient .......\n " );
    	System.out.println("Enter Your Name ");
    	String name= sc.next();
    	System.out.println("Enter Your Address");
    	String address= sc.next();
    	System.out.println("Enter Your Per Day Charges At Hospital  ");
    	String perDayCharge= sc.next();
    	System.out.println("Total Day You Stayed in Hospital ");
    	String totalDay= sc.next();
    	
    	// save user data into vo object 
    	PatientVO vo= new PatientVO();
    	//set data to vo object 
    	vo.setName(name);
    	vo.setAddress(address);
    	vo.setPerDayCharge(perDayCharge);
    	vo.setTotalDay(totalDay);
    	// load xml file 
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/cfgs/applicationContext.xml");
    	// get Controller Class Object 
    	MainController controller = factory.getBean("controller",MainController.class);
    			//invoke controller cclass Methods
    	try {
    		String msg= controller.getConfirmation(vo);
    		System.out.println(msg);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
