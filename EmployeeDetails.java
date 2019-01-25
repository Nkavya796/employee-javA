import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//import EmployeeDetails.FrameDemo;

public class EmployeeDetails {

	String id;
	String name;
	String email;
	int date_of_birth;
	
   public void get() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Employee ID");
		id = sc.next();
		System.out.print("Enter the Employee name");
		name = sc.next();
		System.out.print("Enter the Employee Email ");
		email = sc.next();
		System.out.println("Enter the Employee date of birth");
		date_of_birth = sc.nextInt();
	}

	public void display() {
		 
		System.out.println("Employee ID = " + id);
		System.out.println("Employee name = " + name);
		System.out.println("Employee email = " + email);
		System.out.println("Employee date of birth= " + date_of_birth);
	}
	
	
	
private static Pattern usrNamePtrn = Pattern.compile("^[a-z0-9_-]{6,14}$");
    
    public static boolean validateUserName(String userName){
         
        Matcher mtch = usrNamePtrn.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
    
	 public static class FrameDemo extends JFrame{
	    	FrameDemo() {
	    		JLabel  lblid=new JLabel("ID");
	    		lblid.setText("ID");
	    		JLabel  lblname=new JLabel("Name");
	    		lblname.setText("Name");
	    		JLabel  lblemail=new JLabel("Email");
	    		lblemail.setText("Email");
	    		JLabel  lbldateofbirth=new JLabel("Date Of Birth");
	    		lbldateofbirth.setText("Date Of Birth");
	    		JTextField txtid=new JTextField(10);
	    		JTextField txtname=new JTextField(10);
	    		JTextField txtemail=new JTextField(10);
	    		JTextField txtdateofbirth=new JTextField(10);
	    		
	    		JButton btnsubmit=new  JButton("Submit");
	 
	    		add(lblid);
	    		add(txtid);
	    		add(txtname);
	    		add(txtname);
	    		add(txtemail);
	    		add(txtemail);
	    		add(txtdateofbirth);
	    		add(txtdateofbirth);
	    		add(btnsubmit);
	    		setLayout(new FlowLayout());
	    		setSize(400, 400);
	    		setTitle("Demo");
	    		setVisible(true);
	    		
	    	}
	    

	

	public static void main(String[] args)
    {
		 
			 	  EmployeeDetails e[] = new EmployeeDetails[5];
			  
			  for(int i=0; i<5; i++) {
			   
			   e[i] = new EmployeeDetails();
			   e[i].get();
			   e[i].display();
			   new FrameDemo();
			  }
    }
}	
}
		
		
		
		
		
	