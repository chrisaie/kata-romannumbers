package ch.visionthing.kata.romannumbers;

public class RomanNumberConverter {
    public String convert(int amount) {
        if(amount == 2) {
            return "II";
        }
        return "I";
    }
}
