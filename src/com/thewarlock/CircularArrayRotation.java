public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int temp = 0;
        int nor = k % a.length;

        while (nor > 0) {
            temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
            nor--;
        }

        int result[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = a[queries[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] queries = {0, 1, 2};
        int []ar=circularArrayRotation(a, 2, queries);
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);

    }
}
