
package in.sp.dao;

import in.sp.dbcon.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao
{
    public boolean insertUserDetails(String[] userArr)
    {
        boolean status = false;
        
        try
        {
            Connection con = DbConnection.getConnect();
            
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?)");
            ps.setString(1, userArr[0]);
            ps.setString(2, userArr[1]);
            ps.setString(3, userArr[2]);
            ps.setString(4, userArr[3]);
            ps.setString(5, userArr[4]);
            
            int count = ps.executeUpdate();
            if(count > 0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return status;
    }
}
