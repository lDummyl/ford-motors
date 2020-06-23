package org.example.ford.dao;

import lombok.Cleanup;
import org.example.ford.dto.Motor;
import org.example.ford.utills.HibernateSessionFactoryUtil;
import org.hibernate.Session;

public class CarDao {

	public CarDao(Class<Motor> motorClass) {

	}

	public Object findById(int id) {
//		Class<?> aClass = (Class<?>) gener;
		@Cleanup Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
		return session.get(Motor.class, id);
	}
}
