import com.github.mybaties.User;
import com.github.mybaties.UserDao;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestUserDao {

    @Test
    public void testInsertUser(){

    }

    @Test
    public void testSelectUser(){
        UserDao mUserDao = new UserDao();
        User mUser = mUserDao.selectUserById(3);
        System.out.print(mUser.name);
    }

    @Test
    public void testSelectAll(){
        UserDao mUserDao = new UserDao();
        List<User> mUser = mUserDao.selectAll();
        System.out.print(mUser.size());
    }

    @Test
    public void insertUser(){
        UserDao mUserDao = new UserDao();

        User mUser = new User();
        mUser.name = "zhujohnle";
        mUser.age = 12;
        mUserDao.insertUser(mUser);

    }
}
