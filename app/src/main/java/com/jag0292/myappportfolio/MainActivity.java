package com.jag0292.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view){
        String message = getString(R.string.launch_toast_message);
        switch (view.getId()){
            case R.id.buttonSpotifyStreamer:
                message += getString(R.string.spotify_streamer_app_name);
                break;
            case R.id.buttonScoresApp:
                message += getString(R.string.scores_app_name);
                break;
            case R.id.buttonLibraryApp:
                message += getString(R.string.library_app_name);
                break;
            case R.id.buttonBuildItBigger:
                message += getString(R.string.build_it_bigger_app_name);
                break;
            case R.id.buttonXYZReader:
                message += getString(R.string.xyz_reader_app_name);
                break;
            case R.id.buttonCapstoneMyOwnApp:
                message += getString(R.string.capstone_app_name);
                break;
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}
