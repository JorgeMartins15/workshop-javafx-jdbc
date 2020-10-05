package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		
		List<Department> list = new ArrayList<>();
		return dao.findAll();

	}

}
