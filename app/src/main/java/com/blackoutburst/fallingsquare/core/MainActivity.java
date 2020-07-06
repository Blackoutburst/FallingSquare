package com.blackoutburst.fallingsquare.core;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.blackoutburst.fallingsquare.R;
import com.blackoutburst.fallingsquare.utils.Vector3f;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor sensor;
    public static Vector3f accelerometer = new Vector3f();
    private GameCore stage;
    public static int width;
    public static int height;
    Handler handler = new Handler();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        if(size.x < size.y){
            width = size.y;
            height = size.x;
        }else{
            width = size.x;
            height = size.y;
        }

        setContentView(R.layout.activity_main);
        stage = findViewById(R.id.stage);
        final TextView textView = findViewById(R.id.textView);
        final TextView title = findViewById(R.id.title);
        textView.setVisibility(View.INVISIBLE);
        textView.setTextSize(32);
        title.setTextSize(40);

        final TextView pause = findViewById(R.id.pause);
        pause.setVisibility(View.INVISIBLE);
        pause.setTextSize(40);

        final TextView level_complete = findViewById(R.id.level_complete);
        level_complete.setVisibility(View.INVISIBLE);
        level_complete.setTextSize(40);

        final TextView game_over = findViewById(R.id.game_over);
        game_over.setVisibility(View.INVISIBLE);
        game_over.setTextSize(40);

        Runnable r=new Runnable() {
            public void run() {
                if (GameCore.inPause) {
                    pause.setVisibility(View.VISIBLE);
                } else {
                    pause.setVisibility(View.INVISIBLE);
                }

                if (GameCore.win) {
                    level_complete.setVisibility(View.VISIBLE);
                } else {
                    level_complete.setVisibility(View.INVISIBLE);
                }

                if (GameCore.dead) {
                    game_over.setVisibility(View.VISIBLE);
                } else {
                    game_over.setVisibility(View.INVISIBLE);
                }

                if (GameCore.inMenu && GameCore.main) {
                    title.setVisibility(View.VISIBLE);
                } else {
                    title.setVisibility(View.INVISIBLE);
                }
                if (!GameCore.inMenu) {
                    textView.setVisibility(View.VISIBLE);
                } else {
                    textView.setVisibility(View.INVISIBLE);

                }

                textView.setText("Level "+GameCore.level);
                handler.postDelayed(this, 100);
            }
        };

        handler.postDelayed(r, 100);
    }

    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {}

    public void onSensorChanged(SensorEvent event) {
        accelerometer.x = event.values[0];
        accelerometer.y = event.values[1];
        accelerometer.z = event.values[2];
    }
}
