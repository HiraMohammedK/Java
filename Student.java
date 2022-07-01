import java.util.Scanner;

public class Student{
    int number_of_students ;
    int RollNo;
    String Name;
    float mark1,mark2,mark3;
    float total;
    Scanner input = new Scanner(System.in);
    public Student(){};
    public Student(int n){
        number_of_students = n;
        total=0;
        Scanner input = new Scanner(System.in);
        
        }
    public void get_data(){
        	
            System.out.print("Enter the name of the student\t: ");
            Name = input.next();
            System.out.print("Enter the Roll no of the student\t: ");
            RollNo = input.nextInt();
            System.out.print("Enter mark of subject 1\t: ");
            mark1 = input.nextFloat();
            System.out.print("Enter mark of subject 2\t: ");
            mark2 = input.nextFloat();
            System.out.print("Enter mark of subject 3\t: ");
            mark3 = input.nextFloat();
            
        }
    public void get_total(){
        	if (mark1 < 50 || mark2 < 50 || mark3 < 50)
                total = 0;
            else 
                total = mark1 + mark2 + mark3;
        }
        
    
    public void display(){
        System.out.println("Name:"+Name);
        System.out.println("Roll No:"+RollNo);
        System.out.println("Mark in subject 1:"+mark1);
        System.out.println("Mark in subject 2:"+mark2);
        System.out.println("Mark in subject 3:"+mark3);
        System.out.println("Total:"+total);
    }

    

    public static void main(String arg[]){
        int n;
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Student[] arr;
        arr = new Student[n];
        for (int i = 0 ; i < n ; i++){
        	arr[i]=new Student();
        	arr[i].get_data();
            arr[i].get_total();
            arr[i].display();
        }
        
    }
}