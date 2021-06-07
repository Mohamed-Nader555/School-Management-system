package school.manegement.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yehya Adam
 */
public abstract class Employee {

    String Name;
     int Id;
     String Adress;
     String PhoneNumber;
     String Email;
    float basicSalary;
    float liveExpensive;
     

    public Employee() {
    }

    public Employee(String Name, int Id, String Adress, String PhoneNumber, String Email, float basicSalary, float liveExpensive) {
        this.Name = Name;
        this.Id = Id;
        this.Adress = Adress;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.basicSalary = basicSalary;
        this.liveExpensive = liveExpensive;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setLiveExpensive(float liveExpensive) {
        this.liveExpensive = liveExpensive;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public String getAdress() {
        return Adress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public float getLiveExpensive() {
        return liveExpensive;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name=" + Name + ", Id=" + Id + ", Adress=" + Adress + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", basicSalary=" + basicSalary + ", liveExpensive=" + liveExpensive + '}';
    }
   abstract public  float getSalary();
}
