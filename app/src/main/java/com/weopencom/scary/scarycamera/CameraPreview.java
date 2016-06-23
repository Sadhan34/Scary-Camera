package com.weopencom.scary.scarycamera;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Open on 23-Jun-16.
 */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
    public CameraPreview(Context context) {
        super(context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
