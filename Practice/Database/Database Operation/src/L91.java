import java.sql.*;
class db_connect {
    Connection con;
    Statement s;
    
    db_connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con=DriverManager.getConnection( "jdbc:mysql://localhost:3307/java","root","Appu_2003"); 
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    void create()
    {
        try
        {
            s = con.createStatement();
            s.executeUpdate("Create table p9(itemid int, name varchar(50), price int, category varchar(50));");    
            System.out.println("Table Created Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    void insert(int itemid, String name, int price, String category)
    {
        try
        {
            s = con.createStatement();
            s.executeUpdate("Insert into p9 values("+itemid+",'"+name+"',"+price+",'"+category+"');");
            System.out.println("Inserted");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void display()
    {
        try
        {
            s = con.createStatement();
            ResultSet result = s.executeQuery("Select * from p9;");
            System.out.println();
            System.out.println("records : ");
            while(result.next())
            {
                System.out.println("Id : " + result.getInt(1)+" Name : " + result.getString(2) + "Price : " + result.getInt(3) + " Category : "+result.getString(4));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void delete(int itemid){
        try{
            s = con.createStatement();
            s.executeUpdate("delete from p9 where itemid = " + itemid);
            System.out.println("deleted");
        }
        catch(Exception e){
            
        }
    }    
    void update(int itemid, String category)
    {
        try
        {
            s = con.createStatement();
            s.executeQuery("Update p9 set category = '"+category+"' where itemid = "+itemid+";");
            System.out.println("updated");
        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class L91 {
    public static void main(String[] args)
    {
        db_connect obj = new db_connect();
        // obj.create();
        // obj.insert(1,"iPhone",122000,"Electronics");
        obj.update(1,"Mobile");
        obj.display();
    }
}