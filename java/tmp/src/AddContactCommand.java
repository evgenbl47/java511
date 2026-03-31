public class AddContactCommand implements Command {
    private final ContactRepository repository;
    private final InputService input;
    private final OutputService output;

    public AddContactCommand(ContactRepository repository, InputService input, OutputService output) {
        this.repository = repository;
        this.input = input;
        this.output = output;
    }

    @Override
    public void execute() {
        output.printLine("\n--- Добавление нового контакта ---");
        String name = input.readString("Введите имя: ");
        String phone = input.readString("Введите номер телефона: ");
        String email = input.readString("Введите email (необязательно): ");

        Contact contact = new Contact(name, phone, email);
        repository.add(contact);
        output.printLine("Контакт успешно добавлен!");
    }

    @Override
    public String getDescription() {
        return "Добавить контакт";
    }
}
