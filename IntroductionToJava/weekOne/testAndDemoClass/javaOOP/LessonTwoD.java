class LessonTwoD{
    String text;

    //Constructor
    LessonTwoD(){
        text = "I'm a Simple Program";
    }
    String getText(){
        return text;
    }
    public static void main(String[] args){
        LessonTwoD progInstance = new LessonTwoD();
        String retrievedText = progInstance.getText();
        System.out.println(retrievedText);
    }
}