package com.sxli.pattern.decoratepattern.test;

import com.sxli.pattern.decoratepattern.pattern.component.HttpApiComponent;
import com.sxli.pattern.decoratepattern.pattern.concrete.HttpApi;
import com.sxli.pattern.decoratepattern.pattern.decorate.DES;
import com.sxli.pattern.decoratepattern.pattern.decorate.SHA1;

/**
 * @author sxli
 *
 */
public class Test {
	public static void main(String[] args) {
		HttpApiComponent api = new HttpApi();
		//查的不严，采用可逆转加密
		DES des=new DES();
		des.decorate(api);
		des.authentication();
		//查的严，用不可逆转加密
		SHA1 sha1=new SHA1();
		sha1.decorate(api);
		sha1.authentication();
	}
}
