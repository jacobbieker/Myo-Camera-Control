package com.jacobbieker.myocameracontrol.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

import com.jacobbieker.myocameracontrol.R;

/**
 * Created by Jacob on 12/23/2014.
 */
public class HelpFragment extends WebViewFragment {
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_help, container, false);
        Log.i("Fragment", "OnCreateView(): View Created");
        webView = getWebView();
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        webView.loadUrl("index.html");
    }


}
