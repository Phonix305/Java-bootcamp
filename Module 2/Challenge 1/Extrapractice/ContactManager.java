package Extrapractice;

public class ContactManager {

    private Contact[] contacts; //array of contact objects


    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];

        for (int i = 0; i < contacts.length; i++) {
            
            this.contacts[i]=new Contact(contacts[i]);
        }
    }

    public Contact getContact(int index) {
        return new Contact(contacts[index]);
        // return deep copy of object at that index.
     }
     
     public void setContact(Contact contact, int index) {
        this.contacts[index] = new Contact(contact);
    }
    
    
    
}
