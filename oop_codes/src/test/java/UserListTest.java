import com.qiyun.notif.domain.User;
import com.qiyun.notif.service.UserException;
import com.qiyun.notif.service.UserListService;
import org.junit.Test;

public class UserListTest {
    @Test
    public void testGetAllUsers(){
        UserListService service = new UserListService();
        User[] users = service.getAllUsers();
        for (int i = 0; i < users.length; i++){
            System.out.println(users[i]);
        }
    }

    @Test
    public void testGetUser(){
        UserListService service = new UserListService();
        int id = 101;
        try {
            User user = service.getUser(id);
            System.out.println(user);
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }

    }
}
