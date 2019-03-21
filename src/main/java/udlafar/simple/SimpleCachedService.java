package udlafar.simple;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SimpleCachedService {

	@Cacheable(value="echo")
	@SuppressWarnings("all")
	public String echo(String s) {
		return s;
	}

	@Cacheable(value="echoSync", sync=true)
	@SuppressWarnings("all")
	public String echoSync(String s) {
		return s;
	}
}
