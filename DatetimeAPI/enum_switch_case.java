package DatetimeAPI;

enum Result1{
    PASS, FAIL, NR;
}

public class enum_switch_case {
    public static void main(String[] args) {
        // Result1 res = Result1.PASS;
        // Result1 res = Result1.FAIL;
        Result1 res = Result1.NR;
        switch (res) {
            case PASS: System.out.println("Passed.....");
                break;
            case FAIL: System.out.println("Failed....."); 
                break;
            case NR: System.out.println("No Result....");
            default: System.out.println("Your code Successfully Running");
                break;
        }
    }
}