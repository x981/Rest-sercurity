package convertion;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;

public class DateConvert extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String arg0) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println(arg0);
		try {
			if (arg0.length()>0) {
				SimpleDateFormat sdfm = new SimpleDateFormat("dd/MM/yyyy");
				this.setValue(sdfm.parse(arg0));
			}
		} catch (Exception e) {
			// TODO: handle exception
			this.setValue(null);
			System.out.println(e.getMessage());
		}
	}

}
