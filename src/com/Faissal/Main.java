import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array()));
    }
    public static int[] array(){
        int[] arr={1,7,4,5,89,12,99,56,78};

        int i=1;
        for(int j =1 ; j<arr.length; ++j)
        {
            int m;
            while (arr[j]>arr[i])
            {
                i=i+1;
            }
            m=arr[j];
            for(int k=0 ; k<= j-i-1 ;++k)
            {
                arr[j-k]=arr[j-k-1];
            }
            arr[i]=m;
        }
        return arr;
    }
}
