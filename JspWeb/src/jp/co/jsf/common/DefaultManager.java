package jp.co.jsf.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public abstract class DefaultManager implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	public final void defaultInit() {
		init();
	}
	
	protected abstract void init();
	
	
	
}
