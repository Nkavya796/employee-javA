import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Component;
import java.awt.FlowLayout;

//import java.awt.event.ActionListener;
import javax.swing.*;

public class Application extends JFrame {
	JLabel lblid,lblname;//lbldepartment,lbldesignation,lblemaidid;
	JTextField txtname,txtid;//txtemailid;
	JButton btnsubmit,btnCancel;
	JRadioButton rdmale,rdfemale;
	Application(){
		JLabel lblid=new JLabel("id");
		lblid.setText("id");
		JLabel lblname=new JLabel("name");
		lblname.setText("name");
	   /*JLabel lbldepartment=new JLabel("department");
		lbldepartment.setText("department");
		JLabel lbldesignation=new JLabel("designation");
		lbldesignation.setText("designation");
		JLabel lbldateofjoining=new JLabel("dateofjoining");
		lbldateofjoining.setText("dateofjoining");
		JLabel lbldateofbirth=new JLabel("dateofbirth");
		lbldateofbirth.setText("dateofbirth");*/
		JLabel lblemailid=new JLabel("email id");
		lblemailid.setText("email id");
		JLabel lblphno=new JLabel("phone number");
		lblphno.setText("phone number");
		/*JLabel lblmartialstatus=new JLabel("martial status");
		lblmartialstatus.setText("martial status");
		JLabel lbldateofmarriage=new JLabel("dateofmarriage");
		lbldateofmarriage.setText("dateofmarriage");
		*/
	JTextField txtid=new JTextField(10);
	JTextField txtname=new JTextField(10);
/*	JTextField txtdepartment=new JTextField(10);
	JTextField txtdesignation=new JTextField(10);
	JTextField txtdateofjoining=new JTextField(10);
	JTextField txtdateofbirth=new JTextField(10);*/
	JTextField txtemailid=new JTextField(10);
	JTextField txtphonenumber=new JTextField(10);
	/*JTextField txtmartialstatus=new JTextField(10);
	JTextField txtdateofmarriage=new JTextField(10);*/
		
		
		JRadioButton rdmale=new JRadioButton("Male");
		JRadioButton rdfemale=new JRadioButton("FeMale");
		ButtonGroup bg=new ButtonGroup();

		bg.add(rdmale);
		bg.add(rdfemale);
		JButton btnsubmit=new  JButton("Submit");
		JButton btncancel=new  JButton("Cancel");
		
		
		
		add(lblid);
		add(txtid);
		add(lblname);
		add(txtname);
		/*add(lbldepartment);
		add(txtdepartment);
		add(lbldesignation);
		add(txtdesignation);
		add(lbldateofjoining);
		add(txtdateofjoining);
		add(lbldateofbirth);
		add(txtdateofbirth);*/
		add(lblemailid);
		add(txtemailid);
		add(txtphonenumber);
		add(txtphonenumber);
		/*add(lblmartialstatus);
		add(txtmartialstatus);
		add(lbldateofmarriage);
		add(txtdateofmarriage);*/
		add(rdmale);
		add(rdfemale);
		add(btnsubmit);
		add(btncancel);
		
		
		
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setTitle("Application");
		setVisible(true);
		
		}
	
	public static void main(String[] args){
		Application obj=new Application();

	}

}
	
