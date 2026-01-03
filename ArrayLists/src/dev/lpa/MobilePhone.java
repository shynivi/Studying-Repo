package dev.lpa;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public static void main(String[] args) {

        Contact nivi = new Contact("nivi", "0886787912");
        MobilePhone phone = new MobilePhone("1");
        phone.addNewContact(nivi);
        phone.printContacts();
        Contact niviNew = new Contact("niviNew", "08867879121");
        Contact nigga = new Contact("nigga", "088127314");
        phone.addNewContact(niviNew);
        phone.addNewContact(nigga);
        phone.printContacts();
        System.out.println(phone.queryContact("niviNew"));
    }

    public boolean addNewContact(Contact val)
    {
        if(findContact(val.getName()) == -1)
        {
            myContacts.add(val);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean updateContact(Contact oldCon, Contact newCon)
    {
        if(findContact(oldCon) == -1)
        {
            return false;
        }
        else
        {
            int i = findContact(oldCon);
            myContacts.add(i, newCon);
            myContacts.remove(i+1);
            return true;
        }
    }

    public boolean removeContact(Contact val)
    {
        if(findContact(val) == -1)
        {
            return false;
        }
        else
        {
            int i = findContact(val);
            myContacts.remove(i);
            return true;
        }
    }

    private int findContact(Contact val)
    {
        if(!myContacts.contains(val))
        {
            return -1;
        }
        else
            return myContacts.indexOf(val);
    }

    private int findContact(String val)
    {
        int y = -1;
        for(int i = 0; i < myContacts.size(); i++)
        {
            if(myContacts.get(i).getName() == val)
            {
                y = myContacts.indexOf(myContacts.get(i));
            }
        }
        return y;
    }

    public Contact queryContact(String val)
    {
        int name = findContact(val);
        if(name >= 0)
        {
            return myContacts.get(name);
        }
        else
            return null;
    }

    public void printContacts()
    {
        System.out.println("Contact List:");
        int i = 1;
        System.out.println(myContacts);
        for(var val : myContacts)
        {
            System.out.println(i +"."+ val.getName() + " -> " + val.getPhoneNumber());
            i++;
        }
    }
}
