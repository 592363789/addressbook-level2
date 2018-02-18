package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Lists all persons in the address book to the user.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_SORT_PERSON_SUCCESS = "Sort already.";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts all persons in the address book as a list with names.\n"
            + "Example: " + COMMAND_WORD;



    public CommandResult execute() {

        addressBook.sort();
        return new CommandResult(String.format(MESSAGE_SORT_PERSON_SUCCESS));

    }
}