package cn.edu.bjtu.weibo.serviceImpl;

import cn.edu.bjtu.weibo.dao.UserDAO;
import cn.edu.bjtu.weibo.model.User;
import cn.edu.bjtu.weibo.service.UserProfileService;

public class UserProfileServiceImpl implements UserProfileService {
	
	UserDAO userdao=null;
	
	@Override
	public boolean createNewUser(User user) {
		userdao.insertNewUser(user);
		return true;
	}

	@Override
	public User getUserProfile(String userId) {
		User user=new User();
		user.setAge(userdao.getUserAge(userId));
		user.setBirthday(userdao.getBirthday(userId));
		user.setEducation(userdao.getUserEducation(userId));
		user.setEmail(userdao.getUserEmail(userId));
		user.setIntroduction(userdao.getUserIntroduction(userId));
		user.setLastWeiboId(userdao.getBirthday(userId));
		user.setLocation(userdao.getLocation(userId));
		user.setName(userdao.getUserName(userId));
		user.setPhone(userdao.getUserPhoneNumber(userId));
		user.setQq(userdao.getUserQQ(userId));
		user.setSex(userdao.getSex(userId));
		return user;
	}

	@Override
	public boolean updateUserName(String userId, String userName) {
		userdao.updateUserName(userId, userName);
		return true;
	}

	@Override
	public boolean updateUserIntroduction(String userId, String introduction) {
		userdao.updateUserIntroduction(userId, introduction);
		return true;
	}

	@Override
	public boolean updateUserPhoneNumber(String userId, String phoneNumber) {
		userdao.updateUserPhoneNumber(userId, phoneNumber);
		return true;
	}

	@Override
	public boolean updateUserSex(String userId, String sex) {
		userdao.updateSex(userId, sex);
		return true;
	}

	@Override
	public boolean updateUserAge(String userId, String age) {
		userdao.updateUserAge(userId, age);
		return true;
	}

	@Override
	public boolean updateUserBirthday(String userId, String birthday) {
		userdao.updateBirthday(userId, birthday);
		return true;
	}

	@Override
	public boolean updateUserLocation(String userId, String location) {
		userdao.updateLocation(userId, location);
		return true;
	}

	@Override
	public boolean updateUserEmail(String userId, String email) {
		userdao.updateUserEmail(userId, email);
		return true;
	}

	@Override
	public boolean updateUserQQ(String userId, String qq) {
		userdao.updateUserQQ(userId, qq);
		return true;
	}

	@Override
	public boolean updateUserEducation(String userId, String education) {
		userdao.updateUserEducation(userId, education);
		return true;
	}

	@Override
	public boolean updateUserLastWeiboId(String userId, String lastWeiboId) {
		userdao.updateLastWeiboId(userId, lastWeiboId);
		return true;
	}

}
