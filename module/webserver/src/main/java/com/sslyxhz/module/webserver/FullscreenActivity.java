package com.sslyxhz.module.webserver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;


public class FullscreenActivity extends Activity {

    private WebView localWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        //Make sure webview is fullscreen and in immersive mode
        View v = findViewById(R.id.webView);
        v.setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                | View.SYSTEM_UI_FLAG_IMMERSIVE);

        this.localWebView = (WebView)(findViewById(R.id.webView));

        new CWWebApplication(this, this.getApplicationContext()).launch("/", this.localWebView);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }
}
