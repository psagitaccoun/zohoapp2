package zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrm.entities.Contact;
import zohocrm.services.C;

@Controller
public class ContactController {

	@Autowired
	private C c;
	
	@RequestMapping("/listContact")
	public String listContact(ModelMap model) {
		List<Contact> contacts = c.listContact();
		model.addAttribute("contact", contacts);
		return"search_contact_result";
		}
	
	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id,ModelMap model) {
		Contact contact = c.getOneContact(id);
		model.addAttribute("stored",contact);
		return "contact_info";
		
	}
}
