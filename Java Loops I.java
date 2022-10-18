import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.close();

        for(int i=1;i<=10;i++){
            System.out.println(myInt+" x "+i+" = "+(myInt*i));
        }
    }
}
