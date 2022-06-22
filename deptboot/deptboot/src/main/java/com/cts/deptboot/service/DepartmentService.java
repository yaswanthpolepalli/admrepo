package com.cts.deptboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.deptboot.entity.Department;
import com.cts.deptboot.repository.DepartmentRepository;

@Service
public class DepartmentService {

	
	
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	public List<Department> getAllDepartments() {
		
		return departmentRepository.findAll();
	}

	public Optional<Department> fetchDepartmentById(Long did) {
		
		return departmentRepository.findById(did);
	}

}
