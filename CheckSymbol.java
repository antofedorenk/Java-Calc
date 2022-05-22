package Calc;

class CheckSymbol {

  static int checkArab(String string1) {
        int k = 0;
        String a1 = string1;
        String[] arryArab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (int i = 0; i < arryArab.length; i++) {
            if (a1.equals(arryArab[i])) {
                k = k + 1;
            }
        }
        return k;
    }

  static int checkZnak(String string2) {
        int k = 0;
        String a2 = string2;
        String[] arryZnak = {"+", "-", "*", "/"};
        for (int i = 0; i < arryZnak.length; i++) {
            if (a2.equals(arryZnak[i])) {
                k = k + 2;
            }
        }
        return k;
    }

  static int checkRim(String string3) {
        int k = 0;
        String a3 = string3;
        String[] arrySymb = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < arrySymb.length; i++) {
            if (a3.equals(arrySymb[i])) {
                k = k + 3;
            }
        }
        return k;
  }
}