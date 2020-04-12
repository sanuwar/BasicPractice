public class LetsPractice {
    public static void main(String[] args) {
        String number = "121asdDJLK*(*&";

        int upperCaseLetter = 0;
        int lowerCaseLetter  =0;
        int digit = 0;
        int other = 0;

        for(int i = 0; i <number.length(); i++){
        if (Character.isUpperCase(number.charAt(i))) {
            upperCaseLetter++;
        }
            else if (Character.isLowerCase(number.charAt(i))) {
                lowerCaseLetter++;
            }

            else if (Character.isDigit(number.charAt(i))){
            digit++;
            }
            else other++;
    }
        System.out.println("upper: " + upperCaseLetter);
        System.out.println("lower: " + lowerCaseLetter);
        System.out.println("digit: " + digit);
        System.out.println("ohter: " + other);
}
}