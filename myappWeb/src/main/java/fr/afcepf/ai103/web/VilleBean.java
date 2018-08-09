package fr.afcepf.ai103.web;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import fr.afcepf.ai103.service.IServiceVille;

@ManagedBean
public class VilleBean {

	@EJB
	private IServiceVille serviceVille;
}
