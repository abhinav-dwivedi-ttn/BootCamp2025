package com.SpringDataJPA.SpringDataJPA;

//import com.SpringDataJPA.SpringDataJPA.entity.Employee;
import com.SpringDataJPA.SpringDataJPA.entity.Employee2;
//import com.SpringDataJPA.SpringDataJPA.repository.EmployeeRepository;
import com.SpringDataJPA.SpringDataJPA.service.Employee2Service;
//import com.SpringDataJPA.SpringDataJPA.service.EmployeeService;
import com.SpringDataJPA.SpringDataJPA.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

	/*public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDataJpaApplication.class, args);

		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

		EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);

		 Question - 3
		String createEmployee = employeeService.createEmployee(new Employee("AD", 31, "Noida"));
		System.out.println(createEmployee);

		 Question - 4
		String updateEmployee = employeeService.updateEmployee(1, 22);
		System.out.println(updateEmployee);

		 Question - 5
		String deleteEmployee = employeeService.deleteEmployee(1);
		System.out.println(deleteEmployee);

		 Question - 6
		String getEmployee = employeeService.getEmployee(2);
		System.out.println(getEmployee);

		 Question - 7
		Long getEmployeeCount = employeeService.getEmployeeCount();
		System.out.println(getEmployeeCount);

		 Question - 8
		Page<Employee> getEmployeeByAgeOrderByAscPage1 = employeeService.getEmployeeByAge(0, 3);
		for(Employee employee: getEmployeeByAgeOrderByAscPage1.getContent()) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation());
		}

		Page<Employee> getEmployeeByAgeOrderByAscPage2 = employeeService.getEmployeeByAge(1, 3);
		for(Employee employee: getEmployeeByAgeOrderByAscPage2.getContent()) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation());
		}

		 Question - 9
		List<Employee> getEmployeeByName = employeeService.getEmployeeByName("Abhinav");
		for(Employee employee: getEmployeeByName) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation());
		}

		 Question - 10
		List<Employee> getEmployeeByNameStartingWith = employeeService.getEmployeeByNameStartingWith("D");
		for(Employee employee: getEmployeeByNameStartingWith) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation());
		}

		 Question - 11
		List<Employee> getEmployeeByAgeBetween = employeeService.getEmployeeByAgeBetween(28, 32);
		for(Employee employee: getEmployeeByAgeBetween) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge() + " " + employee.getLocation());
		}

	}*/

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDataJpaApplication.class, args);

		Employee2Service employee2Service = applicationContext.getBean(Employee2Service.class);

		VehicleService vehicleService = applicationContext.getBean(VehicleService.class);

		String createEmployee2 = employee2Service.createEmployee2(new Employee2("Nitin", "Kumar", 59));
		System.out.println(createEmployee2);

//		List<Employee2> findEmployee2BySalaryGreaterThanAverageSalary = employee2Service.findEmployee2BySalaryGreaterThanAverageSalary();
//		for(Employee2 employee2: findEmployee2BySalaryGreaterThanAverageSalary) {
//			System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
//		}

//		String updateEmployee2BySalary = employee2Service.updateEmployee2BySalary(20000.00);
//		System.out.println(updateEmployee2BySalary);

//		String deleteEmployee2BySalary = employee2Service.deleteEmployee2BySalary();
//		System.out.println(deleteEmployee2BySalary);

//		List<Employee2> getEmployee2BylastName = employee2Service.getEmployee2BylastName("Singh");
//		for(Employee2 employee2: getEmployee2BylastName) {
//			System.out.println(employee2.getId() + " " + employee2.getFirstName() + " " + employee2.getAge());
//		}

//		String deleteEmployee2ByAge = employee2Service.deleteEmployee2ByAge(45);
//		System.out.println(deleteEmployee2ByAge);


//		vehicleService.createVehicle();
	}
}
