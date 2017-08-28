package com.yeohe.myaruterapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by Administrator on 2017/8/23.
 */

@Route(path = "/test/webview")
public class TestWebView extends Activity {

    WebView webview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test_webview);


        webview = (WebView) findViewById(R.id.webview);
        webview.loadUrl(getIntent().getStringExtra("url"));
    }
}
