package com.sxli.pattern.decoratepattern.notpatern;

/**SHA1加密
 * @author sxli
 */
public class SHA1 extends HttpApi {
	public void authentication() {
		super.authentication();
		System.out.println("查的不严，采用DES可逆转加密方式加密数据存放在数据库!");
	}
}
