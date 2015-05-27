package br.com.arizona.custom_authentication_provider;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationFilter implements Callable  {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		
		String name = auth.getName()
				; 
		System.out.println(name);
		return name;

		// return eventContext.getMessage().getPayload();
	}

}
