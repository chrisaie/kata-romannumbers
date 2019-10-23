package ch.visionthing.kata.romannumbers;

public class RomanNumberConverter {
    public String convert(int amount) {
        StringBuilder sb = new StringBuilder();
        for(AmountToRoman amountToRoman: AmountToRoman.values()) {
            while(amount >= amountToRoman.amount) {
                sb.append(amountToRoman.roman);
                amount -= amountToRoman.amount;
            }
        }
        return sb.toString();
    }

    enum AmountToRoman {
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4 , "IV"),
        ONE( 1, "I");

        private final String roman;
        private final int amount;


        AmountToRoman(int amount, String roman) {
            this.roman = roman;
            this.amount = amount;
        }
    }
}
