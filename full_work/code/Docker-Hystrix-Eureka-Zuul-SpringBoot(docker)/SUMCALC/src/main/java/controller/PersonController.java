package controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.PersonService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@RestController
@RequestMapping("/person")
@EnableDiscoveryClient
public class PersonController {


@RequestMapping("/insert")
    public String insert() {
		InsertCommand1 objInsertCommand = new InsertCommand1();
		objInsertCommand.execute();
		return "Insert Service Invoked............";
    }

	
	@Autowired
	PersonService ps;
	
	@RequestMapping("/accept")
	public String getData( @RequestParam("age") int age)
	{
		System.out.println("äge "+  age);
		
		JSONObject obj1 = new JSONObject();
		obj1.put("age", age);
		System.out.println(obj1.toString());
		
		return ps.printHello();
	}
	
	@RequestMapping("/all")
	public String printHello()
	{
		return ps.printHello();
	}
	
	@HystrixCommand(fallbackMethod = "addNumbersError")
	@RequestMapping("/sum")
	public int addNumbers(@RequestParam("i") int i, @RequestParam("j") int j)
	{
		
		try {
			
		InsertCommand1 objInsertCommand = new InsertCommand1();
		objInsertCommand.execute();
		String message;
		JSONObject obj1 = new JSONObject();

		JSONObject xyz = new JSONObject();

		xyz.put("id", 0);
		xyz.put("name", "testName");
		//xyz.put("test2", xyz1);

		message = xyz.toString();
		System.out.println(message);
		
		
		JSONObject abc = new JSONObject();
		abc.put("i", i);
		abc.put("j", j);
		abc.put("total", i+j);
		abc.put("obj1", obj1);
		
		message = abc.toString();
		System.out.println(message );
		
        InetAddress addr = InetAddress.getLocalHost();
        
        String clientip = addr.getHostAddress();
        System.out.println("*******************");
        System.out.println("addr.getHostAddress()--"+addr.getHostAddress());
        System.out.println("addr.getCanonicalHostName--"+addr.getCanonicalHostName());
        System.out.println("addr.getAddress--"+addr.getAddress().toString());
        System.out.println("addr.isMulticastAddress--"+addr.isMulticastAddress());
        System.out.println("*******************");

		
		
		
		}
		catch (Exception e)
		{
			System.out.println("Exception-------"+e);
		}
		
		return ps.addNumbers(i, j);
	}

	public int addNumbersError(@RequestParam("i") int i, @RequestParam("j") int j)
	{
		return 0;
	}
	
	
}
