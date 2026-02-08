package hWork;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Home {

    public void start(){

//        Задачи на промежуточные операции Stream API
///////////////////////////////////////////////////////////////////////////////////////////////////

        //todo 1. filter - фильтрация
// Дан список чисел. Найти все чётные числа.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Твоё решение:
        numbers = numbers.stream().filter(x -> x % 2 == 0). toList();
//Ожидаемый результат: [2, 4, 6, 8, 10]
        System.out.println("Ожидаемый результат: 2, 4, 6, 8, 10");
        System.out.print("Реальный  результат: ");
        numbers.forEach( x -> System.out.print(x + ", "));

// Дан список слов. Найти все слова длиной больше 4 символов.
        List<String> words = Arrays.asList("cat", "elephant", "dog", "tiger", "ant", "butterfly");
// Твоё решение:
        words = words.stream().filter(x -> x.length() > 4).toList();
// Ожидаемый результат: ["elephant", "tiger", "butterfly"]
        System.out.println("\nОжидаемый результат: \"elephant\", \"tiger\", \"butterfly\"");
        System.out.print("Реальный  результат: ");
        words.forEach( x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 2. map - преобразование
// Дан список чисел. Умножить каждое число на 2.
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
// Твоё решение:
        numbers2 = numbers2.stream().map(x -> x * 2).toList();
// Ожидаемый результат: [2, 4, 6, 8, 10]
        System.out.println("\nОжидаемый результат: 2, 4, 6, 8, 10");
        System.out.print("Реальный  результат: ");
        numbers2.forEach( x -> System.out.print(x + ", "));

// Дан список слов. Преобразовать все слова в ВЕРХНИЙ РЕГИСТР.
        List<String> words2 = Arrays.asList("farid", "oleq", "dawa", "dima");
// Твоё решение:
        words2 = words2.stream().map(x -> x.toUpperCase()).toList();
// Ожидаемый результат: ["FARID", "OLEQ", "DAWA", "DIMA"]
        System.out.println("\nОжидаемый результат: FARID, OLEQ, DAWA, DIMA");
        System.out.print("Реальный результат: ");
        words2.forEach(x -> System.out.print(x + " "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 3. mapToInt - преобразование в IntStream

// Дан список слов. Получить список длин каждого слова (как int[]).
        List<String> wordsList = Arrays.asList("cat", "elephant", "dog", "tiger");
        int[] wordsListInt = wordsList.stream().mapToInt(x -> x.length()).toArray();
// Твоё решение:
// Ожидаемый результат: [3, 8, 3, 5]
        System.out.println("\nОжидаемый результат: 3, 8, 3, 5");
        System.out.print("Реальный  результат: ");
        Arrays.stream(wordsListInt).forEach(x -> System.out.print(x + ", "));

// Дан список чисел. Получить массив квадратов этих чисел (как int[]).
        List<Integer> arrOfSquares = Arrays.asList(1, 2, 3, 4, 5);
        arrOfSquares = arrOfSquares.stream().mapToInt(x -> x * x).boxed().toList();
// Твоё решение:
// Ожидаемый результат: [1, 4, 9, 16, 25]
        System.out.println("\nОжидаемый результат: 1, 4, 9, 16, 25");
        System.out.print("Реальный  результат: ");
        List<Integer> finalArrOfSquares = arrOfSquares;
        arrOfSquares.forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 4. sorted - сортировка

// Дан список чисел. Отсортировать их по возрастанию.
        List<Integer> numsSort = Arrays.asList(5, 2, 8, 1, 9, 3);
// Твоё решение:
// Ожидаемый результат: [1, 2, 3, 5, 8, 9]
        System.out.println("\nОжидаемый результат: 1, 2, 3, 5, 8, 9");
        System.out.print("Реальный  результат: ");
        numsSort = numsSort.stream().sorted((x, y) -> x - y).toList();
        numsSort.forEach(x -> System.out.print(x + ", "));

// Дан список слов. Отсортировать их по длине (от короткого к длинному).
        List<String> wordsSort = Arrays.asList("elephant", "cat", "dog", "butterfly", "ant");
// Твоё решение:
// Ожидаемый результат: ["cat", "dog", "ant", "elephant", "butterfly"]
        System.out.println("\nОжидаемый результат: cat, dog, ant, elephant, butterfly");
        System.out.print("Реальный  результат: ");
        wordsSort = wordsSort.stream().sorted((x, y) -> x.length() - y.length()).toList();
        wordsSort.forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 5. distinct - удаление дубликатов

// Дан список чисел с дубликатами. Оставить только уникальные.
        List<Integer> numbersUnique = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
// Твоё решение:
// Ожидаемый результат: [1, 2, 3, 4, 5]
        System.out.println("\nОжидаемый результат: 1, 2, 3, 4, 5");
        System.out.print("Реальный  результат: ");
        numbersUnique = numbersUnique.stream().distinct().toList();
        numbersUnique.forEach(x -> System.out.print(x + ", "));

// Дан список слов с повторениями. Оставить только уникальные слова.
        List<String> wordsRepeats = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");
// Твоё решение:
// Ожидаемый результат: ["apple", "banana", "orange", "kiwi"]
        System.out.println("\nОжидаемый результат: apple, banana, orange, kiwi");
        System.out.print("Реальный  результат: ");
        wordsRepeats = wordsRepeats.stream().distinct().toList();
        wordsRepeats.forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 6. limit - ограничение количества

// Дан список чисел. Взять только первые 3 элемента.
        List<Integer> numbersLimit = Arrays.asList(10, 20, 30, 40, 50, 60);
// Твоё решение:
// Ожидаемый результат: [10, 20, 30]
        System.out.println("\nОжидаемый результат: 10, 20, 30");
        System.out.print("Реальный  результат: ");
        numbersLimit = numbersLimit.stream().limit(3).toList();
        numbersLimit.stream().forEach(x -> System.out.print(x + ", "));

// Дан список слов. Взять только первые 4 слова.
        List<String> wordsLimit = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
// Твоё решение:
// Ожидаемый результат: ["one", "two", "three", "four"]
        System.out.println("\nОжидаемый результат: one, two, three, four");
        System.out.print("Реальный  результат: ");
        wordsLimit = wordsLimit.stream().limit(4).toList();
        wordsLimit.stream().forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 7. skip - пропуск элементов

// Дан список чисел. Пропустить первые 2 элемента, взять остальные.
        List<Integer> numbersSkip = Arrays.asList(1, 2, 3, 4, 5, 6);
// Твоё решение:
// Ожидаемый результат: [3, 4, 5, 6]
        System.out.println("\nОжидаемый результат: 3, 4, 5, 6");
        System.out.print("Реальный  результат: ");
        numbersSkip = numbersSkip.stream().skip(2).toList();
        numbersSkip.stream().forEach(x -> System.out.print(x + ", "));



// Дан список слов. Пропустить первые 3 слова, взять остальные.
        List<String> wordsSkip = Arrays.asList("a", "b", "c", "d", "e", "f");
// Твоё решение:
// Ожидаемый результат: ["d", "e", "f"]
        System.out.println("\nОжидаемый результат: d, e, f");
        System.out.print("Реальный  результат: ");
        wordsSkip = wordsSkip.stream().skip(3).toList();
        wordsSkip.stream().forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 8. peek - промежуточный просмотр

// Дан список чисел. Вывести каждое число в консоль ПЕРЕД фильтрацией (оставить только чётные).
        List<Integer> numbersPeek = Arrays.asList(1, 2, 3, 4, 5, 6);
// Твоё решение:
// Использовать peek для вывода, затем filter для чётных
// Ожидаемый результат в консоли:
// 1
// 2
// 3
// 4
// 5
// 6
// И список: [2, 4, 6]
        System.out.println("""
                \nОжидаемый результат в консоли:
                1
                2
                3
                4
                5
                6
                И список: 2, 4, 6""");
        System.out.print("Реальный  результат: \n");
        numbersPeek = numbersPeek.stream()
                .peek(x -> System.out.println(x))
                .filter(x -> x % 2 == 0)
                .toList();
                System.out.print("И список: ");
                numbersPeek.forEach(x -> System.out.print(x + ", "));

// Дан список слов. Преобразовать в ВЕРХНИЙ РЕГИСТР и вывести каждое слово в консоль.
        List<String> wordsUpper = Arrays.asList("hello", "world", "java");
// Твоё решение:
// Использовать map для преобразования, затем peek для вывода
// Ожидаемый результат в консоли:
// HELLO
// WORLD
// JAVA
// И список: ["HELLO", "WORLD", "JAVA"]
        System.out.println("""
                \nОжидаемый результат в консоли:
                HELLO
                WORLD
                JAVA
                И список: HELLO, WORLD, JAVA""");
        System.out.print("Реальный  результат: \n");
        wordsUpper = wordsUpper.stream().map(x -> x.toUpperCase())
                .peek(x -> System.out.println(x))
                .toList();

        System.out.print("И список: ");
        wordsUpper.forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 9. takeWhile - брать пока условие TRUE

// Дан список чисел. Взять элементы пока они меньше 5.
        List<Integer> numbersTakeWhile = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1);
// Твоё решение:
// Ожидаемый результат: [1, 2, 3, 4] (остановился на 5)
        System.out.println("\nОжидаемый результат: 1, 2, 3, 4 (остановился на 5)");
        System.out.print("Реальный  результат: ");
        numbersTakeWhile.stream()
                .takeWhile(x -> x < 5)
                .peek(x -> System.out.print(x + ", "))
                .toList();


// Дан список слов. Брать слова пока их длина <= 4 символов.
        List<String> wordsLength = Arrays.asList("cat", "dog", "bird", "elephant", "ant", "cow");
// Твоё решение:
// Ожидаемый результат: ["cat", "dog", "bird"] (остановился на "elephant")
        System.out.println("\nОжидаемый результат: cat, dog, bird (остановился на elephant)");
        wordsLength = wordsLength.stream()
                .takeWhile(x -> x.length() <= 4)
                .toList();
        System.out.print("Реальный  результат: ");
        wordsLength.stream().forEach(x -> System.out.print(x + ", "));

        System.out.println("""
\n///////////////////////////////////////////////////////////////////////""");

        //todo 10. dropWhile - пропускать пока условие TRUE

// Дан список чисел. Пропускать элементы пока они меньше 5, затем взять все остальные.
        List<Integer> numbersSkipLess5 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1);
// Твоё решение:
// Ожидаемый результат: [5, 6, 2, 1] (начал брать с 5)
        System.out.println("\nОжидаемый результат: 5, 6, 2, 1 (начал брать с 5)");
        System.out.print("Реальный  результат: ");
        numbersSkipLess5 = numbersSkipLess5.stream()
                .dropWhile(x -> x < 5)
                .toList();
        numbersSkipLess5.stream().forEach(x -> System.out.print(x + ", "));


// Дан список слов. Пропускать слова пока их длина <= 3, затем взять все остальные.
        List<String> wordsSkipLess3 = Arrays.asList("cat", "dog", "ant", "elephant", "cow", "bird");
// Твоё решение:
// Ожидаемый результат: ["elephant", "cow", "bird"] (начал брать с "elephant")
        System.out.println("\nОжидаемый результат: elephant, cow, bird (начал брать с elephant)");
        System.out.print("Реальный  результат: ");
        wordsSkipLess3 = wordsSkipLess3.stream()
                .dropWhile(x -> x.length() <= 3)
                .toList();
        wordsSkipLess3.stream().forEach(x -> System.out.print(x + ", "));

    }
}
