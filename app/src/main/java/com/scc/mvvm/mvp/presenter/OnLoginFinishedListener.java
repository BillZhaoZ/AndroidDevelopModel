package com.scc.mvvm.mvp.presenter;
/**
  * 创建时间：2021/8/16
  * 功能：当Model层得到请求的结果，回调Presenter层，让Presenter层调用View层的接口方法。
  */
public interface OnLoginFinishedListener {
    void onUserNameError();

    void onPasswordError();

    void onSuccess();
}
