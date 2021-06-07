/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.manegement.system;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Yehya Adam
 */
public class SchoolManegementSystem {

    /**
     * *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        ArrayList<Subject> subjectList = new ArrayList<Subject>(); 
        Principal p = new Principal();
     int choice = 0;
     
//        try
//        {
//        File info = new File("Project.dat");
//        info.createNewFile();          
//        }catch(IOException e )
//        {
//            System.out.println("Error occured");
//            e.printStackTrace();
//        }
        System.out.println("1- Add Employee\n2- Add Student\n3- Add Subject\n4- Show Subjects\n5- Show Employees Salaries\n6- Count of Student in any Subject\n7- Save data in file\n8- Exit\n");
        System.out.print("Enter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        while (choice != 8) {
            switch (choice) {
                
                case 1: {
                    System.out.println("1- Principal\n2- Teacher");
                    int choose = 0;
                    choose = sc.nextInt();
                    if(choose == 1)
                    {
                        System.out.println("Enter Principal details");
                      

                    }
                    else
                    {
                            System.out.println("Enter Teacher details");
                    }
                    
                }
                
                break;
                
                case 2: {
                    System.out.println("Enter Student details");
                }
                
                break;
                
                case 3: {
                        System.out.println("Enter Subject details");
                }
                
                break;
                
                case 4: {
                        // Hate2ra mn el file w bos 3la el soora
                }
                
                break;
                
                case 5: {
                    // Hate2ra mn el file w bos 3la el soora
                    System.out.println("1- Principal\n2- Teacher");
                    int choose = 0;
                    choose = sc.nextInt();

                }
                
                break;
                
                case 6: {
                    System.out.println("Enter the subject you want to count it's students");
                }
                
                break;
                
                case 7: {
                        // Hena hatwrite f el file w t save kol el data bta3tk
                          try{    
                    FileWriter fw=new FileWriter("Project.dat");    
                        // ektb hena elly enta 3aiz tktbo gwa el file 
                        fw.close();    
                    }   catch(Exception e){System.out.println(e);}    
                        System.out.println("Success...");    
                    }    
                
                
                break;
                default:
                    System.out.println("You Entered a wrong choice please try again");
            }
            System.out.println("1- Add Employee\n2- Add Student\n3- Add Subject\n4- Show Subjects\n5- Show Employees Salaries\n6- Count of Student in any Subject\n7- Save data in file\n8- Exit\n");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
        }
    }

}
