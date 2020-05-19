import me.fsd.ass.mod.UserServiceApp;
import me.fsd.ass.mod.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTester{
    @Autowired
    private UserController userController;
    @Test
    public void getUsers(){
        userController.getUsers();
    }
}
