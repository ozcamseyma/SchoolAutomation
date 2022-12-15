import java.util.*;

public class School {


        static Scanner input = new Scanner(System.in);
        static Map<String,Student> studentList = new HashMap<>();
        static Set<Map.Entry<String,Student>> studentListSet = studentList.entrySet();
        static Set<String> identityNumberList = studentList.keySet();
        static Map<String,Teacher> teacherList = new HashMap<>();
        static Set<Map.Entry<String,Teacher>>  teacherListSet = teacherList.entrySet();
        static Set<String> identityNumberTeacherList  = teacherList.keySet();

        public static void studentMenu(){

            System.out.println("***** Student Menu *****");
            System.out.println("1.Add\n" + "2.Search\n" + "3.Listing\n" + "4.Deletion\n" + "5.Exit");
            System.out.println("Please make a login.");
            String login = input.next().toUpperCase();

            boolean lgn = true;
            do {

                switch (login) {
                    case "1":
                        add();
                        studentMenu();
                        break;
                    case "2":
                        search();
                        studentMenu();
                        break;
                    case "3":
                        listing();
                        studentMenu();
                        break;
                    case "4":
                        deletion();
                        studentMenu();
                        break;
                    case "5":
                        System.out.println("We are waiting for you again.");
                        break;
                    default:
                        System.out.println("Wrong login!");
                        studentMenu();
                }
                lgn = false;
            } while (lgn);

        }

    public static void teacherMenu(){

        System.out.println("***** Student Menu *****");
        System.out.println("1.AddTeacher\n" + "2.SearchTeacher\n" + "3.ListingTeacher\n" + "4.DeletionTeacher\n" + "5.Exit");
        System.out.println("Please make a login.");
        String loginTeacher = input.next().toUpperCase();

        boolean lgnTchr = true;
        do {

            switch (loginTeacher) {
                case "1":
                    addTeacher();
                    teacherMenu();
                    break;
                case "2":
                    searchTeacher();
                    teacherMenu();
                    break;
                case "3":
                    listingTeacher();
                    teacherMenu();
                    break;
                case "4":
                    deletionTeacher();
                    teacherMenu();
                    break;
                case "5":
                    System.out.println("We are waiting for you again.");
                    break;
                default:
                    System.out.println("Wrong login!");
                    teacherMenu();
            }
            lgnTchr = false;
        } while (lgnTchr);

    }

    public static void add(){

            System.out.println("----- Add Student Section -----");
            System.out.println("Enter the 11-digit ID number of the student you want to add :");
            String identityNumber = input.next();

            if( identityNumber.matches("[0-9]{11}")){

                System.out.println("Please enter the name of the student you want to add :");
                String studentName = input.next();

                System.out.println("Please enter the surname of the student you want to add :");
                String studentSurname = input.next();

                System.out.println("Please enter the age of the student you want to add :");
                int age = input.nextInt();

                System.out.println("Please enter the school number of the student you want to add :");
                int number = input.nextInt();

                boolean selection = true;

                do {

                    System.out.println("Please enter the grade of the student you want to add :");
                    int classroom = input.nextInt();
                    switch (classroom) {
                        case 1:
                            System.out.println("primary school");
                            break;
                        case 2:
                            System.out.println("middle school");
                            break;
                        case 3:
                            System.out.println("high school");
                            break;
                        case 4:
                            System.out.println("university");
                            break;
                        default:
                            System.out.println("wrong login");

                    }
                    selection = false;
                } while (selection);

                Student student = new Student(identityNumber,studentName,studentSurname,age,number);
                studentList.put(identityNumber,student);

                System.out.println("The student has been successfully added.");


            } else {
                System.out.println("Incorrect ID number entry.");
            }



        }

        public static void addTeacher(){

            System.out.println("----- Add Teacher Section -----");
            System.out.println("Enter the 11-digit ID number of the teacher you want to add :");
            String identityNumberTeacher = input.next();

            if (identityNumberTeacher.matches("[0-9]{11}")){
                System.out.println("Please enter the name of the teacher you want to add :");
                String teacherName = input.next();

                System.out.println("Please enter the surname of the teacher you want to add :");
                String teacherSurname = input.next();

                System.out.println("Please enter the age of the teacher you want to add :");
                int ageTeacher = input.nextInt();

                System.out.println("Please enter the department of the teacher you want to add :");
                String section = input.next();

                System.out.println("Please enter the registration number of the teacher you want to add :");
                int recordNumber = input.nextInt();

                Teacher teacher = new Teacher(teacherName,teacherSurname,ageTeacher,section,recordNumber);
                teacherList.put(identityNumberTeacher,teacher);

                System.out.println("The student has been successfully added.");

            } else {
                System.out.println("Incorrect ID number entry.");
            }

        }

        public static void search(){

            System.out.println("----- Student Search Department -----");
            System.out.println("Enter the ID number of the student you want to call : ");
            String identityNumber = input.next();

            if( identityNumberList.contains(identityNumber)){
                Student student = studentList.get(identityNumber);
                System.out.println(student);
                System.out.println(identityNumber + " " + "We have a student with this ID number.");
            } else {
                System.out.println("We do not have a student with the ID number you are looking for.");
            }


        }

        public static void searchTeacher(){

            System.out.println("----- Teacher Search Department -----");
            System.out.println("Enter the ID number of the teacher you want to call : ");
            String identityNumberTeacher = input.next();

            if (identityNumberTeacherList.contains(identityNumberTeacher)){

                Teacher teacher = teacherList.get(identityNumberTeacher);
                System.out.println(teacher);
                System.out.println(identityNumberTeacher + " " + "We have a teacher with this ID number.");

            } else {
                System.out.println("We do not have a teacher with the ID number you are looking for.");
            }


        }

        public static void listing(){

            System.out.println("----- Student Listing Section -----");
            System.out.println("## Studens ##" + "\n-------------------------------------------");

            for (Map.Entry<String,Student> w : studentListSet){

                String key = w.getKey();

                System.out.printf(key,studentList.get(key).getStudentName(),
                        studentList.get(key).getStudentSurname(),studentList.get(key).getAge(),studentList.get(key).getNumber(),studentList.get(key).getClassroom());



            }



        }

        public static void listingTeacher(){

            System.out.println("----- Teacher Listing Section -----");

            for (Map.Entry<String, Teacher> w : teacherListSet) {

                String key = w.getKey();

                System.out.printf(key,teacherList.get(key).getTeacherName(),teacherList.get(key).getTeacherSurname(),
                                         teacherList.get(key).getAgeTeacher(),teacherList.get(key).getSection(),teacherList.get(key).getRecordNumber());

            }

        }


        public static void deletion(){

            System.out.println("----- Student Deletion Section -----");
            System.out.println("Enter the ID number of the student you want to delete.");
            String deletingStudent = input.next();

            if (identityNumberList.contains(deletingStudent)){

                System.out.println("Student information to be deleted ...");

                System.out.println(studentList.get(deletingStudent));

                studentList.remove(deletingStudent);

                System.out.println("Student has been deleted successfully");


            } else {


                System.out.println("Wrong ID number entry");

            }

        }

        public static void deletionTeacher(){

            System.out.println("----- Teacher Deletion Section -----");
            System.out.println("Enter the ID number of the teacher you want to delete.");
            String deletingTeacher = input.next();

            if(identityNumberTeacherList.contains(deletingTeacher)){

                System.out.println("Teacher information to be deleted ...");

                System.out.println(teacherList.get(deletingTeacher));

                teacherList.remove(deletingTeacher);

                System.out.println("Teacher has been deleted successfully");

            } else {

                System.out.println("Wrong ID number entry");
            }





        }





}
