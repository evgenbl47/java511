import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Main {



    static class CharacterCounter {
        long vowels = 0;
        long consonants = 0;
        long digits = 0;
        long spaces = 0;
        long others = 0;
    }

    // 1. Поток:
    static class VowelCounterTask implements Runnable {
        String text; CharacterCounter counter;
        public VowelCounterTask(String text, CharacterCounter counter) { this.text = text; this.counter = counter; }
        public void run() {
            System.out.println("Поток [Thread] начал работу...");
            long count = 0;
            String vowels = "aeiouаеёиоуыэюя";
            for (int i = 0; i < text.length(); i++) {
                if (vowels.indexOf(Character.toLowerCase(text.charAt(i))) != -1) count++;
            }
            counter.vowels = count;
            System.out.println("Поток [Thread] завершен. Найдено: " + count);
        }
    }

    // 2. Поток:
    static class ConsonantCounterTask implements Runnable {
        String text; CharacterCounter counter;
        public ConsonantCounterTask(String text, CharacterCounter counter) { this.text = text; this.counter = counter; }
        public void run() {
            System.out.println("Поток [SecondThread] начал работу...");
            long count = 0;
            String vowels = "aeiouаеёиоуыэюя";
            for (int i = 0; i < text.length(); i++) {
                char c = Character.toLowerCase(text.charAt(i));
                if (Character.isLetter(text.charAt(i)) && vowels.indexOf(c) == -1) count++;
            }
            counter.consonants = count;
            System.out.println("Поток [SecondThread] завершен. Найдено: " + count);
        }
    }

    // 3. Поток:
    static class DigitCounterTask implements Runnable {
        String text; CharacterCounter counter;
        public DigitCounterTask(String text, CharacterCounter counter) { this.text = text; this.counter = counter; }
        public void run() {
            System.out.println("Поток, [DigitCounter] начал работу...");
            long count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) count++;
            }
            counter.digits = count;
            System.out.println("Потк [DigitCounter] завершен. Найдено: " + count);
        }
    }

    // 4. Поток:
    static class SpaceCounterTask implements Runnable {
        String text; CharacterCounter counter;
        public SpaceCounterTask(String text, CharacterCounter counter) { this.text = text; this.counter = counter; }
        public void run() {
            System.out.println("Поток [SpaceCounter] начал работу...");
            long count = 0;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == ' ') count++;
            }
            counter.spaces = count;
            System.out.println("Поток [SpaceCounter] завершен. Найдено: " + count);
        }
    }

    // 5. Поток: Другие символы
    static class OtherCounterTask implements Runnable {
        String text; CharacterCounter counter;
        public OtherCounterTask(String text, CharacterCounter counter) { this.text = text; this.counter = counter; }
        public void run() {
            System.out.println("Поток [ThirdThread] начал работу...");
            long count = 0;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                boolean isLetter = Character.isLetter(c);
                boolean isDigit = Character.isDigit(c);
                boolean isSpace = (c == ' ' || c == '\t' || c == '\n' || c == '\r');
                if (!isLetter && !isDigit && !isSpace) count++;
            }
            counter.others = count;
            System.out.println("Поток [ThirdThread] завершен. Найдено: " + count);
        }
    }

    // Метод генерации тестового файла
    static void generateFile() throws IOException {
        System.out.println("Генерация файла...");
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        String latin = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String cyrillic = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыьэюя";
        String digits = "0123456789";
        String specials = " !@#$%^&*().,;:";

        // Генерируем >50к символов
        for (int i = 0; i < 60000; i++) {
            int type = rand.nextInt(5);
            switch(type) {
                case 0: sb.append(latin.charAt(rand.nextInt(latin.length()))); break;
                case 1: sb.append(cyrillic.charAt(rand.nextInt(cyrillic.length()))); break;
                case 2: sb.append(digits.charAt(rand.nextInt(digits.length()))); break;
                case 3: sb.append(specials.charAt(rand.nextInt(specials.length()))); break;
                case 4: sb.append(specials.charAt(rand.nextInt(specials.length()))); break;
            }
        }
        Files.write(Paths.get("input.txt"), sb.toString().getBytes(StandardCharsets.UTF_8));
        System.out.println("Файл создан.\n");
    }

    // Вывод результатов в консоль
    static void printResults(CharacterCounter counter, long timeMs, boolean isParallel) {
        System.out.println("========= РЕЗУЛЬТАТ ==========");
        System.out.println("Глассные:        " + String.format("%,d", counter.vowels));
        System.out.println("Согласные:      " + String.format("%,d", counter.consonants));
        System.out.println("Цифры:          " + String.format("%,d", counter.digits));
        System.out.println("Прбелы:        " + String.format("%,d", counter.spaces));
        System.out.println("Другие:         " + String.format("%,d", counter.others));
        System.out.println("───────────────────────────────");
        System.out.println("Время:          " + timeMs + " мс" + (isParallel && timeMs > 0 ? " ⚡ БЫСТРЕЕ!" : ""));
        System.out.println("================================\n");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        generateFile();
        // Читаем файл целиком в строку
        String text = new String(Files.readAllBytes(Paths.get("input.txt")), StandardCharsets.UTF_8);

        // 1) БЕЗ ПОТОКОВ (последовательно)
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("АНАЛИЗ БЕЗ ПОТОКОВ (последовательно)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        CharacterCounter counterSeq = new CharacterCounter();
        long startSeq = System.currentTimeMillis();

        // Простой цикл без многопоточности
        String vowels = "aeiouаеёиоуыэюя";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char lower = Character.toLowerCase(c);
            if (vowels.indexOf(lower) != -1) counterSeq.vowels++;
            else if (Character.isLetter(c)) counterSeq.consonants++;
            else if (Character.isDigit(c)) counterSeq.digits++;
            else if (c == ' ' || c == '\t' || c == '\n' || c == '\r') counterSeq.spaces++;
            else counterSeq.others++;
        }
        long timeSeq = System.currentTimeMillis() - startSeq;
        printResults(counterSeq, timeSeq, false);

        // 2) С ПОТОКАМИ (параллелно)
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("АНАЛИЗ С ПОТОКМИ (параллельно)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        CharacterCounter counterPar = new CharacterCounter();
        long startPar = System.currentTimeMillis();

        // Создаем и запускаем потоки
        Thread t1 = new Thread(new VowelCounterTask(text, counterPar));
        Thread t2 = new Thread(new ConsonantCounterTask(text, counterPar));
        Thread t3 = new Thread(new DigitCounterTask(text, counterPar));
        Thread t4 = new Thread(new SpaceCounterTask(text, counterPar));
        Thread t5 = new Thread(new OtherCounterTask(text, counterPar));

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

        // Ждем завершения всех потоков перед выводом итогов
        t1.join(); t2.join(); t3.join(); t4.join(); t5.join();

        long timePar = System.currentTimeMillis() - startPar;
        Thread.sleep(100);
        printResults(counterPar, timePar, true);
    }
}