
public class StringConvector {
    /*
    Метод latterRevert разворачивает строку не трогает символы и цифры.
    Реализация: два курсора, двигаються на встречу друг другу. Если
    указатели курсора направленны на буквы одновремменно то происходит
    swap(замен букв местами). Условия выхода из цикла, встреча курсоров
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