/**
 * Created by Yuliya on 21.11.2014.
 */
/*Задание 3.1: Для целых чисел от 1 до 100 вывести: если число делится на 5 и на 7, вывести строку "ABBA"; если число делится на 5,
вывести строку "A"; если число делится на 7, вывести строку "B"; иначе вывести само число.*/
public class Cycles {
    public static void main(String[] args) {
        System.out.println();

        int total = 100;
        int chislo;
        for (chislo=1; chislo <=total; chislo++){
            if (chislo % 5 == 0 & chislo % 7 == 0) {
                System.out.println("Результат числа " + chislo + " : ABBA");
            }
            else if (chislo % 5 == 0) {
                System.out.println("Результат числа " + chislo + " : A");
            }
            else if(chislo % 7 == 0){
                System.out.println("Результат числа " + chislo + " : B");
            }
            else {
                System.out.println("Число: " + chislo);
            }
    }
}
}