import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("mytable") // this is the table for both MyBaseModel and MyExtendedModel
public class MyBaseModel extends Model {

}