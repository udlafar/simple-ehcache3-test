package udlafar.simple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleEhcache3Test {
	final String TEST = "MY_TEST_STR";

	@Autowired SimpleCachedService simpleCachedService;
	
    @Test
    public void testEcho() throws Exception {
    	System.out.println("TEST ECHO START");
    	
    	final String TEST = "SIMPLE_TEST_ECHO";
    	
    	assertEquals(TEST, simpleCachedService.echo(TEST));
    	assertEquals(TEST, simpleCachedService.echo(TEST));
    	assertEquals(TEST, simpleCachedService.echo(TEST));
    	
    	System.out.println("TEST ECHO END");
    }
    
    @Test
    public void testEchoSync() throws Exception {
    	System.out.println("TEST ECHO SYNC START");
    	
    	final String TEST = "SIMPLE_TEST_ECHO_SYNC";
    	
    	assertEquals(TEST, simpleCachedService.echoSync(TEST));
    	assertEquals(TEST, simpleCachedService.echoSync(TEST));
    	assertEquals(TEST, simpleCachedService.echoSync(TEST));
    	
    	System.out.println("TEST ECHO SYNC END");
    }
}
