public class copyarray {
    public static void main(String[]args) {
        int arr1[] = new int[] {2,3,4,5,6,7};
        int arr2[] = new int[arr1.length];
        for(int i = 0;i <arr1.length; i++) {
            arr2[i] =arr1[i];
        }
            System.out.println("enter the original element:");
            for(int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]);
            }
                System.out.println();

                System.out.println("enter the new array:");
                for(int i = 0;i <arr2.length; i++) {
                    System.out.println(arr2[i]);
                }
            }
        
}