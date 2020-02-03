import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolate {

//    static int birthday(List<Integer> s, int d, int m) {
//        int count=0;
//        int sum=0;
//        if(s.size()==1 && s.get(s.size()-1)==d)
//            return 1;
//        for(int i=0;i<s.size()-m-1;i++){
//            sum=s.get(i);
//            for(int j=i+1,k=0;k<m-1;j++,k++){
//                sum+=s.get(j);
//            }
//            if(sum==d)
//                count++;
//        }
//        return count;
//    }

//    static int birthday(List<Integer> s, int d, int m) {
//        int count=0;
//        int sum=0;
//        if(s.size()==1 && s.get(s.size()-1)==d)
//            return 1;
//        for(int i=0;i<s.size()-m;i++){
//            sum=0;
//            for(int j=i,k=0;k<m;j++,k++){
//                sum+=s.get(j);
//            }
//            if(sum==d)
//                count++;
//        }
//        return count;
//    }

    static int birthday(List<Integer> s, int d, int m) {
        int count=0;
        int sum=0;
        if(s.size()==1 && s.get(s.size()-1)==d)
            return 1;
        for(int i=0;i<s.size()-m;i++){
            sum=0;
            for(int j=0;j<m;j++){
                sum+=s.get(i+j);
            }
            if(sum==d)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<Integer>();
//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
//
//        System.out.println(birthday(s,3,2));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            s.add(sc.nextInt());
        System.out.println(birthday(s,sc.nextInt(),sc.nextInt()));
    }
}
