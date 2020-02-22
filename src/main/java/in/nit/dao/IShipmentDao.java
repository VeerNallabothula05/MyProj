package in.nit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Shipment;

public interface IShipmentDao extends JpaRepository<Shipment,Integer>{
	
	// public Integer saveShipment(Shipment ob);

}
