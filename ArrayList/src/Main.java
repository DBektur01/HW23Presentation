import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student>students= new ArrayList<>();
        students.add(new Student("Bektur", (byte) 23,"Group A"));
        students.add(new Student("Amir", (byte) 20,"Group B"));
        students.add(new Student("Nursultan", (byte) 24,"Group B"));
        students.add(new Student("Tilek", (byte) 26,"Group A"));
        students.add(new Student("Kadyrbek", (byte) 22,"Group A"));
        students.add(new Student("Aibek", (byte) 19,"Group B"));
        students.add(new Student("Zalkar", (byte) 23,"Group B"));
        students.add(new Student("Marsel", (byte) 27,"Group A"));
        students.add(new Student("Aktan", (byte) 23,"Group B"));
        students.add(new Student("Nuraln", (byte) 24,"Group A"));


        System.out.println("""
                1. All Students
                2. Java Students
                3. JavaScript Students
                4. Filter by age
                5. Filter by name
                """);
        while(true) {
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> printAllStudents(students);

                case 2 -> {
                    ArrayList<Student> javaStudents = filerByGroup(students, "Group A");
                    printAllStudents(javaStudents);
                }
                case 3 -> {
                    ArrayList<Student> javaScriptStudents = filerByGroup(students, "Group B");
                    printAllStudents(javaScriptStudents);
                }
                case 4 -> {
                    ArrayList<Student> filterByAge = filterByAge(students, (byte) 19, (byte) 23);
                    printAllStudents(filterByAge);
                }
                case 5 -> {
                    ArrayList<Student> filerByName = filterByName(students, 'A');
                    System.out.println(filerByName);
                }
            }
        }
    }
    public  static  void  printAllStudents(ArrayList<Student>students){
        for (Student s:students) {
            System.out.println(s.getName()+" "+s.getAge()+" "+s.getGroup());
        }
    }
    public static ArrayList<Student> filerByGroup(ArrayList<Student>students,String group){
        ArrayList<Student>result=new ArrayList<>();
        for (Student s:students){
            if(s.getGroup().equals(group)){
                result.add(s);
            }
        }return  result;
    }
    public static  ArrayList<Student> filterByAge(ArrayList<Student>students,byte minAge, byte maxAge){
        ArrayList<Student>result=new ArrayList<>();
        for (Student s:students) {
            if(s.getAge()>=minAge&&s.getAge()<=maxAge){
                result.add(s);
            }
        }return result;
    }
    public  static  ArrayList<Student> filterByName(ArrayList<Student>students,char firstLetter){
        ArrayList<Student>result=new ArrayList<>();
        for (Student s:students) {
            if(s.getName().charAt(0)==firstLetter){
                result.add(s);
            }
        }return result;
    }
}