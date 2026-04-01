package com.example;

import com.example.converter.StringConverter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка StringConverter")
public class LetterRevertMethodTest {
    @Tag("not null inputString")
    @DisplayName("Проверка переворота только букв")
    @ParameterizedTest(name = "[{index}] {0} -> {1}")
    @CsvSource({
            "123, 123",
            "ab, ba",
            "AbCd, dCbA",
            "asd, dsa",
            "абвг, гвба",
            "as-df, fd-sa",
            "as1df, fd1sa",
            "'', ''",
            "@@@, @@@",
            "a, a",
            "a-bC-dEf-ghIj, j-Ih-gfE-dCba",

    })
    public void shouldRevertOnlyLetters(String inputString, String expected) {
        assertEquals(expected, StringConverter.letterRevert(inputString));
    }

    @Tag("input string is null")
    @DisplayName("Проверка проверка при передаче null объекта")
    @ParameterizedTest
    @MethodSource("nullData")
    public void shouldReturnEmptyStringWhenInputIsNull(String inputString, String expected) {
        assertEquals(expected, StringConverter.letterRevert(inputString));
    }
    static Stream<Arguments> nullData() {
        return Stream.of(
                Arguments.of(null, "")
        );
    }

    @Tag("length string")
    @DisplayName("Длинна строки не изменяется")
    @Test
    public void shouldKeepSameLength() {
        String inputString = "asd-123 er";
        int inputStringLength = inputString.length();
        String resultLength = StringConverter.letterRevert(inputString);
        assertEquals(inputStringLength, resultLength.length());
    }
}
