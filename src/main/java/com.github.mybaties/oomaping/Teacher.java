package com.github.mybaties.oomaping;

public class Teacher {
    public int id;
    public String name;

    @Override
    public String toString() {
        return new StringBuffer("[{teacher}")
                .append("id:").append(id)
                .append("name:").append(name)
                .toString();
    }
}
