
public class StringConvector {
    /*
    Метод latterRevert разворачивает строку не трогает символы и цифры.
     */
    public static String letterRevert(String inputString) {
        char[] outputString = inputString.toCharArray();

        if (inputString.isEmpty()) {
            return "Input string is empty";
        }

        int leftCursor = 0;
        int rightCursor = outputString.length - 1;
        while (leftCursor < rightCursor) {
            if (!Character.isLetter(outputString[leftCursor])) {
                leftCursor++;
                continue;
            }
            if (!Character.isLetter(outputString[rightCursor])) {
                rightCursor--;
                continue;
            }
            //swap
            char tempChar = outputString[leftCursor];
            outputString[leftCursor] = outputString[rightCursor];
            outputString[rightCursor] = tempChar;
            //move cursor
            leftCursor++;
            rightCursor--;
        }
        return new String(outputString);
    }
}