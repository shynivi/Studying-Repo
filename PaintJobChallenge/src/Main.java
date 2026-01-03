public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getBucketCount(6.12,3.11,1.25,2));
        //System.out.println(getBucketCount(7.25,4.3,2.35));
       // System.out.println(getBucketCount(6.26,2.2));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0)
        {
            return -1;
        }
        double wallArea = width * height;

        return (int)  Math.ceil((wallArea / areaPerBucket) - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        double wallArea = width * height;
        return (int) Math.ceil(wallArea/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        if(area <= 0 || areaPerBucket <= 0)
        {
            return -1;
        }
        int bucketCount = 0;
        while(area > 0)
        {
            area -= areaPerBucket;
            bucketCount++;
        }
        return bucketCount;
    }
}
