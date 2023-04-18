package com.scc.mvvm.mvvm;

/**
  * 创建人：帅次
  * 创建时间：2021/8/17
  * 功能：ViewModel与View交互。
  */
public interface Callback<T> {
    void onCallBack(T t);
}
