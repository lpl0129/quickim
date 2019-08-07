package com.lpl.quickim;

import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.lpl.quickim.im.ChatActivity;
import com.lpl.quickim.runtimepermissions.PermissionsManager;
import com.lpl.quickim.runtimepermissions.PermissionsResultAction;

public class MainActivity extends AppCompatActivity {

    //1109190116107051#niuniu
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestPermissions();
        initIM();
        initView();
    }

    private void initView() {
        Button im = findViewById(R.id.im_button);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                // it's single chat
                //联系人的id
                intent.putExtra(Constant.EXTRA_USER_ID, 联系人的id);
                startActivity(intent);
            }
        });
        Button sendIm = findViewById(R.id.send_im_button);
        sendIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
                // it's single chat
                //联系人的id
                intent.putExtra(Constant.EXTRA_USER_ID, 联系人的id);
                intent.putExtra(Constant.I_IM, 1);
                startActivity(intent);
            }
        });
    }

    private void initIM() {
        EMClient.getInstance().login(账号, 密码, new EMCallBack() {//回调
            @Override
            public void onSuccess() {
                EMClient.getInstance().groupManager().loadAllGroups();
                EMClient.getInstance().chatManager().loadAllConversations();
                Log.d("main", "登录聊天服务器成功！");
            }

            @Override
            public void onProgress(int progress, String status) {

            }

            @Override
            public void onError(int code, String message) {
                Log.d("main", "登录聊天服务器失败！");
            }
        });
    }

    @TargetApi(23)
    private void requestPermissions() {
        PermissionsManager.getInstance()
                .requestAllManifestPermissionsIfNecessary(this, new PermissionsResultAction() {

                    @Override
                    public void onGranted() {

                    }

                    @Override
                    public void onDenied(String permission) {

                    }
                });
    }
}
