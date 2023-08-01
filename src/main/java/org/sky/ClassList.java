package org.sky;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassList {

    private List<Student> Students = new ArrayList<Student>();

    public void addStudent(Student student){
        Students.add(student);
    }

    public List<Student> getPassedStudents(int passMark){
        // var will be replaced by the compiler to a specific time upon build
        Stream<Student> streamStudent = Students.stream();
        Stream<Student> passedStudent = streamStudent.filter(student -> student.getScore() > passMark);

        // Return a list.
        return passedStudent.collect(Collectors.toList());
    }

    public long getCount(){
        return Students.stream().count();
    }

    public List<Student> getAgeSortedStudents(){
        Stream<Student> output = Students.stream().sorted(Comparator.comparing(Student::getAge));

        return output.collect(Collectors.toList());
    }

    public List<Student> getNameSortedAdultsStudents(){
        Stream<Student> output = Students.stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).filter((s) -> s.getAge()>18);

        return output.collect(Collectors.toList());
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }
}
