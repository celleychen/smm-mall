/**
 * Welcome to https://waylau.com
 */
package com.waylau.smm.mall;

import com.waylau.smm.mvc.server.JettyServer;

/**
 * Application Main.
 * 
 * @since 1.0.0 2018年3月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class Application {

	public static void main(String[] args) throws Exception {
		new JettyServer(8080).run();;
	}

}
