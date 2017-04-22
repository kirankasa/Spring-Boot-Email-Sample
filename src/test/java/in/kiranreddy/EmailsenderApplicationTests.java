package in.kiranreddy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailsenderApplicationTests {


	@Autowired
	private EmailService emailService;


	@Test
	public void testEmail(){
		emailService.sendMail("kiranreddy2004@gmail.com","Test subject","Test mail");
	}

}
