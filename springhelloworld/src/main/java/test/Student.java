package test;

public class Student {
    private String name;
    private Homework homework;

    public Student(){}
    public Student(String name, Homework homework) {
        this.name = name;
        this.homework = homework;
    }

    public void doHomeWork(){
        System.out.println(homework.getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Homework getHomework() {
        return homework;
    }

    public void setHomework(Homework homework) {
        this.homework = homework;
    }
}
