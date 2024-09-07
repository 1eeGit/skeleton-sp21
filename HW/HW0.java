public class HW0 {

    /**EX1a,1b **/
    public static void drawTriangle(int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

     /**EX2,3 **/
     public static int max(int[] m) {
        int max = 0;
        for (int i=0; i<m.length; i++){
            if(max<= m[i])
                max=m[i];
        }
        return max;
    }


      /**EX4 **/
     public static void windowPosSum(int[] a, int n){
        for(int i=0; i<a.length; i++){
            if(a[i]>=0){
                if(a.length - i>3){
                    a[i] = a[i]+a[i+1]+a[i+2] + a[i+3];
                }
                else{
                    for (int j=1; j<a.length-i;j++){
                        a[i] += a[i+j];
                    }
                }  
            }
        }


     } 
    public static void main(String[] args) {
        drawTriangle(5);

        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};   
        System.out.println("Maxmium: " + max(numbers));

        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}