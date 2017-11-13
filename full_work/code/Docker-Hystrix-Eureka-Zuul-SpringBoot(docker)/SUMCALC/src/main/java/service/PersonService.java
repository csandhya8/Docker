package service;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
		
	public String printHello()
	{
		
		Person p1 = new Person();
		p1.setFirstName("rama");
		
		return (String) p1.getFirstName();
	}
	public int addNumbers(int i, int j)
	{
		
		return  (i+j);
	}

}
