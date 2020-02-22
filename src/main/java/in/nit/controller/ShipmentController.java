package in.nit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.Shipment;
import in.nit.service.IShipmentService;;

@Controller
//@RequestMapping("/shipment")
public class ShipmentController {
	
	@Autowired
	private IShipmentService service;
	
	@RequestMapping("/")
		public String home() {
			return "home";
		}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(
			@ModelAttribute Shipment shipment,
			Model model ) {
		model.addAttribute("obj", shipment);
		Shipment i=service.saveShipment(shipment);
		model.addAttribute("save", i.getId());
		return "view";
	}

}
