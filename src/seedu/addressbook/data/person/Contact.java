package seedu.addressbook.data.person;

import com.sun.corba.se.pept.transport.ContactInfoListIterator;
import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Contact(String information, boolean isPrivate) throws IllegalValueException {
        String trimmedInformation = information.trim();
        this.isPrivate = isPrivate;
        this.value = trimmedInformation;
    }

    /**
     * Returns true if a given string is a valid person address.
     */

    @Override
    public String toString() {
        return value;
    }



    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
