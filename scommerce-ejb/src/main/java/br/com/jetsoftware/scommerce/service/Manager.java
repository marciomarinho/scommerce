package br.com.jetsoftware.scommerce.service;

import javax.ejb.Local;

@Local
public interface Manager {
	public void sayHello ();
	public void destroy ();
}
