package Calc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            str = str.trim();
            String[] arryStr = str.split(" ");
            String st1 = arryStr[0], st2 = arryStr[1], st3 = arryStr[2];

            // Exeption
            if (((CheckSymbol.checkRim(st1) == 3) & (CheckSymbol.checkArab(st3) == 1)) || ((CheckSymbol.checkArab(st1) == 1) & (CheckSymbol.checkRim(st3) == 3))) {
                throw new CalcException1();
            }
            if (arryStr.length != 3) {
                throw new CalcException2();
            }
            if (!(((CheckSymbol.checkRim(st1) == 3) & (CheckSymbol.checkRim(st3) == 3) & (CheckSymbol.checkZnak(st2) == 2)) ^ ((CheckSymbol.checkArab(st1) == 1) & (CheckSymbol.checkArab(st3) == 1) & (CheckSymbol.checkZnak(st2) == 2)))) {
                throw new CalcException3();
            }

            if ((CheckSymbol.checkRim(st1) == 3) & (CheckSymbol.checkRim(st3) == 3)) {
                // System.out.println("Римский счет");
                Rim rim1 = Rim.valueOf(st1);
                Rim rim2 = Rim.valueOf(st3);
                Rim[] rim = Rim.values();
                int position = (Rez.rez((rim1.ordinal() + 1), (st2), (rim2.ordinal() + 1)));
                if (position < 0) {
                    throw new CalcException4();
                } else if (position == 0) {
                    System.out.println(0);
                } else
                    System.out.println(rim[position - 1]);
            }
            if ((CheckSymbol.checkArab(st1) == 1) & (CheckSymbol.checkArab(st3) == 1)) {
                // System.out.println("Арабский счет");
                System.out.println(Rez.rez(st1, st2, st3));
            }
        } catch (CalcException1 e) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
        } catch (CalcException2 e) {
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) ");
        } catch (CalcException3 e) {
            System.out.println("throws Exception //т.к. введен символ не соответствующий условию");
        } catch (CalcException4 e) {
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("throws Exception //т.к. строка не является математической операцией ");
        }
    }
}

class CalcException1 extends Exception {
    public CalcException1() {
    }
}

class CalcException2 extends Exception {
    public CalcException2() {
    }
}

class CalcException3 extends Exception {
    public CalcException3() {
    }
}

class CalcException4 extends Exception {
    public CalcException4() {
    }
}