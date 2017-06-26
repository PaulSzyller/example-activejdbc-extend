import org.javalite.activejdbc.Base;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/myDB", "root", "root");

        List<MyExtendedModel> results = MyExtendedModel.where("foo = ?", "bar").limit(1);

        if((results != null) && !results.isEmpty()) {
            results.get(0).saySomething();
        }
    }
}