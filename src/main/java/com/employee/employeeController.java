package com.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class employeeController {
	
	@GetMapping("/getEmployee")
	public Employee getEmployee() {
		return new Employee(1,"Ramesh",30000);
		
	}
	@GetMapping("/getEmployees")
	public List<Employee> getStdList(){
		
		List<Employee> stdlist=new ArrayList<>();
		stdlist.add(new Employee(1,"Rajesh",20000));
		stdlist.add(new Employee(2,"Sanket",25000));
		stdlist.add(new Employee(3,"Neha",30000));
		stdlist.add(new Employee(4,"Nisha",36000));
		stdlist.add(new Employee(5,"Rushi",38000));
		stdlist.add(new Employee(6,"Mahesh",40000));
		stdlist.add(new Employee(7,"Teena",32000));
		stdlist.add(new Employee(8,"Neha",39000));
		stdlist.add(new Employee(9,"Nagesh",43000));
		stdlist.add(new Employee(10,"Ruhi",50000));
	
		
		return stdlist;
		
		
	
	
	}

}
