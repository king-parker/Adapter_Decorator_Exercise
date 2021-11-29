package Adapter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class MainAdapter {
    public static void main(String args[]) {
        ContactManager manager = new ContactManager();
        manager.addContact(new Contact("Bruce","Wayne","$$$-$$$-$$$$","iamrich@internet"));
        manager.addContact(new Contact("Albert","Einstein","123-456-7890","eismcsq@science"));
        manager.addContact(new Contact("Prince","Zuko","000-000-0000","honor@firenation"));
        ContactManagerAdapter adapter = new ContactManagerAdapter(manager);

        Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
        Table table = new Table(out, adapter);
        try {
            table.display();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
