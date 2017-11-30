package com.sxli.pattern.decoratepattern.pattern.decorate;

import com.sxli.pattern.decoratepattern.pattern.component.HttpApiComponent;

/**SHA1加密
 * @author sxli
 */
public class SHA1 extends HttpApiDecorate{
	
	HttpApiComponent component;
	
	private void sha1() {
		System.out.println("查的严，采用SHA1不可逆转加密方式加密数据存放在数据库!");
	}

	@Override
	public void authentication() {
		sha1();
		component.authentication();
	}

	@Override
	public void decorate(HttpApiComponent component) {
		this.component = component;
	}
}
