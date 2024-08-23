class Calc{
    public int sum(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
public class Calc_clss {
    public static void main(String[] args) {
        Advance_cal o1 = new Advance_cal();            //when AdvanceCale Inherit Calc then its call single inheritence
        int t1 = o1.sum(2, 3);
        int t2 = o1.sub(5, 1);
        int t3 = o1.mul(5, 2);   
        int t4 = o1.div(4, 2);
        System.out.println(t1 + " " + t2 + " " + t3 + " " + t4);
    }
}