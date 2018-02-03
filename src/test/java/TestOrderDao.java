import com.github.mybaties.order.Order;
import com.github.mybaties.order.OrderDao;
import org.junit.jupiter.api.Test;

public class TestOrderDao {

    //测试表字段和class 字段不一致的问题
    @Test
    public void testGetOOoRder(){

        OrderDao mOderDao = new OrderDao();
        Order mOrder = mOderDao.selectOrderFromId(1);
        System.out.println(mOrder.orderNo);
    }


}
