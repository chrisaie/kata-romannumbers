package ch.visionthing.kata.romannumbers;





import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumberConverterTest {

    @Test
    public void should_return_I_for_1() {
        //Given
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        //When

        //Then
        assertThat(romanNumberConverter.convert(1), is("I"));
    }

    @org.junit.jupiter.api.Test
    public void should_return_II_for_2() {
        //Given
        RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
        //When

        //Then
        assertThat(romanNumberConverter.convert(2), is("II"));
    }
}
