package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj= new Department(4,"Books");
		
		Seller seller=new Seller(21,"Raia","raialucas@gmail.com",new Date(),2000.00,obj);
		
		
		System.out.println(seller);

	}

}
