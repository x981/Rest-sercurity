package model;

import java.io.Serializable;

import org.hibernate.Query;

import entities.Nguoichoi;

public class UserModel extends AbstractModel<Nguoichoi>{
	
	public UserModel() {
		// TODO Auto-generated constructor stub
		super(Nguoichoi.class);
	}
	
	public Nguoichoi find(String email, String password){
		try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Nguoichoi n where n.email = :email and n.matkhau = :password");
            q.setString("email", email);
            q.setString("password", password);
            return (Nguoichoi)q.uniqueResult();
        } catch (RuntimeException re) {
            return null;
        }
	}

}
