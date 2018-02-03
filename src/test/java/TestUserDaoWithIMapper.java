import com.github.mybaties.User;
import com.github.mybaties.UserDao;
import com.github.mybaties.UserDaoWithInterfaceMapping;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestUserDaoWithIMapper {

    @Test
    public void insertUser(){
        UserDaoWithInterfaceMapping mUserDao = new UserDaoWithInterfaceMapping();

        User mUser = new User();
        mUser.name = "zhujohnlewithimapper";
        mUser.age = 12;
        mUserDao.insertUser(mUser);
        System.out.println("success");

    }

    @Test
    public void selectByKey(){
        UserDaoWithInterfaceMapping mUserDao = new UserDaoWithInterfaceMapping();
        User mUser = mUserDao.getUserByKey("zhujohnle","5");

        System.out.println(mUser.toString());

    }

    @Test
    public void selectAll(){
        UserDaoWithInterfaceMapping mUserDao = new UserDaoWithInterfaceMapping();
        List<User> mUser = mUserDao.selectAll();

        System.out.println(mUser);

    }
}
