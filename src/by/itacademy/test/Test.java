package by.itacademy.test;

import by.itacademy.tasks09.task96.Method;

/**
 * Created by Smile on 16.07.17.
 */
public class Test {
    private static int MAX_LENGTH_ID = 10;

    public static void main(String[] args) throws Exception {
        System.out.println(generateIdFirstVersion("321"));
        System.out.println(generateIdSecondVersion("321"));

        System.out.println(generateIdThirdVersion("321"));
        System.out.println(generateIdFourthVersion("44421"));
        System.out.println(generateIdFifthVersion("12345"));

        timeForLoop(10000000);

    }


    public static String generateIdFirstVersion(String code) throws Exception {
        checkCode(code);

        final String ID = "0000000000";

        return ID.substring(0, MAX_LENGTH_ID - code.length()).concat(code);
    }

    public static String generateIdSecondVersion(String code) throws Exception {
        checkCode(code);

        StringBuilder builder = new StringBuilder(code);

        for (int i = 0; i < MAX_LENGTH_ID - code.length(); i++) {
            builder.append("0");
        }

        return builder.reverse().toString();
    }

    public static String generateIdThirdVersion(String code) throws Exception {
        checkCode(code);

        char[] id = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        char[] arrayCode = code.toCharArray();

        for (int i = MAX_LENGTH_ID - arrayCode.length; i < MAX_LENGTH_ID; i++) {
            int startIndexInCode = 0;
            id[i] = arrayCode[startIndexInCode];
            startIndexInCode++;
        }

        return new String(id);
    }


    private static void checkCode(String code) throws Exception {
        if (!isAllowableCodeLength(code) || !isNumber(code)) {
            System.out.println("Invalid code!");
            throw new Exception();
        }
    }

    private static boolean isAllowableCodeLength(String code) {
        boolean allowable;

        if (code.length() > MAX_LENGTH_ID) {
            allowable = false;
        } else {
            allowable = true;
        }

        return allowable;
    }

    private static boolean isNumber(String code) {
        boolean isNumber;

        try {
            Integer.valueOf(code);
            isNumber = true;
        } catch (Exception e) {
            isNumber = false;
        }

        return isNumber;
    }

    public static String generateIdFourthVersion(String code) throws Exception {
        checkCode(code);
        StringBuilder strBuilder = new StringBuilder("0000000000");
        strBuilder.setLength(MAX_LENGTH_ID - code.length());
        strBuilder.append(code);
        return new String(strBuilder);
    }



    public static String generateIdFifthVersion(String code) throws Exception {
        checkCode(code);
        String[] str = {"0","00","000","0000","00000","000000","0000000","000000000","0000000000"};
        return new String(new StringBuilder(str[str.length-code.length()]).append(code));
    }



    public static void timeForLoop(int loops) throws Exception {

        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк аператором сложиения: ", loops);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loops; i++) {
            generateIdFirstVersion("1111");
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Время выполнения программы: " + endTime + " мсек");
        System.out.println("===================");


        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк аператором сложиения: ", loops);
        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < loops; i++) {
            generateIdSecondVersion("2222");
        }
        long endTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("Время выполнения программы: " + endTime1 + " мсек");System.out.println("===================");


        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк аператором сложиения: ", loops);
        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < loops; i++) {
            generateIdThirdVersion("3333");
        }
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Время выполнения программы: " + endTime2 + " мсек");
        System.out.println("===================");


        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк аператором сложиения: ", loops);
        long startTime3 = System.currentTimeMillis();

        for (int i = 0; i < loops; i++) {
            generateIdFourthVersion("4444");
        }
        long endTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("Время выполнения программы: " + endTime3 + " мсек"); System.out.println("===================");


        System.out.printf("Замеряем время цикла (%,d циклов) сложения строк аператором сложиения: ", loops);
        long startTime4 = System.currentTimeMillis();

        for (int i = 0; i < loops; i++) {
            generateIdFifthVersion("4444");
        }
        long endTime4 = System.currentTimeMillis() - startTime4;
        System.out.println("Время выполнения программы: " + endTime4 + " мсек");


    }


}
