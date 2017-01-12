/*******************************************************************************
 * Copyright (c) 2016-2017 Pivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal, Inc. - initial API and implementation
 *******************************************************************************/

package org.springframework.ide.vscode.commons.javadoc;

import org.springframework.ide.vscode.commons.util.Renderable;
import org.springframework.ide.vscode.commons.util.Renderables;

public class HtmlJavadoc implements IJavadoc {
	
	private String html;
	
	public HtmlJavadoc(String html) {
		this.html = html;
	}

	@Override
	public String raw() {
		throw new UnsupportedOperationException("Not yet implemnted");
	}

	@Override
	public Renderable getRenderable() {
		return Renderables.htmlBlob(html);
	}


}
