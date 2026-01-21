
import java.util.Arrays;

public class Reverse {
    public static void Reverse(int[] ar) {
    int i = 0,  j = ar.length - 1;
    while (i < j) {
    int temp = ar[i];
    ar[i] = ar[j];
    ar[j] = temp;
    i++;
    j--;  // Correct: move toward the center
}
    }
     
    public static void main(String[]args) {
    int ar[] = {2,4,6,8,10,};
    System.out.println("original array:"+ Arrays.toString(ar));
    Reverse(ar);
    System.out.println("reverse array:"+ Arrays. toString (ar));
} 
    }