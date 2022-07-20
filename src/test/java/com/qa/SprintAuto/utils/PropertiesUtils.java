package com.qa.SprintAuto.utils;

import java.util.Iterator;

import org.apache.commons.configuration2.AbstractConfiguration;
import org.apache.commons.configuration2.CompositeConfiguration;
import org.springframework.stereotype.Component;

@Component
public class PropertiesUtils extends AbstractConfiguration{

	public CompositeConfiguration ConfigManager() {
		return new CompositeConfiguration();
	}

	@Override
	public void addPropertyDirect(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void clearPropertyDirect(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Iterator<String> getKeysInternal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object getPropertyInternal(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean isEmptyInternal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean containsKeyInternal(String key) {
		// TODO Auto-generated method stub
		return false;
	}
}
