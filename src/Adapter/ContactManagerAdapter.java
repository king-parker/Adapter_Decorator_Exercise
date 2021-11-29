package Adapter;

public class ContactManagerAdapter implements TableData {

    private ContactManager contactManager;

    public ContactManagerAdapter(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return contactManager.getContactCount();
    }

    @Override
    public int getColumnSpacing() {
        return 5;
    }

    @Override
    public int getRowSpacing() {
        return 1;
    }

    @Override
    public char getHeaderUnderline() {
        return '~';
    }

    @Override
    public String getColumnHeader(int col) {
        String header;
        switch (col) {
            case 0:
                header = "First Name";
                break;
            case 1:
                header = "Last Name";
                break;
            case 2:
                header = "Phone Number";
                break;
            case 3:
                header = "Email";
                break;
            default:
                header = null;
        }
        return header;
    }

    @Override
    public int getColumnWidth(int col) {
        int width;
        switch (col) {
            case 0:
                width = 10;
                break;
            case 1:
                width = 10;
                break;
            case 2:
                width = 12;
                break;
            case 3:
                width = 20;
                break;
            default:
                width = 0;
        }
        return width;
    }

    @Override
    public Justification getColumnJustification(int col) {
        return Justification.Center;
    }

    @Override
    public String getCellValue(int row, int col) {
        String value;
        switch (col) {
            case 0:
                value = contactManager.getContact(row).getFirstName();
                break;
            case 1:
                value = contactManager.getContact(row).getLastName();
                break;
            case 2:
                value = contactManager.getContact(row).getPhone();
                break;
            case 3:
                value = contactManager.getContact(row).getEmail();
                break;
            default:
                value = null;
        }
        return value;
    }
}
