package zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrm.entities.Billing;
import zohocrm.entities.Contact;
import zohocrm.services.C;
import zohocrm.services.E;

@Controller
public class BillingController {
	
	@Autowired
	private C c;
	

	@Autowired
	private E e;

	@RequestMapping("/showGenerateBillPage")
	public String showBillGeneratePage(@RequestParam("id") long id,ModelMap model) {
		Contact contact = c.getOneContact(id);
		model.addAttribute("contact",contact);
		return "generate_bill";
		}
	
	@RequestMapping("/generateBill")
	public String billGeneration(@ModelAttribute("bill") Billing bill,ModelMap model) {
		e.saveBill(bill);
		model.addAttribute("bill",bill);
		return "search_billing_result";
		
	}
}
