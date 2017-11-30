package com.sxli.pattern.decoratepattern.pattern.decorate;

import com.sxli.pattern.decoratepattern.pattern.component.HttpApiComponent;

/**DES加密
 * @author sxli
 */
public class DES extends HttpApiDecorate {
	HttpApiComponent component;
	
	private void des() {
		System.out.println("查的不严，采用DES可逆转加密方式加密数据存放在数据库!");
	}

	@Override
	public void authentication() {
		des();
		component.authentication();
	}

	@Override
	public void decorate(HttpApiComponent component) {
		this.component = component;
	}
}
