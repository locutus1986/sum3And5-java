public class sum3and5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if(i%3 == 0 && i%5 == 0){
                count++;
                sum += i;
                System.out.println(i + " is divisible by 3 and 5");
                if(count == 5){
                    break;
                }
            }
        }
        System.out.println("the sume is: " + sum);
    }
}
