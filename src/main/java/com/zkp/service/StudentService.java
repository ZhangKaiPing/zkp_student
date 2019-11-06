package com.zkp.service;

import java.util.List;

import com.zkp.dao.StudentMapper;
import com.zkp.domain.Student;

public interface StudentService {
	List<Student> getlist(Student stu);
}
