package org.zgl.info.webService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="userService")
public interface UserIService {

	@WebMethod
	public boolean insertUserInfos(@WebParam(name="user") String text);
	
	@WebMethod
	public boolean showMsg(@WebParam(name="showMsg") String text);
}
