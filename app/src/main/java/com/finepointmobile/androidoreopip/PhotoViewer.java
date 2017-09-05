package com.finepointmobile.androidoreopip;

import android.app.PictureInPictureParams;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Rational;

/**
 * Created by danielmalone on 9/4/17.
 */

public class PhotoViewer extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_viewer);

        PictureInPictureParams params = new PictureInPictureParams.Builder().setAspectRatio(new Rational(2, 3)).build();
        enterPictureInPictureMode(params);
    }
}
