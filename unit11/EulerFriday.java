package unit11;

public class EulerFriday {

    public static void main(String[] args) {

        // 1
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if(i%3 == 0 || i% 6 == 0){
                sum+=i;
            }

        }



        System.out.println(sum);

        // 2

        sum = 0;
        int a = 1;
        int b = 2;
        int c;
        while(b<4000000){
            c=a+b;
            a=b;
            b=c;
            if(b%2 ==0){
                ++sum;
            }
        }

        System.out.println(sum);

        //3
        long factorMe = 6008514751431;
        int factor = 2;
        while() {
            if(factorMe % factor == 0){
                factorMe /= factor;
            }
            else{
                factor++;
            }
        }

    }

}
