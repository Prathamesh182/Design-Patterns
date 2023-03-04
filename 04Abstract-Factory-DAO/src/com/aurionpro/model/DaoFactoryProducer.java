package com.aurionpro.model;

public class DaoFactoryProducer {

	public IDaoAbstractfactory produce(String factoryType) {
		if(factoryType.equalsIgnoreCase("xml")) {
			return new XMLDaoFacory();
		}
		if(factoryType.equalsIgnoreCase("db")) {
			return new DBDaoFactory();
		}
		return null;
	}
		

}
