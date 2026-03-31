import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContactRepository repository = new InMemoryContactRepository();
        InputService input = new ConsoleInputService();
        OutputService output = new ConsoleOutputService();

        List<Command> commands = new ArrayList<>();
        commands.add(new AddContactCommand(repository, input, output));
        //commands.add(new ViewAllCommand(repository, output));
        //commands.add(new UpdateContactCommand(repository, input, output));
        //commands.add(new DeleteContactCommand(repository, input, output));
        //commands.add(new SearchContactCommand(repository, input, output));

        PhoneBookApp phoneBookApp = new PhoneBookApp(commands, output, input);
        phoneBookApp.run();
    }
}