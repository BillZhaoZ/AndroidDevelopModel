package com.scc.mvvm.mvp.model;

import com.scc.mvvm.mvp.presenter.OnLoginFinishedListener;
/**
  * 创建时间：2021/8/16
  * 功能：接口，表示Model层所要执行的业务逻辑
  */
public interface LoginModel {
    //User实体类；OnLoginFinishedListener presenter业务逻辑的返回结果
    void login(User user, OnLoginFinishedListener listener);
}
