package userVarification.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr = {ApplicartionConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("I am running");
		String[] a = {"/"};
		return a;
	}

}
