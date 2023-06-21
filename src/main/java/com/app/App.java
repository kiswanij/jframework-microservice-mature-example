package com.app;

import com.jk.core.cache.JKCacheFactory;
import com.jk.services.server.JKServiceConfig;
import com.jk.web.embedded.JKWebApplication;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("app")
public class App extends JKServiceConfig{
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JKCacheFactory.getCacheManager().cache("Key1", "Jalal1");
		JKCacheFactory.getCacheManager().cache("Key2", "Jalal2");
		JKCacheFactory.getCacheManager().cache("Key3", "Jalal3");
		JKCacheFactory.getCacheManager().cache("Key4", 10, Integer.class);
		JKWebApplication.run(8080,false);
	}

}
