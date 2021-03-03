public class NumberToWords {
    public static void main(String[] args) {
//        int t=getDigitCount(0);
//        int t2=getDigitCount(123);
//        int t3=getDigitCount(-12);
//        int t4=getDigitCount(5200);
//        System.out.println(t);
//        System.out.println(t2);
//        System.out.println(t3);
//        System.out.println(t4);
//        int r=reverse(-121);
//        int r2=reverse(1212);
//        int r3=reverse(1234);
//        int r4=reverse(100);
//        System.out.println(r);
//        System.out.println(r2);
//        System.out.println(r3);
//        System.out.println(r4);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);










    }
    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        number = reverse(number);
        for (int i = digitCount; i > 0; i--) {
            switch (number % 10) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
            }
            number /= 10;
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            reverseNum *= 10;
            reverseNum += (number % 10);
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        if (digitCount == 0) {
            digitCount++;
        }
        return digitCount;
    }

    }


