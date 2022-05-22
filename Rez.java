package Calc;

class Rez {

     static int rez(String string1, String string2, String string3) {

        String arrayStr1 = string1, arrayStr2 = string2, arrayStr3 = string3;

        int a = Integer.parseInt(arrayStr1), b = Integer.parseInt(arrayStr3), rez = 0;

        if ((arrayStr2).equals("+")) {
            rez = (a + b);
        }
        if ((arrayStr2).equals("-")) {
            rez = (a - b);
        }
        if ((arrayStr2).equals("*")) {
            rez = (a * b);
        }
        if ((arrayStr2).equals("/")) {
            rez = (a / b);
        }
        return rez;
    }

     static int rez(int a, String string2, int b) {
        int a1 = a, b1 = b, rez = 0;
        String arrayStr2 = string2;
        if ((arrayStr2).equals("+")) {
            rez = (a1 + b1);
        }
        if ((arrayStr2).equals("-")) {
            rez = (a1 - b1);
        }
        if ((arrayStr2).equals("*")) {
            rez = (a1 * b1);
        }
        if ((arrayStr2).equals("/")) {
            rez = (a1 / b1);
        }
        return rez;
    }
}