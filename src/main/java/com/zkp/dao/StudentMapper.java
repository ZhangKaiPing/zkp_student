package com.zkp.dao;

import java.util.List;

import com.zkp.domain.Student;

public interface StudentMapper {
		List<Student> getlist(Student stu);
}
