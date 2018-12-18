public class JavaDateTest {
    public static void main(String[] args){
        JavaDate systemCurrentDate = new JavaDate();
        String sysDate = systemCurrentDate.getCurrentDate();
        System.out.println(sysDate);
    }
}