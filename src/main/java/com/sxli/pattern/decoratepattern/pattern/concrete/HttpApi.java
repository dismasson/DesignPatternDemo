package com.sxli.pattern.decoratepattern.pattern.concrete;

import com.sxli.pattern.decoratepattern.pattern.component.HttpApiComponent;

/**
 * HttpApi 对外开放的一款认证Api，起到针对用户传入的东西给他看看是否认证成功
 * @author sxli
 */
public class HttpApi implements HttpApiComponent{
	public void authentication() {
		System.out.println("您好，针对你输入的信息，认证成功!");
	}
}
