public class timecomplexity {
    static void main(String[] args) {
        int n = 10;
        int count = 0;


        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println(count);

    }
    static  void optimised (int n) {
        int factorCount = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                factorCount=factorCount+2;
            }

        }

    }
}
