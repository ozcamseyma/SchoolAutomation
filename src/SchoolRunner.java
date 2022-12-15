import java.util.Scanner;

public class SchoolRunner {

    static Scanner input = new Scanner(System.in);

    public static void schoolHomepage(){

        System.out.println("------------- School Homepage -------------");
        System.out.println("Please select the action you want to do.\n" + "1.Student.\n" + "2.Teacher.\n" + "E.Exit.");
        String select = input.next().toUpperCase();

        boolean slct = true;
        do {

            switch (select) {
                case "1":
                    System.out.println("Welcome to the student section");
                    School.studentMenu();
                    break;
                case "2":
                    System.out.println("welcome to the teacher section");
                    School.teacherMenu();
                    break;
                case "E":
                    System.out.println("Goodbye, take care");
                    break;
                default:
                    System.out.println("Wrong choice");

            }
            slct = false;
        } while (slct);








    }


}
