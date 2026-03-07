package seedu.address.logic.commands;

import seedu.address.model.Model;
import seedu.address.logic.commands.exceptions.CommandException;

public class RemarkCommand extends Command {
    public static final String COMMAND_WORD = "remark";
    @Override
    public CommandResult execute(Model model) throws CommandException {
        return new CommandResult("Hello from remark!");
    }
}