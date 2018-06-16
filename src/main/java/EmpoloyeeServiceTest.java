import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import services.IEmployeeService;

/**
 * @author lw
 * @version 1.0
 * @description test
 * @date 2018/6/15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.cfg.xml")
public class EmpoloyeeServiceTest {
    @Autowired
    IEmployeeService service;
    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        System.out.println( service.selectAll() );
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void setMapper() {
    }
}