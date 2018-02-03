package com.github.mybaties.oomaping;

public class Class {

    public int id;
    public String name;
    public Teacher teacher;

    @Override
    public String toString() {
        return new StringBuffer("[")
                .append("id:").append(id)
                .append("name:").append(name)
                .append("teacher:").append(teacher.toString())
                .toString();
    }
}
