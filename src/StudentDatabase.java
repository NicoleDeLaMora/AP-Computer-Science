//Nicole de la Mora // 12/13/22 // Student Database
import java.util.*;
public class StudentDatabase {



    public static int indexOfStudent(ArrayList<Student> db, int id){
        int index = -1;
        for(int lcv = 0; lcv < db.size(); lcv++){
            if(db.get(lcv).getId() == id)
                index = lcv;
        }
        return index;
    }
    public static int indexOfStudent(ArrayList<Student> db, String Last){
        int index = -1;
        for(int lcv = 0; lcv < db.size(); lcv++){
            if(db.get(lcv).getLastName().equals(Last))
                index = lcv;
        }
        return index;
    }

    public static void PrintStu(Student stu){
        System.out.printf("%s\t%s\t%d\t%f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){  //infinite loop
            System.out.println("\nStudent Menu:\n");
            System.out.println("1 - Ass new Student");
            System.out.println("2 - Display all Students");
            System.out.println("3 - Search for Student(by id)");
            System.out.println("4 - Search for Student (by last name");
            System.out.println("5 - Modify a Student's GPA");
            System.out.println("6 - Remove Student(by id)");
            System.out.println("7 - Exit\n\nPlease enter your choice:");
            int c = input.nextInt();

            ArrayList<Student> db = new ArrayList<Student>();

            if(c==1){
                System.out.print("Enter First Name: ");
                String First = input.next();
                System.out.print("Enter Last Name: ");
                String Last = input.next();
                System.out.print("Enter Student ID: ");
                int ID = input.nextInt();
                System.out.print("Enter Student GPA: ");
                Double GPA = input.nextDouble();
                Student st = new Student(First, Last, ID, GPA);
                db.add(st);

            }else if (c==2){
                System.out.println("First\n Last\nID\nGPA\n");
                for(Student stu : db){
                    PrintStu(stu);
                }

            }else if (c==3){
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStudent(db, id);
                if (index != -1){
                    PrintStu(db.get(index));
                }else System.out.print("No Student Was Found With That ID.");
            }else if (c==4){
                System.out.print("Enter the Student's Last Name: ");
                String Last = input.next();
                int index = indexOfStudent(db, Last);
                if(index!=-1){
                    PrintStu(db.get(index));
                }else System.out.print("No Student Was Found With That Last Name.");
            }else if (c==5){

            }else if (c==6){

            }else if(c==7){
            return;
            }



        }
    }
}
