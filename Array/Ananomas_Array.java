class cal{
    public int add(int nums[]){
        int result=0;
        for(int n : nums){
            result += n;
        }
        return result;
    }
}
public class Ananomas_Array {
    public static void main(String[] args) {
        cal o1 = new cal();
        int result = o1.add(new int[]{1,3,4,5});
        System.out.println(result);
    }
}
