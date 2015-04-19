package com.coolweather.app.util;

/**
 * Created by a on 2015/4/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
