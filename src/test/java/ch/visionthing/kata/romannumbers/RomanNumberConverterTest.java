package ch.visionthing.kata.romannumbers;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RomanNumberConverterTest {

    private RomanNumberConverter romanNumberConverter = new RomanNumberConverter();

    @Test
    void convert_amount_to_romannumber() {
        assertThat(romanNumberConverter.convert(1), is("I"));
        assertThat(romanNumberConverter.convert(2), is("II"));
        assertThat(romanNumberConverter.convert(3), is("III"));
        assertThat(romanNumberConverter.convert(5), is("V"));
        assertThat(romanNumberConverter.convert(4), is("IV"));
        assertThat(romanNumberConverter.convert(6), is("VI"));
        assertThat(romanNumberConverter.convert(9), is("IX"));
        assertThat(romanNumberConverter.convert(10), is("X"));
        assertThat(romanNumberConverter.convert(13), is("XIII"));
        assertThat(romanNumberConverter.convert(16), is("XVI"));
        assertThat(romanNumberConverter.convert(20), is("XX"));


    }
}
