package example;

 public class  ClassD extends ClassC{
     private int [] marks;
     private int rank;



     public int[] getMarks() {
         return marks;
     }

     public void setMarks(int[] marks) {
         this.marks = marks;
     }

     public int getRank() {
         return rank;
     }

     public void setRank(int rank) {
         this.rank = rank;
     }
     public void feedback(){
         System.out.println("course is AWESOME");

     }

 }
