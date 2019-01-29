import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Component;
import java.awt.FlowLayout;

//import java.awt.event.ActionListener;
import javax.swing.*;

public class Application extends JFrame implements ActionListener {
	JLabel lblid, lblname,lblemailid,lblsex,lblphno;// lbldepartment,lbldesignation;
	JTextField txtname, txtid,txtemailid,txtphno;
	JButton btnsubmit, btnCancel;
	JRadioButton rdmale, rdfemale;

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
	 txtid=new JTextField(10);
	 txtname=new JTextField(10);
/*	JTextField txtdepartment=new JTextField(10);
	JTextField txtdesignation=new JTextField(10);
	JTextField txtdateofjoining=new JTextField(10);
	JTextField txtdateofbirth=new JTextField(10);*/
	txtemailid=new JTextField(10);
    txtphno=new JTextField(10);
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
		add(lblphno);
		add(txtphno);
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
	public void addComponent()
	{
		setLayout(null);
		 
        lblid.setBounds(280, 20, 100, 20);
        add(lblid);
         txtid.setBounds(370, 20, 150, 20);
        add(txtid);
        
        
		lblname.setBounds(10, 20, 100, 20);
        add(lblname);
        txtid.setBounds(120, 20, 150, 20);
        add(txtname);
        
        lblemailid.setBounds(10,80, 100,20);
        add(lblemailid);
        txtemailid.setBounds(120, 80, 150, 20);
        add(txtemailid);
        
        lblphno.setBounds(280, 20, 100, 20);
        add(lblphno);
         txtphno.setBounds(370, 20, 150, 20);
        add(txtphno);
        
        lblsex.setBounds(10, 50, 50, 20);
       add(lblsex);
        
        rdmale.setBounds(120, 50, 70, 20);
        add(rdmale);
        
        rdfemale.setBounds(200, 50, 100, 20);
        add(rdfemale);
        
        btnsubmit.setBounds(300,500,100,25);
        add(btnsubmit);
        
        btnCancel.setBounds(410,500,100,25);
        add(btnCancel);
        
        setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg="";
		String cmd=	e.getActionCommand();
		System.out.println(cmd);
		if(cmd=="Submit")
				msg="welcome to "+txtname.getText();
		else if(cmd=="Cancel")
		{
			msg="you clicked cancel button";
			txtname.setText("");
		}
		
		lblname.setText(msg);
	}

public static void main(String[] args){
		Application obj=new Application();
		obj.addComponent();
}
	}
