package org.example;

public class School {
    private String name;
    private String attr;

    private Student student;

    public School() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", attr='" + attr + '\'' +
                ", student=" + student +
                '}';
    }
}
