package example;

 public class ClassC {
    private String name;
    private  String branch ;
    private  char division;


    public void setName(String name) {
        this.name = name;
    }

    public void setbranch(String branch) {
        this.branch = branch;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public String getbranch() {
        return branch;
    }

    public char getDivision() {
        return division;
    }
    public void feedback(){
        System.out.println("course is nice");
    }

}
