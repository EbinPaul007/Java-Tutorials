package example;

public class Student implements Comparable<Student> {
private int ID;
private String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {

        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public String toString(){
        return ID + " " + name;
    }

    public int compareTo(Student that) {
        return Integer.compare(this.ID, that.ID);
    }

}

