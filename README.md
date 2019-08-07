1、修改manifest文件
  <!-- 设置环信应用的AppKey -->
  <meta-data
   android:name="EASEMOB_APPKEY"
   android:value="你的APP_KEY"/>
   
2、将EMClient.getInstance().login()的账号改成自己应有的

3、修改环信demo的APP_KEY，使用同一个应用下的账号登录，这样就可以测试集成效果了

4、如果你也需要自定义消息（如何自定义，可以百度），同时直接消息点击后跳转，切记注意布局文件中的控件id取名，不然收不到点击事件
看EaseChatRow类中的setClickListener



