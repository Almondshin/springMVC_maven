import com.springmvc_maven.dao.user.UserDao;
import com.springmvc_maven.vo.user.UserInfoVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
public class DataBaseConnectionTest {

    @Inject
    private UserDao userDao;

    @Test
    public void testInsertUser() throws Exception{
        UserInfoVO userInfoVO = new UserInfoVO();
//        userInfoVO.setUserId();
    }
}
