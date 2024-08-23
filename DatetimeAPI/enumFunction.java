package DatetimeAPI;

enum Week{
    MON, TUE, WED, THU, FRI, SAT;
}

enum Result{
    PASS, FAIL, NR;

    int marks;

    Result(){
        System.out.println("Constructor in Enum");
    }

    void steMarks(int marks){
        this.marks = marks;
    }

    int getMarks(){
        return marks;
    }

}

public class enumFunction {
    // enum Result{
    //     PASS, FAIL, NR;
    // }
    public static void main(String[] args) {
          Week w = Week.MON;
          System.out.println(w);
  
          int index = Week.MON.ordinal();
          System.out.println(index);
  
          Week []wr = Week.values();
          for (Week w1 : wr) {
              System.out.println(w1 + " : " + w1.ordinal());
          }
  
          // Result r = Result.PASS;
          // System.out.println(r);
  
  
          Result.PASS.marks = 50;
          int m1 = Result.PASS.getMarks();
          System.out.println(m1);
    }
}
