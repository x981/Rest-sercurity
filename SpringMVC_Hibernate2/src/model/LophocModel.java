package model;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;

import entities.Doituong;
import entities.Lophoc;

public class LophocModel extends AbstractModel<Lophoc>{
	
	public LophocModel(){
		super(Lophoc.class);
	}
	
	public Lophoc findten(String tenlop){
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
			Query q = sessionFactory.getCurrentSession().createQuery("from Lophoc lh Where lh.tenlop = :tenlop");
			q.setString("tenlop", tenlop);
			return (Lophoc) q.uniqueResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public List<Lophoc> findtens(String tenlop){
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
			Query q = sessionFactory.getCurrentSession().createQuery("from Lophoc lh Where lh.tenlop like :tenlop order by lh.tenlop");
			q.setString("tenlop", "%" + tenlop + "%");
			return q.list();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public List<Lophoc> findngay(java.util.Date jud){
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
			Query q = sessionFactory.getCurrentSession().createQuery("from Lophoc lh Where lh.ngayKg = :ngayKG");
			q.setDate("ngayKG", jud);
			return q.list();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public List<Lophoc> Lopconhan(String exp){
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
			//Query q = sessionFactory.getCurrentSession().createQuery("from Lophoc lh Where lh.expried = :exp order by lh.tenlop");
			Query q = sessionFactory.getCurrentSession().createSQLQuery("exec laydslop").addEntity(Lophoc.class);
			//q.setString("exp", exp);
			return q.list();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
