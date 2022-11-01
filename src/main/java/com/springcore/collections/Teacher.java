package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
    private String teacherName;
    private List<Integer> teacherNumbers;
    private Set<String> teacherAddresses;
    private Map<String, Integer> teacherCourses;

    public Teacher() {
    }

    public Teacher(String teacherName, List<Integer> teacherNumbers, Set<String> teacherAddresses, Map<String, Integer> teacherCourses) {
        this.teacherName = teacherName;
        this.teacherNumbers = teacherNumbers;
        this.teacherAddresses = teacherAddresses;
        this.teacherCourses = teacherCourses;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Integer> getTeacherNumbers() {
        return teacherNumbers;
    }

    public void setTeacherNumbers(List<Integer> teacherNumbers) {
        this.teacherNumbers = teacherNumbers;
    }

    public Set<String> getTeacherAddresses() {
        return teacherAddresses;
    }

    public void setTeacherAddresses(Set<String> teacherAddresses) {
        this.teacherAddresses = teacherAddresses;
    }

    public Map<String, Integer> getTeacherCourses() {
        return teacherCourses;
    }

    public void setTeacherCourses(Map<String, Integer> teacherCourses) {
        this.teacherCourses = teacherCourses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherNumbers=" + teacherNumbers +
                ", teacherAddresses=" + teacherAddresses +
                ", teacherCourses=" + teacherCourses +
                '}';
    }
}
