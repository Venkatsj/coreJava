import java.io.IOException;
import java.sql.SQLException;

public class InheritanceAccExc {
    protected String getName(){
        return "abc";
    }

    public int gerException() throws SQLException {
        return 1;
    }

}

class Sub extends InheritanceAccExc{

    @Override
    public String getName(){
        return "xyz";
    }


    public int getException()throws Exception{
        return 10;
    }
}