package com.springproject.database.connection;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetSession {

	public static Session getSession() {
		Session session = new Configuration().configure("hibernate-config.xml")
				.buildSessionFactory().openSession();

		return session;

	}

}
