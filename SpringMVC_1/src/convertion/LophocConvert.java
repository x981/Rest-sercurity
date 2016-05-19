package convertion;

import java.beans.PropertyEditorSupport;

import model.LophocModel;
import entities.Lophoc;

public class LophocConvert extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		try {
			System.out.println("Chuoi: " + arg0);
			LophocModel lhm = new LophocModel();
			Lophoc lh = lhm.find(Integer.parseInt(arg0));
			this.setValue(lh);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			this.setValue(null);
		}
	}

}
