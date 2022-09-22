package zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohocrm.entities.Contact;
import zohocrm.repositories.ContactRepository;

@Service
public class D implements C {
    @Autowired
	private ContactRepository contactRepo;
    
    
	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);
	}


	@Override
	public List<Contact> listContact() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}


	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}