package dubbo_test;

import com.neko.dubbo.customer.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: zc
 * Date: 2016/12/4
 * Time: 21:24
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class CustomerServiceTest {


    @Autowired
    CustomerService customerService;

    @Test
    public void test() {
        customerService.say("world");
    }
}
