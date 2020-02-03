import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int ar[] = new int[123];
        int br[] = new int [123];
        String aa = a.toUpperCase();
        String bb = b.toUpperCase();
        for(int i=0;i<aa.length();i++)
            ar[aa.charAt(i)]++;
        for (int i=0;i<bb.length();i++)
            br[bb.charAt(i)]++;
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=br[i])
                return false;
        }
        return true;
     }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
