package model;

import org.hibernate.Query;

import entities.Doituong;

public class DoituongModel extends AbstractModel<Doituong>{
	
	public DoituongModel(){
		super(Doituong.class);
	}
	public Doituong findten(String tendoituong){
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
			Query q = sessionFactory.getCurrentSession().createQuery("from Doituong dt Where dt.tenDt = :tendoituong");
			q.setString("tendoituong", tendoituong);
			return (Doituong) q.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
}
