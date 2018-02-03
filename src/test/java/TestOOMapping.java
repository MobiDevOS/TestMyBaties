import com.github.mybaties.oomaping.Class;
import com.github.mybaties.oomaping.OODao;
import com.github.mybaties.order.Order;
import com.github.mybaties.order.OrderDao;
import org.junit.jupiter.api.Test;

public class TestOOMapping {

    //测试表字段和class 字段不一致的问题
    @Test
    public void testGetOOoRder(){

        OODao mOderDao = new OODao();
        Class mOrder = mOderDao.slectClassInfoByClassIdMulitSql(1);
        System.out.println(mOrder.toString());
    }

    @Test
    public void testGetOOneSql(){

        OODao mOderDao = new OODao();
        Class mOrder = mOderDao.slectClassInfoByClassIdSql(1);
        System.out.println(mOrder.toString());
    }

}
