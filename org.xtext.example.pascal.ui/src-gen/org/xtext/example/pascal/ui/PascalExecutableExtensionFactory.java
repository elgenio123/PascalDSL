/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.pascal.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.pascal.ui.internal.PascalActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PascalExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(PascalActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		PascalActivator activator = PascalActivator.getInstance();
		return activator != null ? activator.getInjector(PascalActivator.ORG_XTEXT_EXAMPLE_PASCAL_PASCAL) : null;
	}

}