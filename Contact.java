import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Contact
{
	String name,number;

public  Contact(String name,String number){
	
	this.name=name;
	this.number=number;
	
}
@Override
public String toString() {
	return "Contact [name=" + name + ", number=" + number + "]";
}




	public static void main(String[] args){
	Contact c1=new Contact("Nidhi","8904789929");
	
	Contact c2=new Contact("Nitin","9874562154");
	
	Contact c3=new Contact("hi","2354895463");
	
	Contact c4=new Contact("hello","895456556");
	
	Contact c5=new Contact("Vidya","9845632145");
	
	List<Contact> list = new LinkedList<>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
	list.add(c4);
	list.add(c5);
	System.out.println("Using Iterator");
	Iterator it = list.iterator();
	while (it.hasNext())
		System.out.println(it.next());
}
}