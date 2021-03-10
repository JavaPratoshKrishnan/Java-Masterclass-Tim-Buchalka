public class PaintJob {
    public static void main(String[] args) {
//       int t= getBucketCount(-3.4,2.1,1.5,2);
//       int t2= getBucketCount(3.4,2.1,1.5,2);
//       int t3= getBucketCount(2.75,3.25,2.5,1);
//       System.out.println(t);
//       System.out.println(t2);
//       System.out.println(t3);
//        int t= getBucketCount(-3.4,2.1,1.5);
//        int t2= getBucketCount(3.4,2.1,1.5);
//        int t3= getBucketCount(7.25,4.3,2.35);
//        System.out.println(t);
//        System.out.println(t2);
//        System.out.println(t3);
        int t= getBucketCount(3.4,1.5);
        int t2= getBucketCount(6.26,2.2);
        int t3= getBucketCount(3.26,0.75);
        System.out.println(t);
        System.out.println(t2);
        System.out.println(t3);






    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0) {
            return -1;
        }

        return getBucketCount(width, height, areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }

        return getBucketCount(width * height, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ( area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }

        return (int) Math.ceil(area/areaPerBucket);
    }
}
