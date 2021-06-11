/*
* Name: Hend abd mousa
* ID: 2301153428
*/

package school.manegement.system;
import java.util.Scanner;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Hend
 */
public class SchoolManegementSystem implements Serializable {

    public static final String studentFilePath = "Students.bat";
    public static final String teacherFilePath = "Teachers.bat";
    public static final String subjectFilePath = "Subjects.bat";
    public static final String principalFilePath = "Principal.bat";

    public static void main(String[] args) throws IOException {
        
        FileManager FManager = new FileManager();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Subject> subjectList = new ArrayList<>();
        Principal principal = new Principal();

        studentList = (ArrayList<Student>) FManager.read(studentFilePath);
        teacherList = (ArrayList<Teacher>) FManager.read(teacherFilePath);
        subjectList = (ArrayList<Subject>) FManager.read(subjectFilePath);
        principal = (Principal) FManager.read(principalFilePath);
        System.out.println("\n\n################################");
        System.out.println("1- Add Employee\n2- Add Student\n3- Add Subject\n4- Show Subjects\n5- Show Employees Salaries\n6- Count of Student in any Subject\n7- Save data in file (Don't Forget To Save Data!)\n8- Exit");
        System.out.println("################################");
        System.out.print("Enter Your Choice: ");

        choice = sc.nextInt();
        while (choice != 8) {
            switch (choice) {

                case 1: {
                    System.out.println("1- Principal\n2- Teacher");
                    int choose = 0;
                    System.out.print("Enter Your Choice: ");
                    choose = sc.nextInt();
                    if (choose == 1) {
                        System.out.println("Enter Principal details");

                        Employee emp = scanEmpData();
                        System.out.print("principalBonus : ");
                        double principalBonus = sc.nextDouble();

                        principal = new Principal(emp.Name, emp.Id, emp.Adress, emp.PhoneNumber, emp.Email, emp.basicSalary, principalBonus);
                        System.out.println("Principal Added Successfully, Don't Forget To Save Data!");
                    } else if (choose == 2) {
                        System.out.println("Enter Teacher details");

                        Employee emp = scanEmpData();
                        System.out.print("ClassNo : ");
                        int ClassNo = sc.nextInt();

                        Teacher teacher = new Teacher(emp.Name, emp.Id, emp.Adress, emp.PhoneNumber, emp.Email, emp.basicSalary, ClassNo);
                        teacherList.add(teacher);
                        System.out.println("Teacher Added Successfully, Don't Forget To Save Data!");
                    }

                }

                break;

                case 2: {
                    System.out.println("Enter Student details");

                    System.out.print("Id : ");
                    int Id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name : ");
                    String Name = sc.nextLine();
                    System.out.print("Level : ");
                    int level = sc.nextInt();

                    Student student = new Student(Id, Name, level);
                    studentList.add(student);
                    
                    System.out.println("Student Added Successfully, Don't Forget To Save Data!");
                }

                break;

                case 3: {
                    System.out.println("Choose The Desired Teacher And Student");
                    System.out.println("Teachers{");
                    for (int i = 0; i < teacherList.size(); i++) {
                        System.out.println((i + 1) + "- "+ teacherList.get(i).getName());
                    }

                    System.out.println("}\n---------");
                    System.out.println("Students{");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println((i + 1) + "- "+ studentList.get(i).getName());
                    }
                    System.out.println("}\n---------");

                    System.out.print("Choosen Teacher : ");
                    int teacherIndex = (sc.nextInt() - 1);
                    System.out.print("Choosen Student : ");
                    int studentIndex = (sc.nextInt() - 1);
                    sc.nextLine();
                    if ((teacherIndex >= 0 && teacherIndex < teacherList.size())
                            && (studentIndex >= 0 && studentIndex < studentList.size())) {

                        System.out.print("Subject Name : ");
                        String subjectName = sc.nextLine();
                        Subject subject = new Subject(teacherList.get(teacherIndex), studentList.get(studentIndex), subjectName);
                        subjectList.add(subject);

                        System.out.println("Subject Added Successfully, Don't Forget To Save Data!");
                    } else {
                        System.out.println("Sorry you choosed an object that does not exist");
                    }

                }

                break;

                case 4: {
                    for (int i = 0; i < subjectList.size(); i++) {
                        System.out.println((i + 1) + subjectList.get(i).toString());
                    }

                }

                break;

                case 5: {
                    System.out.println("1- Principal\n2- Teacher");
                    int choose = 0;
                    System.out.print("Enter Your Choice: ");
                    choose = sc.nextInt();
                    if (choose == 1) {

                        System.out.println("ID = " + principal.getId() 
                                + "\tName = " +  principal.getName() 
                                + "\tSalary = " + principal.getSalary() + " Dinars");

                    } else if (choose == 2) {
                        for (int i = 0; i < teacherList.size(); i++) {
                            System.out.println( "ID = " +teacherList.get(i).getId() 
                                    + "\tName = " + teacherList.get(i).getName()
                                    + "\tSalary = " + teacherList.get(i).getSalary() + " Dinars");
                        }
                    }
                }

                break;

                case 6: {
                    sc.nextLine();
                    System.out.println("Enter the subject you want to count it's students : ");
                    String countSubjectName = sc.nextLine();
                    int counter = 0;
                    for (int i = 0; i < subjectList.size(); i++) {
                        if (subjectList.get(i).getSubjectName().equalsIgnoreCase(countSubjectName)) {
                            counter++;
                        }
                    }

                    if (counter <= 0) {
                        System.out.println("Sorry, There is no such Subject");
                    } else {
                        System.out.println("The Number Of Students in " + countSubjectName
                                + "Subject = " + counter);
                    }
                }

                break;

                case 7: {
                    FManager.write(principalFilePath, principal);
                    FManager.write(teacherFilePath, teacherList);
                    FManager.write(studentFilePath, studentList);
                    FManager.write(subjectFilePath, subjectList);
                    System.out.println("Success..!!\nAll data are saved in the files");
                }

                break;
                default:
                    System.out.println("You Entered a wrong choice please try again");
            }
            System.out.println("\n\n################################");
            System.out.println("1- Add Employee\n2- Add Student\n3- Add Subject\n4- Show Subjects\n5- Show Employees Salaries\n6- Count of Student in any Subject\n7- Save data in file (Don't Forget To Save Data!)\n8- Exit");
            System.out.println("################################");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
        }
    }

    //Function to scan Employee Data >>> to reduce redundancy 
    static Employee scanEmpData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String Name = sc.nextLine();
        System.out.print("Id : ");
        int Id = sc.nextInt();
        sc.nextLine();
        System.out.print("Adress : ");
        String Adress = sc.nextLine();
        System.out.print("PhoneNumber : ");
        String PhoneNumber = sc.nextLine();
        System.out.print("Email : ");
        String Email = sc.nextLine();
        System.out.print("basicSalary : ");
        double basicSalary = sc.nextDouble();

        Employee emp = new Employee(Name, Id, Adress, PhoneNumber, Email, basicSalary) {
            @Override
            public float getSalary() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        return emp;
    }

}

/*
* Name: Hend abd mousa
* ID: 2301153428
*/
