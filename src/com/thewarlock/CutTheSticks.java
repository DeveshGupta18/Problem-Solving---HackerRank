import java.util.Arrays;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        StringBuffer str= new StringBuffer("");
        Arrays.sort(arr);
        int size=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1])
                size++;
        }
        int ar[] = new int[size];
        ar[0]=arr.length;
        for(int i=0;i<arr.length;i++)
            str.append(arr[i]);
        System.out.println(str);
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,3,2,1};
        int ar[]=cutTheSticks(arr);
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);
    }
}
