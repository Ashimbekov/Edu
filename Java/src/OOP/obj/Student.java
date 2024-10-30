package OOP.obj;

public class Student {
    private String name;
    private int mark;

    public Student() {}

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Нурдаулет", 100);
        Student st2 = new Student("Нурдаулет2", 90);
        Student st3 = new Student("Нурдаулет3", 95);

        System.out.println(st1.getMark());
        System.out.println(st2.toString());
    }
}
