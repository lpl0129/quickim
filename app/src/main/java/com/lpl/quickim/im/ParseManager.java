package com.lpl.quickim.im;

import android.content.Context;

import com.hyphenate.EMValueCallBack;
import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.domain.EaseUser;

import java.util.List;

public class ParseManager {

	private static final String TAG = ParseManager.class.getSimpleName();
	
	private static final String ParseAppID = "UUL8TxlHwKj7ZXEUr2brF3ydOxirCXdIj9LscvJs";
	private static final String ParseClientKey = "B1jH9bmxuYyTcpoFfpeVslhmLYsytWTxqYqKQhBJ";
	
//	private static final String ParseAppID = "task";
//	private static final String ParseClientKey = "123456789";

	private static final String CONFIG_TABLE_NAME = "hxuser";
	private static final String CONFIG_USERNAME = "username";
	private static final String CONFIG_NICK = "nickname";
	private static final String CONFIG_AVATAR = "avatar";
	
	private static final String parseServer = "http://parse.easemob.com/parse/";

	private static ParseManager instance = new ParseManager();
	

	private ParseManager() {
	}

	public static ParseManager getInstance() {
		return instance;
	}

	public void onInit(Context context) {
		Context appContext = context.getApplicationContext();

	}

	public boolean updateParseNickName(final String nickname) {

		return false;
	}

	public void getContactInfos(List<String> usernames, final EMValueCallBack<List<EaseUser>> callback) {

	}

	
	public void asyncGetCurrentUserInfo(final EMValueCallBack<EaseUser> callback){
		final String username = EMClient.getInstance().getCurrentUser();
		asyncGetUserInfo(username, new EMValueCallBack<EaseUser>() {

			@Override
			public void onSuccess(EaseUser value) {
				callback.onSuccess(value);
			}

			@Override
			public void onError(int error, String errorMsg) {

			}
		});
	}
	
	public void asyncGetUserInfo(final String username,final EMValueCallBack<EaseUser> callback){

	}

	public String uploadParseAvatar(byte[] data) {

		return null;
	}

}
