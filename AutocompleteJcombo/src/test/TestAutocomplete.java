package test;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.swing.AutoCompleteSupport;

public class TestAutocomplete extends PlainDocument{

	static ComboBoxModel model;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JComboBox combo = new JComboBox(new Object[] {"Ester", "Jordi", "Sergi"});
		model = combo.getModel();
		combo.setEditable(true);
		JTextComponent editor = (JTextComponent) combo.getEditor().getEditorComponent();
		editor.setDocument(new TestAutocomplete());
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(combo);
		frame.pack();
		frame.setVisible(true);
		
		
		Object[] elements = new Object[] { "Ester", "Jordi", "Jordina",
		        "Jorge", "Sergi" };
		AutoCompleteSupport support = AutoCompleteSupport.install(combo, GlazedLists.eventListOf(elements));
		System.out.println("Is editable - " + combo.isEditable()+ ". Surprise!");
	}

}
