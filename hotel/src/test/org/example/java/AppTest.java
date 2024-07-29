
import org.example.config.SpringConfig;
import org.example.dao.CustomerMapper;
import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.example.unit.Result;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther sun
 * @Time 2024/7/29 下午4:19
 */

public class AppTest {
    @Test
    public void justTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerService bean = applicationContext.getBean(CustomerService.class);
        Result result = bean.login(new Customer("lsh666", "lsh123456"));
        System.out.println(result);
    }
}