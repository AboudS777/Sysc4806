package addressbook;

import addressbook.AddressBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by abdallahsaket3 on 2/9/2017.
 */
@RepositoryRestResource(collectionResourceRel = "addressBooks", path = "addressBooks")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {
}
