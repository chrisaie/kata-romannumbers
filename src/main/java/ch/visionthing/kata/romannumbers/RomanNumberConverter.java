package ch.visionthing.kata.romannumbers;

public class RomanNumberConverter {
    public String convert(int amount) {
        StringBuilder sb = new StringBuilder();
        if(amount < 4) {
            for (int i = 1; i <= amount; i++) {
                sb.append("I");

            }
            return sb.toString();
        }
        if(amount == 4) return "IV";
        return sb.toString();
    }
}
