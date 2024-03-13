import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Задача 1

        int[] first = new int[]{1, 2, 3};
        float[] second = new float[]{1.57f, 7.654f, 9.986f};

        boolean[] third = new boolean[5]; //объявить с готовыми значениями слишком просто, поэтому заменю три значения вручную.
        //по умолчанию в двоичном массиве всем значениям присваивается false, поэтому пишем только "правду" )
        third[0] = true;
        third[2] = true;
        third[4] = true;

//Задача 2
        System.out.println(Arrays.toString(first)); //хотелось вывести лишь одной командой, но требуется вывод без скобок, поэтому...
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));

        //начнем с простого способа
        System.out.print(first[0] + ", " + first[1] + ", " + first[2]);
        System.out.println();//переход на новую строку

        //но если в массиве переменных не 3, а 100, нужно выводить все автоматически
        //поискав варианты, мне понравилось просто убрать скобки, и хоть мы еще не прошли strings, я попрактикуюсь

        String result = Arrays.toString(second) // в данном случае result это название строки
                .replace("[", "")  // указывается цель, которую надо убрать, и то, чем заменить
                .replace("]", ""); // убираем вторую так же
        System.out.println(result); //выводим все что получилось

        //видя, что в следующих задачах требуется вывод в обратном порядке, составитель точно хочет цикл, в котором будет еще и условие связано с запятой

        for (int i = 0; i < third.length; i++) { //цикл для обращения к каждому из символов внутри массива
            System.out.print(third[i]); //вывод каждого символа
            if (i < third.length - 1) { //пока индекс меньше длины, расставляются запятые с пробелом, и чтобы не ставить последнюю, вычитаем 1.
                System.out.print(", ");
            }
        }
        System.out.println();//переход на новую строку


//Задача 3
        for (int i = first.length - 1; i > -1; i--) { // развернуть цикл просто, но в уроке сказано об ошибке ArrayIndexOutOfBoundsException,
            // которая говорит о том что превышена длина, поэтому убавляем все на один.
            System.out.print(first[i]); //вывод каждого символа
            if (i != 0) { //и поскольку запятую не надо ставить после значения, которому под номером 0, пишем его.
                System.out.print(", ");
            }
        }
        System.out.println();//переход на новую строку

        for (int i = second.length - 1; i > -1; i--) { //алгоритм тот же, тренируем поиск и замену с помощью горячих клавиш ctrl+R, заменив first на second и third соответственно
            System.out.print(second[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();//переход на новую строку

        for (int i = third.length - 1; i > -1; i--) { //

            System.out.print(third[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();//переход на новую строку

//Задача 4

        for (int i = 0; i < first.length; i++) { //цикл для обращения к каждому из символов внутри массива

            if (first[i] % 2 != 0) { //четность проверяем с помощью остатка деления на 2,
                first[i] = first[i] + 1; // и к каждому нечетному числу прибавляем 1
            }
        }
        System.out.println(Arrays.toString(first));


    }
}