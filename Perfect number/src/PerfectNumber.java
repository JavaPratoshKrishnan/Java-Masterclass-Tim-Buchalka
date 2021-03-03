public class PerfectNumber {
    public static void main(String[] args) {
        boolean t=isPerfectNumber(6);
        boolean t2=isPerfectNumber(28);
        boolean t3=isPerfectNumber(5);
        boolean t4=isPerfectNumber(-1);
        System.out.println(t);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);










    }
    public static boolean isPerfectNumber(int number){
        int sum=0;
        if (number<1){
            return false;
        }
        for (int i=1; i<=number; i++){
            if(number % i==0){
                sum+=i;
                if (sum==number){
                    return true;
                }



            }
        }
        return false;
    }
}
