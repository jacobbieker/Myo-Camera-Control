package com.jacobbieker.myocameracontrol;

import android.app.Activity;
import android.app.Fragment;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.commonsware.cwac.camera.CameraFragment;

/**
 * Created by Jacob on 12/17/2014.
 */
public class MyoCameraFragment extends CameraFragment {
    private static final String TAG = "CameraFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


}
