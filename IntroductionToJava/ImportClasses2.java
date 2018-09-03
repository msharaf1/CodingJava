public class ImportClasses2 {
    public static void main(String[] args) {
        ImportClasses iD = new ImportClasses();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}

//Java programs are heavily dependent on importing code that already has been created. It is uncommon to have Java programs that are completely standalone without any imports. Although reusing given classes and methods is common, you should always be checking the documentation for best practices and deprecation.