package entity;
import lombok.Data;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/28
 * TIme: 9:17
 */
@Data
public class Vendors {
    private long vend_id;
    private String vend_name;
    private String vend_address;
    private String vend_city;
    private String vend_state;
    private String vend_zip;
    private String vend_country;
}
