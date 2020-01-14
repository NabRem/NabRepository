
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Storing Students information in an object array
 * @author nabil
 *@version
 */
public class DisplayStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] s = new Student[5];

        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<s.length;i++){
            s[i]= new Student();
            System.out.println("Enter ID: ");
            s[i].setId(scan.nextInt());
            System.out.println("Enter Name: ");
            s[i].setName(scan.nextLine());
            System.out.println("Enter Address");
            s[i].setAddress(scan.nextLine());
        }
        
        for (int i =0; i<s.length; i++){
            System.out.println("Id: "+ s[i].getId() + "\nName: " + s[i].getName()+"\nAddress: "+ s[i].getAddress());
        }
    }
    
}
