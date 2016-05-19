package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import entities.ChitietHs;
import entities.Hocsinh;
import model.*;
import entities.*;

public class HocsinhModel extends AbstractModel<Hocsinh>{
	
	public HocsinhModel(){
		super(Hocsinh.class);
	}
	
	public List<Hocsinh> HsNoHp(int thang, int nam) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.maHs not in (select hocsinh.maHs from Hocphi hp where hp.thang = :thang and hp.nam = :nam) and hs.lophoc.maLop>0 and hs.doituong.maDt !=11");
            q.setInteger("thang", thang);
            q.setInteger("nam", nam);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> HsNoHp_Theolop(Lophoc lh, int thang, int nam) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.maHs not in (select hocsinh.maHs from Hocphi hp where hp.thang = :thang and hp.nam = :nam and hp.lophoc = :lh) and hs.lophoc = :lh and hs.doituong.maDt !=11");
            q.setInteger("thang", thang);
            q.setInteger("nam", nam);
            q.setEntity("lh", lh);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> findcths(ChitietHs cths) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.chitietHs = :cths");
            q.setSerializable("cths", cths);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public Hocsinh find1cths(ChitietHs cths) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.chitietHs = :cths");
            q.setSerializable("cths", cths);
            return (Hocsinh) q.uniqueResult();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> findtrangthai(String status) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.trangthai like :status order by hs.ten");
            q.setString("status", "%" + status + "%");
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> findten(String ten) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            //Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.hoten + ' ' + hs.ten like :ten");
            Query q = sessionFactory.getCurrentSession().createSQLQuery("exec timtheoten :ten").addEntity(Hocsinh.class).setParameter("ten", ten);
            //q.setString("ten", "%" + ten + "%");
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> findAll_fix() {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.lophoc.maLop > 0 and hs.doituong.maDt <> 11 order by hs.lophoc asc");
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	
	public List<Hocsinh> Timtheolop(Lophoc lh) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.lophoc =:lh and hs.doituong.maDt <> 11 order by hs.ten asc");
            q.setEntity("lh", lh);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> findbyclass(Lophoc lh, String trangthai) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            //Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.lophoc = :lh and hs.trangthai like :status order by hs.ten asc");
            Query q = sessionFactory.getCurrentSession().createSQLQuery("exec timtheolop :malop, :trangthai").addEntity(Hocsinh.class).setParameter("malop", lh.getMaLop()).setParameter("trangthai", trangthai);
            //q.setString("status", "%" + status + "%");
            //q.setEntity("lh", lh);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> findbyngayvao(Lophoc lh, int thang, int nam) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.lophoc = :lh and month(hs.ngayvao) = :thang and year(hs.ngayvao) = :nam");
            q.setInteger("thang", thang);
            q.setInteger("nam", nam);
            q.setEntity("lh", lh);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	//Lay danh sach lop da tung hoc
	
	public List<Hocsinh> timtheoSDTB(String sdtb) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            //Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.lophoc.maLop > 0 and hs.doituong.maDt <> 11 order by hs.lophoc asc");
            Query q = sessionFactory.getCurrentSession().createSQLQuery("exec timtheoDTB :sdtb").addEntity(Hocsinh.class).setParameter("sdtb", sdtb);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }
	
	public List<Hocsinh> timtheoSDTM(String sdtm) {
        try {
            if (!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();            
            //Query q = sessionFactory.getCurrentSession().createQuery("from Hocsinh hs where hs.lophoc.maLop > 0 and hs.doituong.maDt <> 11 order by hs.lophoc asc");
            Query q = sessionFactory.getCurrentSession().createSQLQuery("exec timtheoDTM :sdtm").addEntity(Hocsinh.class).setParameter("sdtm", sdtm);
            return q.list();
        } catch (RuntimeException re) {
            return null;
        }
    }

}
