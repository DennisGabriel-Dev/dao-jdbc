package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: department findAll ===");
		System.out.println(departmentDao.findAll());
		
		System.out.println("=== TEST 3: department insert ===");
		Department dep2 = new Department(null, "Food");
		departmentDao.insert(dep2);
		System.out.println("A new department was inserted!");
		
		System.out.println("=== TEST 4: department delete ===");
		departmentDao.deleteById(9);
		
		
		System.out.println("=== TEST 5: department update ===");
		dep2 = departmentDao.findById(10);
		dep2.setName("Finance");
		departmentDao.update(dep2);
	}

}
