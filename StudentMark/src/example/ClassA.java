package example;

public class ClassA {

    public static void main(String args[]) {

        ClassD D1 = new ClassD();

        D1.setName("Tom");
        D1.setbranch("Computer Science");
        D1.setDivision('A');
        System.out.println("Name : " +D1.getName());
        System.out.println("Branch : " +D1.getbranch());
        System.out.println("Division : " +D1.getDivision());
        D1.feedback();



    }
}
