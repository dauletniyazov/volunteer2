//public class FirstCharCheck {
//    public static void main (String[] args){
//        System.out.println(repFirstChar( "test"));
//    }
//    public static String repFirstChar(String s){
//        char c = s.charAt(0);
//        if(...){ //please fix condition
//            return "upper";
//        } else if (...){ //please fix condition
//            return "lower";
//        } else if (...){ //please fix condition
//            return "digit";
//        } else { //please fix condition
//            return "other";
//        }
//
//    }
//}
public class FirstCharCheck {
    public static void main(String[] args) {
        System.out.println("The program checks if a string starts with lower/upper/digit character " +
                "or other.");
        System.out.println("");
        System.out.println(repFirstChar("teeeeest")); // the output should be: "lower"
        System.out.println(repFirstChar("Teeeeest")); // the output should be: "upper"
        System.out.println(repFirstChar("9teeeest")); // the output should be: "digit"
        System.out.println(repFirstChar("/teeeest")); // the output should be: "other"
    }

    public static String repFirstChar(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) { // condition checks if upper
            return "upper";
        } else if (Character.isLowerCase(c)) { // condition checks if  lowercase
            return "lower";
        } else if (Character.isDigit(c)) { // condition checks if  digit
            return "digit";
        } else { // If nothing from above, then should be just other
            return "other";
        }
    }
}
