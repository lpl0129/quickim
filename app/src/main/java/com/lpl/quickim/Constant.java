package com.lpl.quickim;

import com.hyphenate.easeui.EaseConstant;

public class Constant extends EaseConstant {
    //每页条数---全局
    public  static  final int PAGE_SIZE = 10;

    // APP_ID 替换为你的应用从官方网站申请到的合法appID
    public static final String APP_ID = "wxe0729844ae328d5f";
    public static final String SECRET = "42060c17b52764e7fcfe457d0e78f709";

    public static final int CHATTYPE_SINGLE = 1;
    public static final int CHATTYPE_GROUP = 2;
    public static final int CHATTYPE_CHATROOM = 3;

    public static final String EXTRA_CHAT_TYPE = "chatType";
    public static final String EXTRA_USER_ID = "userId";

    public static final String NEW_FRIENDS_USERNAME = "item_new_friends";
    public static final String GROUP_USERNAME = "item_groups";
    public static final String CHAT_ROOM = "item_chatroom";
    public static final String ACCOUNT_REMOVED = "account_removed";
    public static final String ACCOUNT_CONFLICT = "conflict";
    public static final String ACCOUNT_FORBIDDEN = "user_forbidden";
    public static final String ACCOUNT_KICKED_BY_CHANGE_PASSWORD = "kicked_by_change_password";
    public static final String ACCOUNT_KICKED_BY_OTHER_DEVICE = "kicked_by_another_device";
    public static final String CHAT_ROBOT = "item_robots";
    public static final String MESSAGE_ATTR_ROBOT_MSGTYPE = "msgtype";
    public static final String ACTION_GROUP_CHANAGED = "action_group_changed";
    public static final String ACTION_CONTACT_CHANAGED = "action_contact_changed";


    public static final String EXTRA_CONFERENCE_ID = "confId";
    public static final String EXTRA_CONFERENCE_PASS = "password";
    public static final String EXTRA_CONFERENCE_INVITER = "inviter";
    public static final String EXTRA_CONFERENCE_IS_CREATOR = "is_creator";
    public static final String EXTRA_CONFERENCE_GROUP_ID = "group_id";

    public static final String MSG_ATTR_CONF_ID = "conferenceId";
    public static final String MSG_ATTR_CONF_PASS = EXTRA_CONFERENCE_PASS;
    public static final String MSG_ATTR_EXTENSION = "msg_extension";

    public static final String EM_CONFERENCE_OP = "em_conference_op";
    public static final String EM_CONFERENCE_ID = "em_conference_id";
    public static final String EM_CONFERENCE_PASSWORD = "em_conference_password";
    public static final String EM_CONFERENCE_TYPE = "em_conference_type";
    public static final String EM_MEMBER_NAME = "em_member_name";

    public static final String OP_INVITE = "invite";
    public static final String OP_REQUEST_TOBE_SPEAKER = "request_tobe_speaker";
    public static final String OP_REQUEST_TOBE_AUDIENCE = "request_tobe_audience";
}
