package com.springproject.service;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.springproject.database.connection.GetSession;
import com.springproject.model.User;

public class UserService {
	

	public static void saveUser(String firstName, String lastName,
			String permaLink, String emailId) {
		User user = new User();
		user.setEmailId(emailId);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPermaLink(permaLink);
		Session session=GetSession.getSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();
		Serializable i = session.save(user);
		transaction.commit();
		session.close();
		
		
		
	}
}
