package com.htsmart.wristband.sample;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Map;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        TextView textView = (TextView) findViewById(R.id.textView);
        String message="";
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        Map<String, ?> allEntries = sharedPreferences.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            message = message + "map values: " + entry.getKey() + ": " + entry.getValue().toString() + "\n";
            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());
        }
        textView.setText(message);
    }
}
