package DBAccess;

import FunctionLayer.LoginSampleException;
import java.sql.SQLException;

public class test {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException, LoginSampleException {
        System.out.println(UserMapper.getCustomerOrders("someone@nowhere.com"));
    }
}
