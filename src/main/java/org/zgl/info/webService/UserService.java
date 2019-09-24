package org.zgl.info.webService;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zgl.info.bean.User;
import org.zgl.info.mapper.UserMapper;

import com.google.gson.Gson;

@WebService(serviceName="userService",endpointInterface = "org.zgl.info.webService.UserIService")
public class UserService implements UserIService {

	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Resource
	private UserMapper userMapper;
	
	@Override
	public boolean insertUserInfos(String text) {
		// TODO Auto-generated method stub
		User user = new Gson().fromJson(text ,User.class);
		try {
			userMapper.insertUser(user);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error(e.toString());
			return false;
		}
	}

	@Override
	public boolean showMsg(String text) {
		// TODO Auto-generated method stub
		logger.info("=================="+text);
		
		return true;
	}

}
