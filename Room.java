
public class Room {
private String id;
private String customerName;
public Room(){}

public void setId(int floor,int number)
{
	id=(floor<=9? "0"+floor:""+floor)+(number<=9?"0"+number:""+number);
}
public String getId()
{
	return id;
}
public void setCustomerName(String customerName)
{
	this.customerName=customerName;
}
public String getCustomer()
{
	return customerName;
}
public boolean in(String customerName)
{
	if(this.customerName==null)
	{
		this.customerName=customerName;
		return true;
	}
	else {
		return false;
	}
}
public boolean out()
{
	if(this.customerName==null)
{
   customerName=null;
	return true;
}
else {
	return false;
}
}
}