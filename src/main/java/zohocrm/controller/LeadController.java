package zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrm.entities.Contact;
import zohocrm.entities.Lead;
import zohocrm.services.A;
import zohocrm.services.C;

@Controller
public class LeadController {

	@Autowired
	private A a;
	

	@Autowired
	private C c;
	
	@RequestMapping("/kiran")
	public String createLeadPage() {
	return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead,ModelMap model) {
		a.saveOneLead(lead);
		model.addAttribute("stored",lead);
		return"lead_info";
		}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,ModelMap model) {
		Lead lead = a.getOneLead(id);
		Contact contact= new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		c.saveOneContact(contact);
		a.deleteOneLead(id);
		List<Contact> contacts = c.listContact();
		model.addAttribute("contact", contacts);
		return"search_contact_result";
		}
	
	@RequestMapping("/listLead")
	public String listLead(ModelMap model) {
		List<Lead> leads = a.listLead();
		model.addAttribute("lead", leads);
		return "search_lead_result";
		}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,ModelMap model) {
		Lead lead = a.getOneLead(id);
		model.addAttribute("stored", lead);
		return "lead_info";
		}
}
