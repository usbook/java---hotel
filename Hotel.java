public class Hotel {
	private String hotelName;
	private Room[][] rooms;
	private static int WIDTH=12;
	private static int HEIGHT=6;

	
	public Hotel()
	{
		rooms=new Room[HEIGHT][WIDTH];
		for(int i=0;i<rooms.length;i++)
		{
			for(int j=0;j<rooms[i].length;j++)
			{
				rooms[i][j]=new Room();
				rooms[i][j].setId(i+1,j+1);
			}
		}
	}
	
		// TODO Auto-generated constructor stub

	public void setHotelName(String hotelName)
	{
		this.hotelName=hotelName;
	}
	public String getHotelName()
	{
		return hotelName;
	}
   public void searchAll()
   {
	   
	   for(int i=0;i<rooms.length;i++)
	   {
		   for(int j=0;j<rooms[i].length;j++)
		   {
			   System.out.print(rooms[i][j].getId()+"\t");
		   }
	        System.out.println();
	        for(int j=0;j<rooms[i].length;j++)
	        {
	        	 System.out.print(rooms[i][j].getCustomer()==null?"\t":rooms[i][j].getCustomer()+"\t");
	        }
	        System.out.println();
	        for(int j=1;j<=8*WIDTH;j++)
	        	  System.out.print("-");
	        System.out.println();
	    }
	   
      }
   public void searchByNo(String roomNo)
   {
	  if(testRoomNo(roomNo))
	  {
		  int height=Integer.parseInt(roomNo.substring(0,2));
			int width=Integer.parseInt(roomNo.substring(2,4));
			System.out.println(rooms[height-1][width-1].getCustomer()==null?"客房没有客人":roomNo+"\t"+rooms[height-1][width-1].getCustomer());
	  }else
	  {
		  System.out.println("没有这个客房");
	  }
   }
private boolean testRoomNo(String roomNo) {
	
	int height=Integer.parseInt(roomNo.substring(0,2));
	int width=Integer.parseInt(roomNo.substring(2,4));
	if(height<1||height>HEIGHT||width<1||width>WIDTH)
	{
		return false;
	}else
	{
	return true;
	}
}
   
public int  checkIn(String roomNo,String name )
{
  if(testRoomNo(roomNo))
  {
	int height=Integer.parseInt(roomNo.substring(0,2));
	int width=Integer.parseInt(roomNo.substring(2,4));
	if(rooms[height-1][width-1].in(name))
	{
		return 1;
	}else
	{
		return 2;
	}
  }
  else 
  {
	return 3;
   }
}
public int checkout(String roomNo)
{
	if(testRoomNo(roomNo))
	{
		int height=Integer.parseInt(roomNo.substring(0,2));
		int width=Integer.parseInt(roomNo.substring(2,4));
		if(rooms[height-1][width-1].out())
		{
		return 1;	
		}
		else
		{
			return 2;
		}
	}
	else
	{
		return 3;//没有这个房间
	}
}
}

