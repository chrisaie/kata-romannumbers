package ch.visionthing.kata.romannumbers;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumberConverterTest {

    private RomanNumberConverter romanNumberConverter = new RomanNumberConverter();

    @ParameterizedTest
    @CsvSource({ "1,I", "2,II", "3,III", "4,IV" })
    void convert_amount_to_romannumber(int amount, String expectedOutput) {
        assertThat( romanNumberConverter.convert(amount), is(expectedOutput));
    }
}
