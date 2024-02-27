package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Start");
		ServicePublish publisherService = new ServicePublisherImpl();
		
		publishServiceRegistration = context.registerService(ServicePublish.class.getName(),publisherService,null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		
	}

}
