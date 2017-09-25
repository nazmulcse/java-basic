import java.util.*;
class Contact{
    enum Sex{
        MALE, FEMALE
    }
    private String name;
    private String emailAddress;
    private String phoneNumber;
    private int age;
    private Sex sex;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Sex getSex(){
        return sex;
    }
    public void setSex(Sex sex){
        this.sex = sex;
    }
}
interface FilterCriteria{
    boolean match(Contact contact);
}
class ContactService{
    public List<Contact> findContactFromAge18to25(List<Contact> contactList, FilterCriteria criteria){
        List<Contact> contacts = new ArrayList();
        for(Contact contact : contactList){
            if(criteria.match(contact)){
                contacts.add(contact);
            }
        }
        return contacts;
    }
}

public class ContactApp{
    public static void main(String[] args){
        ContactService contactService = new ContactService();
        List<Contact> contactList = new ArrayList();
        Contact contacts= new Contact();
        contacts.setName("Nazmul Hasan");
        contacts.setEmailAddress("nazmul@sbpgc.com");
        contacts.setAge(18);
        contactList.add(contacts);
        List<Contact> contactListOf18to25 = contactService.findContactFromAge18to25(contactList,
            (Contact contact)->{
                return contact.getAge() >= 18 && contact.getAge() <= 25;
            }
        );

        for(Contact contact : contactListOf18to25){
            System.out.println(contact.getName() + " " + contact.getAge());
        }
    }
}
