package zohocrm.services;

import java.util.List;

import zohocrm.entities.Contact;

public interface C {

	void saveOneContact(Contact contact);

	List<Contact> listContact();

	Contact getOneContact(long id);

}
