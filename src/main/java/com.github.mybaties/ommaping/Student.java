package com.github.mybaties.ommaping;

public class Student {
	public int id;
	public String name;

	@Override
	public String toString() {
		return new StringBuffer("[{Student}")
				.append("id:").append(id)
				.append("name:").append(name)
				.toString();
	}
}