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
public class Student {
    int ID;
    String Name;
    int Level;

    public Student() {
    }

    public Student(int ID, String Name, int Level) {
        this.ID = ID;
        this.Name = Name;
        this.Level = Level;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getLevel() {
        return Level;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", Level=" + Level + '}';
    }
    
}
