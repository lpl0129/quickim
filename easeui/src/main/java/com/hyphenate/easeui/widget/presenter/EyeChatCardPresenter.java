package com.hyphenate.easeui.widget.presenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.BaseAdapter;

import com.hyphenate.chat.EMMessage;
import com.hyphenate.easeui.EaseConstant;
import com.hyphenate.easeui.widget.chatrow.EaseChatRow;
import com.hyphenate.easeui.widget.chatrow.EyeChatCard;
import com.hyphenate.exceptions.HyphenateException;

/**
 * Created by 眼神 on 2018/5/6.
 */

public class EyeChatCardPresenter extends EaseChatRowPresenter {

    @Override
    protected EaseChatRow onCreateChatRow(Context cxt, EMMessage message, int position, BaseAdapter adapter) {
        return new EyeChatCard(cxt, message, position, adapter);

    }

    @Override
    public void onBubbleClick(EMMessage message) {
        System.out.println("-----------发送一个广播");
        Intent intent = new Intent(EaseConstant.USER_ACTION_1);
        try {
            intent.putExtra("id",message.getStringAttribute("dataId"));
        } catch (HyphenateException e) {
            e.printStackTrace();
        }
        getContext().sendBroadcast(intent);
    }
}