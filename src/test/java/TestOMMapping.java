import com.github.mybaties.ommaping.Classes;
import com.github.mybaties.ommaping.OMDao;
import com.github.mybaties.oomaping.Class;
import com.github.mybaties.oomaping.OODao;
import org.junit.jupiter.api.Test;

public class TestOMMapping {

    //测试表字段和class 字段不一致的问题
    @Test
    public void testGetOOoRder(){

        OMDao mOderDao = new OMDao();
        Classes mOrder = mOderDao.slectClassInfoByClassIdMulitSql(1);
        System.out.println(mOrder.toString());
    }

    @Test
    public void testGetOOneSql(){

        OMDao mOderDao = new OMDao();
        Classes mOrder = mOderDao.slectClassInfoByClassIdSql(1);
        System.out.println(mOrder.toString());

    }

}
