/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.design.tests.automation.ui.stories;

import org.junit.Test;
import org.obeonetwork.dsl.uml2.design.tests.automation.ui.contexts.TheReferenceModelSelectedInModelExplorer;

//@Story("CreateClassDiagram")
public class CreateClassDiagram extends
		TheReferenceModelSelectedInModelExplorer {
	// @Scenario("CreateAClassDiagramFromAPackage")
	@Test
	public void createAClassDiagramFromAPackage() throws Exception {
		actionCreateAClassDiagram();
		assertClassDiagramCreated();
	}
}
