1、修改manifest文件
  <meta-data
   android:name="EASEMOB_APPKEY"
   android:value="你的APP_KEY"/>
   
2、将EMClient.getInstance().login()的账号改成自己的

3、跳转到ChatActivity时填写联系让人id。

为避免有人没有看readme，上述步骤需要替换的位置我写的中文，处于报错状态，这样就不会忘记改了。

3、修改环信demo的APP_KEY，使用同一个应用下的账号登录，这样就可以测试集成效果了

4、如果你也需要自定义消息（如何自定义，可以百度），同时直接消息点击后跳转，切记注意布局文件中的控件id取名，不然收不到点击事件

重点看EaseChatRow类中的setClickListener和

自定义xxxChatCardPresenter extends EaseChatRowPresenter 类的onBubbleClick()方法



