package com.sxli.pattern.decoratepattern.pattern.decorate;

import com.sxli.pattern.decoratepattern.pattern.component.HttpApiComponent;

/**
 * @author sxli
 *
 */
public abstract class HttpApiDecorate implements HttpApiComponent{
	public abstract void authentication();
	public abstract void decorate(HttpApiComponent component);
}
