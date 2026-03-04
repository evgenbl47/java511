import java.util.ArrayList;
import java.util.List;

public class PhoneBookApp {
    private final List<Command> commands;
    private final OutputService output;
    private final InputService input;

    public PhoneBookApp(List<Command> commands, OutputService output, InputService input) {
        this.commands = commands;
        this.output = output;
        this.input = input;
    }

    public void run() {
        while (true) {
            printMenu();
            int choice = input.readInt("Выберите действие: ");

            if (choice == 0) {
                output.printLine("До свидания!");
                break;
            }

            if (choice > 0 && choice <= commands.size()) {
                commands.get(choice - 1).execute();
            } else {
                output.printLine("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private void printMenu() {
        output.printLine("\n=== ТЕЛЕФОННАЯ КНИГА ===");
        for (int i = 0; i < commands.size(); i++) {
            output.printLine((i + 1) + ". " + commands.get(i).getDescription());
        }
        output.printLine("0. Выход");
    }

}
