package model;

import java.util.List;

import org.hibernate.Query;

import entities.Giaovien;
import entities.Users;

public class GiaovienModel extends AbstractModel<Giaovien>{

	public GiaovienModel(){
		super(Giaovien.class);
	}
	
	public Giaovien check(String tenuser, String pass) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Giaovien gv where gv.tenDn = :tenuser and gv.matkhau = :pass");
            q.setString("tenuser", tenuser);
            q.setString("pass", pass);
            return (Giaovien) q.uniqueResult();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	
	public List<Giaovien> findtheocv(String chucvu) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Giaovien gv where gv.chucvu = :chucvu");
            q.setString("chucvu", chucvu);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public Giaovien findtheosdt(String sdt) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Giaovien gv where gv.dienthoai = :sdt");
            q.setString("sdt", sdt);
            return (Giaovien) q.uniqueResult();
            } catch (RuntimeException re) {
            return null;
        }
    }
	
	public Giaovien findtheoemail(String email) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Giaovien gv where gv.email like :email");
            q.setString("email", email);
            return (Giaovien) q.uniqueResult();
            } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Giaovien> findtheoten(String ten) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Giaovien gv where gv.ten like :ten");
            q.setString("ten", "%" +ten+ "%");
            return q.list();
            } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<String> LietkeCV() {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("select distinct(gv.chucvu) from Giaovien gv");
            return q.list();
            } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Giaovien> timtheonoilamviec(String str) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Giaovien gv where gv.noilamviec = :str");
            q.setString("str", str);
            return q.list();
            } catch (RuntimeException re) {
            return null;
        }
    }
	
	
}
