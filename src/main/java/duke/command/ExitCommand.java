package duke.command;

import duke.task.TaskList;
import duke.ui.Ui;
import duke.storage.Storage;

public class ExitCommand extends Command {
    public ExitCommand() {
    }

    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showEnd();
        ui.showLine();
        this.isExit = true;
    }
}