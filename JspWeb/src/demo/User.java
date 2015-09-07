/*******************************************************************************
 * Copyright (c) 2010 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jp.co.jsf.common.DefaultManager;

/**
 * Created by JBoss Tools
 */
@ManagedBean
@ViewScoped
public class User extends DefaultManager{
	private String name;

	protected void init() {
		// TODO 自動生成されたメソッド・スタブ
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "kim sang woo";
	}
}