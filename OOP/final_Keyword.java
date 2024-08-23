// Variable, method & calss

// when you make your class final you mainly stop the inheritence
// final class calc{
//     public void show(){
//       System.out.println("In Calc Show");
//     }
//     public void add(int a, int b){
//       System.out.println(a+b);
//     }
// }
// class advCal extends calc{

// }


//If you make your method final then anyone can not copy your method
// class calc{
//     final public void show(){
//       System.out.println("By sunil sahoo");
//     }
//     public void add(int a, int b){
//       System.out.println(a+b);
//     }
// }
// class advCal extends calc{
//     public void show(){
//         System.out.println("By Rohon");
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }
public class final_Keyword {
    public static void main(String[] args) {
    // variables
        int a = 6;
        System.out.println(a);
        a = 10;
        System.out.println(a);

        // Heare we can see that we can easyly change the value of the variable
        // But when we declare the variable using final keyword then we can not change the value of the variable 

        // final int b = 10;
        // System.out.println(b);
        // b = 11;
        // System.out.println(b);

    // classs & methods
        // calc obj = new calc();
        // obj.show();
        // obj.add(4, 5);

    }
}
