
import org.example.config.SpringConfig;
import org.example.dao.CustomerMapper;
import org.example.dao.OrderMapper;
import org.example.dao.RoomTypeMapper;
import org.example.entity.Customer;
import org.example.entity.Order;
import org.example.entity.RoomType;
import org.example.service.CustomerService;
import org.example.unit.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        OrderMapper bean = applicationContext.getBean(OrderMapper.class);
        List<Order> allOrderById = bean.getAllOrderById(4, "已预定");
        System.out.println(allOrderById);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
//        LocalDateTime.parse("")
//        bean.takeOrder(new Order(null,4,1,"已预约",60,))
//        System.out.println(roomTypes);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
    }
}