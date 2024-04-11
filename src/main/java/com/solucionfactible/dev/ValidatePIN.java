package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
 * but exactly 4 digits or exactly 6 digits. If the function is passed a valid
 * PIN string, return true, else return false.
 *
 * @author developer
 */
public class ValidatePIN {

    public static boolean isValid(String pin) {
        int size = pin.length();
        if (size != 4 && size != 6) {
            return false;
        }

        char[] characters = pin.toCharArray();
        boolean checker = true;
        for (char element : characters) {
            checker = Character.isDigit(element);
            if(checker == false) return false;
        }
        return checker;
    }

}
