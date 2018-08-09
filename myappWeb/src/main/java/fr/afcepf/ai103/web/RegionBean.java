package fr.afcepf.ai103.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import fr.afcepf.ai103.service.IServiceRegion;

@ManagedBean 
public class RegionBean {
	
	@EJB
	private IServiceRegion serviceRegion;

}
