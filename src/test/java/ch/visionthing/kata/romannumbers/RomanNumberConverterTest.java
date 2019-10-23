package ch.visionthing.kata.romannumbers;




import org.junit.Test;

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
}
