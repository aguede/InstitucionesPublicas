package com.ing.pensions.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentUtils {

    private static final String CHARACTERS_NIF_NIE               = "TRWAGMYFPDXBNJZSQVHLCKE";
    private static final String COMPILE_PATTERN_NIF              = "(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])";
    private static final String COMPILE_PATTERN_NIE              = "([XYZxyz])(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])";
    private static final String COMPILE_PATTERN_CIF              = "([ABCDEFGHJNOPQRSUVWabcdefghjnopqrsuvw])(\\d{7})(0-9|[JABCDEFGHIjabcdefghi])";

    private static final String CIF_CONTROL_DIGIT_PATTERN_LETTER = "PQRSW";
    private static final String CIF_CONTROL_DIGIT_PATTERN_NUMBER = "ABEH";
    private static final String CIF_CONTROL_DIGIT_LETTERS        = "JABCDEFGHI";

    public static boolean validarNif(String nif) {
        try {
            Matcher matcher = matchesPattern(nif, COMPILE_PATTERN_NIF);

            int index = Integer.parseInt(matcher.group(1));
            index = index % CHARACTERS_NIF_NIE.length();
            String reference = CHARACTERS_NIF_NIE.substring(index, index + 1);

            return reference.equalsIgnoreCase(matcher.group(2));

        }
        catch (Exception e) {
            return false;
        }
    }

    public static boolean validarNIE(String nie) {
        try {
            Matcher matcher = matchesPattern(nie, COMPILE_PATTERN_NIE);

            switch (matcher.group(1).toUpperCase()) {
                case "X":
                    nie = "0" + nie.substring(1, 8);
                    break;

                case "Y":
                    nie = "1" + nie.substring(1, 8);
                    break;

                case "Z":
                    nie = "2" + nie.substring(1, 8);
                    break;

                default:
                    return false;

            }

            int number = Integer.parseInt(nie);
            String charCheck = "" + CHARACTERS_NIF_NIE.charAt((number % CHARACTERS_NIF_NIE.length()));

            return charCheck.equals(matcher.group(3));
        }

        catch (Exception e) {
            return false;
        }

    }

    public static boolean validarCIF(String cif) {
        try {
            Matcher matcher = matchesPattern(cif, COMPILE_PATTERN_CIF);

            String firstLetter = matcher.group(1).toUpperCase();
            String cifNumberStr = matcher.group(2);
            String controlDigit = matcher.group(3);

            boolean letterExpected = CIF_CONTROL_DIGIT_PATTERN_LETTER.contains(firstLetter);
            boolean numberExpected = CIF_CONTROL_DIGIT_PATTERN_NUMBER.contains(firstLetter);
            boolean numberFound = Character.isDigit(controlDigit.charAt(0));

            if ((letterExpected && numberFound) || (numberExpected && !numberFound)) {
                return false;

            }

            String[] parts = cifNumberStr.split("");
            int singleCifDigit;
            int evenParts = 0;
            int unevenParts = 0;

            for (int i = 0; i < parts.length; i++) {
                singleCifDigit = Integer.parseInt(parts[i]);

                if ((i + 1) % 2 == 0) {
                    evenParts += singleCifDigit;

                } else {
                    unevenParts += 2 * singleCifDigit;
                }
            }

            int partsResult = evenParts + unevenParts;
            partsResult = partsResult > 10 ? partsResult % 10 : partsResult;
            partsResult = partsResult != 0 ? 10 - partsResult : partsResult;

            String calculatedControlDigit = letterExpected
                    ? String.valueOf(CIF_CONTROL_DIGIT_LETTERS.charAt(partsResult))
                    : String.valueOf(partsResult);

            return calculatedControlDigit.equals(controlDigit);

        }
        catch (Exception e) {
            return false;
        }
    }

    private static Matcher matchesPattern(String inputString, String compilePatternNif) throws Exception {
        Pattern pattern = Pattern.compile(compilePatternNif);
        Matcher matcher = pattern.matcher(inputString);

        if (!matcher.matches()) {
            throw new Exception();
        }
        return matcher;
    }

    // TEST
    public static void main(String[] args) {
        System.out.printf("%s is %s.%n", "51113084T", validarNif("51113084T") ? "valid" : "not valid");
        System.out.printf("%s is %s.%n", "22224444g", validarNif("22224444g") ? "valid" : "not valid");
        System.out.printf("%s is %s.%n", "51114584T", validarNif("51114584T") ? "valid" : "not valid");

        System.out.printf("%s is %s.%n", "Y7327554K", validarNIE("Y7327554K") ? "valid" : "not valid");
        System.out.printf("%s is %s.%n", "Z5545256F", validarNIE("Z5545256F") ? "valid" : "not valid");
        System.out.printf("%s is %s.%n", "Z5545356F", validarNIE("Z5545356F") ? "valid" : "not valid");

        System.out.printf("%s is %s.%n", "P6728541C", validarCIF("P6728541C") ? "valid" : "not valid");
    }
}
