public class UnknownCommand extends Command {
    public UnknownCommand() {}

    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showUnknown();
    }
}