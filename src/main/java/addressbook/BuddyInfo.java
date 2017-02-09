package addressbook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by abdallahsaket3 on 1/12/2017.
 */

@Entity
public class BuddyInfo {
    private long id;
    private String name;
    private String number;

    public BuddyInfo() {

    }

    public BuddyInfo(String buddyName, String buddyNumber){
        this.name = buddyName;
        this.number = buddyNumber;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}

