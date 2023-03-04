package com.aurionpro.test;

import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;
import com.aurionpro.model.IDaoAbstractfactory;

public class DaoFactoryTest {

	public static void main(String[] args) {
		DaoFactoryProducer produce = new DaoFactoryProducer();
		IDaoAbstractfactory factory = produce.produce("db");
		IDao empXmlDao = factory.createDao("Department");
		empXmlDao.save();
	}

}
