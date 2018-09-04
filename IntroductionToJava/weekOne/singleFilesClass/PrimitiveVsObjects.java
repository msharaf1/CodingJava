//Performance: Object types are an instance of a class. They usually hold data and methods. Therefore, their memory capacity is much bigger than their primitive counterpart. Let's look an example

public class PrimitiveVsObjects {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum:" + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " Seconds");
    }
}

//In our system, we get the following result (you will probably have a different result in your system):

//Sum: 1073741825
//Time of execution: 6.477 seconds
//Now, that's a lot of seconds just to get the sum of integers. Why is it taking so long? Well, we naively set the sum variable to Integer type. Therefore, in our for-loop, every time we add i to sum, we are actually creating an instance of Integer with the value of i. Totally unnecessary. All we have to do is declare sum to be an int from the beginning.
