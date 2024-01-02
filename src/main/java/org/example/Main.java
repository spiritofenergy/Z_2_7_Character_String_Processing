package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[]words = new String[100];
        int countOfWords = 0;

        int start = 0;
        for (int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(!(((ch > 'а') && (ch < 'я')) || ((ch > 'А') && (ch < 'Я')) || ch == '-')){
                String word = line.substring(start, i);
                System.out.println("dgfgsdfg" + word);
                words[countOfWords]= word;
                countOfWords++;
                start = i + 1;
            }
        }
        for (int i = 0; i < countOfWords; i++){
            System.out.println(words[i]);
        }
    }
}

/*
        // Выводит первое предложение строки
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int start = 0;
        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) == '.' && line.charAt(i + 1) == ' ') {
                System.out.println(line.substring(start, i));
                start = i + 2;

            }
        }

    }
}



   // Выводит последнюю слово строки
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int lastSpase = line.length() - 1;
        while (line.charAt(lastSpase) != ' ' && lastSpase >= 0) {
            lastSpase--;
        }
        char[] word = new char[line.length() - lastSpase];

        int wordIndex= 0;
        for (int i = lastSpase + 1; i < line.length(); i++) {
            word[wordIndex] = line.charAt(i);
            wordIndex++;
        }

          //   for (int i = lastSpase; i < line.length(); i++) {
         //   word[i - lastSpase] = line.charAt(i);

        for (int i = 0; i < word.length; i++) {
        System.out.print(word[i]);
        }

        // выводит первое слово в предложении
       Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int firstSpase = 0;
        while (line.charAt(firstSpase) != ' ' && firstSpase < line.length()) {
            firstSpase++;
        }
        char[] word = new char[firstSpase];

        for (int i = 0; i < firstSpase; i++) {
            word[i] = line.charAt(i);
        }
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]);
        }


    // Разделение на целое и дробное
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    // 1207.99
        int dotIndex = 0;
        int i = 0;
        while (i < str.length() && dotIndex == 0) {
            if(str.charAt(i) =='.'){
                dotIndex = i;
            }
            i++;
        }
        char[]intPart = new char[dotIndex];
        char[]fractPart = new char[str.length() - dotIndex - 1];

        for (int x = 0; x < dotIndex; x++){
            intPart[x] = str.charAt(x);
        }
        System.out.println(intPart);
        int fractIndex = 0;
        for (int x = dotIndex + 1; x < str.length(); x++){
           // fractPart[fractIndex] = str.charAt(x);
            fractPart[x - dotIndex -1] = str.charAt(x);
            fractIndex++;
        }
        System.out.println(fractPart);
    }
}



      //Заборчик
       /*   Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(chars[i]);
        }
    }
}

*/


        /*

        // Половина строки упперкейс, половина ловеркейс
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        int size = chars.length;
        for (int i = size / 2; i < size; i++) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        for (int i = 0; i < size; i++) {
            System.out.print(chars[i]);

        }
    }
*/

        /*
        // последние 4 **** через изменение массива
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int size = chars.length;
        for (int i = size - 4; i < size; i++){
            chars[i] = '*';
        }
        for (int i = 0; i<size; i++){
            System.out.print(chars[i]);
        }
  */




      /*
      // последние 3 символа ***
       Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size-3; i++){
            System.out.print(chars[i]);
        }
        System.out.print("***");*/

        /*
        System.out.println("1.Пользователь вводит слово, вывести в обратном порядке");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        for (int i = str.length() - 1; i >- 0; i--){
            System.out.print(chars[i]);

       System.out.println("2.Посчитайте количество нулей в числе");
        System.out.println("3.Найдите первую гласную букву в слове");
        System.out.println("4.Посчитайте количество согласных букв в слове");
        System.out.println("5.Выведите слово наоборот, при этом столбиком");
        System.out.println("6.Замените все гласные в слове на ‘у");
        System.out.println("7.Пользователь вводит дробное число, выведите его дробную часть");
        System.out.println("8.Пользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **");
  */
