package com.sxli.pattern.decoratepattern.notpatern;

/**DES加密
 * @author sxli
 */
public class DES extends HttpApi {
	public void authentication() {
		super.authentication();
		System.out.println("查的不严，采用DES可逆转加密方式加密数据存放在数据库!");
	}
}
