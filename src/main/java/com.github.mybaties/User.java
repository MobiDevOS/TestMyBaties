package com.github.mybaties;

public class User {

	public int id;
	public String name;
	public int age;

	@Override
	public String toString() {
		return new StringBuffer(" [id]:").append(id)
				.append(" [name]:").append(name)
				.append(" [age]:").append(age)
				.toString();
	}
}