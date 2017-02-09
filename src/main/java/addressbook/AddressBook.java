package addressbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdallahsaket3 on 1/12/2017.
 */
@Entity
public class AddressBook {

    private long id;
    private List<BuddyInfo> book = new ArrayList<BuddyInfo>();

    public AddressBook(){
    }

    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @OneToMany (cascade = CascadeType.PERSIST)
    public List<BuddyInfo> getBuddies(){
        return book;
    }

    public void setBuddies(List<BuddyInfo> buddies){
        this.book = buddies;
    }

    public void printBook(){
        for (int i = 0; i < book.size(); i++){
            System.out.printf("Person%d: %s Number: %s \n", i, book.get(i).getName(), book.get(i).getNumber());
        }
    }

//    public static void main(String[] args){
//        BuddyPersist rdm = new BuddyPersist();
//
//        AddressBook address = new AddressBook();
//        BuddyInfo person1 = new BuddyInfo("Stephane","6132187898");
//        BuddyInfo person2 = new BuddyInfo("Ryan","6132157468");
//        BuddyInfo person3 = new BuddyInfo("Sarrankan","6137813549");
//        BuddyInfo person4 = new BuddyInfo("Ghassan","4166988870");
//        BuddyInfo person5 = new BuddyInfo("Khaled","6127564682");
//
//        address.addBuddy(person1);
//        address.addBuddy(person2);
//        address.addBuddy(person3);
//        address.addBuddy(person4);
//        address.addBuddy(person5);
//
//        address.printBook();
//
//        rdm.performPersistance();
//
//    }
}