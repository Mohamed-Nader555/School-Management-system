/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.manegement.system;

/**
 *
 * @author Yehya Adam
 */
public class Subject {
    private String subjectName;
    Teacher teacher = new Teacher();
    Student student = new Student();

    public Subject() {
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectName=" + subjectName + ", teacher=" + teacher + ", student=" + student + '}';
    }
    
}
