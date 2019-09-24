package org.zgl.info.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.zgl.info.bean.User;

@Mapper
public interface UserMapper {

	void insertUser(User user) throws Exception;

	
}
