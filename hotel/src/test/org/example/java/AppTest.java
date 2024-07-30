
import org.example.config.SpringConfig;
import org.example.dao.CustomerMapper;
import org.example.dao.RoomTypeMapper;
import org.example.entity.Customer;
import org.example.entity.RoomType;
import org.example.service.CustomerService;
import org.example.unit.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @Auther sun
 * @Time 2024/7/29 下午4:19
 */
@ContextConfiguration(classes = SpringConfig.class)
public class AppTest {
    @Test
    public void serviceTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerService bean = applicationContext.getBean(CustomerService.class);
        Result result = bean.register(new Customer(null, "yyh", "余延浩", "123456", "Y", 0, "18596672881"));
        System.out.println(result);
    }

    @Test
    public void daoTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        RoomTypeMapper bean = applicationContext.getBean(RoomTypeMapper.class);
        List<RoomType> roomTypes = bean.queryAllRoomType();
        System.out.println(roomTypes);
    }
}