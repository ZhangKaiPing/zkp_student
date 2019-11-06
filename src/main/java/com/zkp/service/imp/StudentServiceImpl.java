package com.zkp.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkp.dao.StudentMapper;
import com.zkp.domain.Student;
import com.zkp.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper sm;
	
	@Override
	public List<Student> getlist(Student stu) {
		// TODO Auto-generated method stub
		return sm.getlist(stu);
	}

}
