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
public class Teacher extends Employee {
    private int ClassNo;
    
    public Teacher() {
    }

    public Teacher(int ClassNo) {
        this.ClassNo = ClassNo;
    }

    public void setClassNo(int ClassNo) {
        this.ClassNo = ClassNo;
    }

    public int getClassNo() {
        return ClassNo;
    }

    @Override
    public String toString() {
        return "Teacher{" + "ClassNo=" + ClassNo + '}';
    }
    @Override
   public  float getSalary()
    {
       return (float) (this.basicSalary + (0.10 * this.basicSalary));
    }
}
