import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main ( String[] args ) {
        StudentSystem system = new StudentSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Telebe elave et");
            System.out.println("2.Telebe redakde(update) et");
            System.out.println("3.Telebeleri goster");
            System.out.println("emeliyyati secin as int");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Telebe adi");
                    String name = scanner.nextLine();
                    System.out.println("Telebenin yasi:");
                    int age = scanner.nextInt();
                    System.out.println("Qeydiyyat nomresi");
                    int registrationNumber = scanner.nextInt();
                    system.addStudent(new Student(name, age, registrationNumber));
                    break;
                case 2:
                    System.out.println("yeni ad");
                    String newName = scanner.nextLine();
                    System.out.println("yeni yas");
                    int newAge = scanner.nextInt();
                    System.out.println("yeni registrationNumber");
                    int newRegistrationNumber = scanner.nextInt();
                    system.updateStudent(newName, newAge, newRegistrationNumber);
                    break;
                case 3:
                    system.displayDetails();
                    break;
                case 4:
                    System.out.println("sistemden cix");
                    scanner.close();
                    return;
                default:
                    System.out.println("Yanlis emeliyyatdi");
            }
        }
    }
}