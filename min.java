public class min {
    public static void main (String[]args) {
        int b [] = {100,200,300,400,500};
        int min = b[0];
        for (int i = 0; i < b.length;i++) {
            if (b[i]<min) {
                min = b[i];
            }
        }
         System.out.println("min element:" +min);
    }

}
