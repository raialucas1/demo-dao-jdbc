package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		
		DepartmentDao departmentDao=DaoFactory.createDepartmentDao();
		System.out.println("### TESTE 1: department findById ###");
		Department department=departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("### TESTE 2: department findAll ###");
		List<Department> deps=departmentDao.findAll();
		for(Department dep:deps) {
			System.out.println(dep);
		}
		System.out.println("### TESTE 3: insert department ###");
		Department newDepartment=new Department(null, "Moveis");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		
		System.out.println("### TESTE 4: department  update ###");
		department=departmentDao.findById(1);
		department.setName("Computers and softWares");
		departmentDao.update(department);
		System.out.println(department);
		
		 System.out.println("### TESTE 5: department deleteById ###");
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter id to delete:");
         int id=sc.nextInt();
         departmentDao.deleteById(id);
         System.out.println("delete done");
         sc.close();
	}

}
