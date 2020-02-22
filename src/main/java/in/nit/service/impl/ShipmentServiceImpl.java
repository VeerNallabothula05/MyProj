package in.nit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IShipmentDao;
import in.nit.model.Shipment;
import in.nit.service.IShipmentService;
@Service
public class ShipmentServiceImpl implements IShipmentService {
	
	@Autowired
	private IShipmentDao dao;

	//@SuppressWarnings("unchecked")
	@Override
	public Shipment  saveShipment(Shipment ob) {
		
		Shipment s=dao.save(ob);
		return s;
	}

}
