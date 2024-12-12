public class Student {
    private String name;
    private int age;
    private int registrationNumber;
    public Student ( String name, int age, int registrationNumber ) {
        this.name = name;
        this.age = age;
        this.registrationNumber = registrationNumber;
    }
    public String getName () {
        return name;
    }
    public void setName ( String name ) {
        this.name = name;
    }
    public int getAge () {
        return age;
    }
    public void setAge ( int age ) {
        this.age = age;
    }
    public int getRegistrationNumber () {
        return registrationNumber;
    }
    public void setRegistrationNumber ( int registrationNumber ) {
        this.registrationNumber = registrationNumber;
    }
    @Override
    public String toString () {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", registrationNumber=" + registrationNumber +
                '}';

    }
}

