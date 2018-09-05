class LessonTwoB {
    //Static and non-static fields
    String text = "I’m a Simple Program";
    static String text2 = "I’m static text";
    //Methods to access data in the fields
     String getText() { return text; }
     String getStaticText() {return text2;}
    
     public static void main(String[] args){
         LessonTwoB progInstance = new LessonTwoB();
         String retrievedText = progInstance.getText();
         String retrievedStaticText = progInstance.getStaticText();
         System.out.println(retrievedText);
         System.out.println(retrievedStaticText);
        }
    }