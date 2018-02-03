package com.github.mybaties.ommaping;

import com.github.mybaties.oomaping.Teacher;

import java.util.List;

public class Classes {
		private int id;
		private String name;
		private Teacher teacher;
		private List<Student> students;
	@Override
	public String toString() {
		return new StringBuffer("[")
				.append("/r/n id:").append(id)
				.append("/r/n name:").append(name)
				.append("/r/n teacher:").append(teacher.toString())
				.append("/r/n students:").append(students)
				.toString();
	}

}