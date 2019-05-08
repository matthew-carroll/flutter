package io.flutter.androidembedding;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import io.flutter.androidembedding.as_view.SingleFlutterViewActivity;
import io.flutter.androidembedding.fullscreen.FullscreenCustomFlutterActivity;
import io.flutter.androidembedding.partial_flow.LoginActivity;
import io.flutter.androidembedding.plugins.alarmmanagerplugin.AlarmManagerPluginActivity;
import io.flutter.androidembedding.plugins.BasicPluginActivity;
import io.flutter.androidembedding.plugins.cameraplugin.CameraPluginActivity;
import io.flutter.androidembedding.single_activity.FragTransitionActivity;
import io.flutter.androidembedding.single_activity.NavDrawerActivity;
import io.flutter.androidembedding.single_activity.TabbedActivity;
import io.flutter.androidembedding.single_activity.TabbedWithViewPagerActivity;
import io.flutter.view.FlutterMain;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FlutterMain.startInitialization(getApplication());
    FlutterMain.ensureInitializationComplete(getApplication(), new String[]{});

    findViewById(R.id.button_old_flutteractivity).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, io.flutter.app.FlutterActivity.class));
      }
    });

//    findViewById(R.id.button_fullscreen).setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View v) {
//        startActivity(FullscreenFlutterActivity.newIntent(MainActivity.this));
//      }
//    });

    findViewById(R.id.button_fullscreen).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(FullscreenCustomFlutterActivity.createDefaultIntent(MainActivity.this));
      }
    });

    findViewById(R.id.button_partial_flutter_flow).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(LoginActivity.newIntent(MainActivity.this));
      }
    });

    findViewById(R.id.button_drawer_fragment).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, NavDrawerActivity.class));
      }
    });

    findViewById(R.id.button_fragment_transitions).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, FragTransitionActivity.class));
      }
    });

    findViewById(R.id.button_page_tabs).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, TabbedActivity.class));
      }
    });

    findViewById(R.id.button_page_tabs_with_viewpager).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, TabbedWithViewPagerActivity.class));
      }
    });

    findViewById(R.id.button_standalone_view).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, SingleFlutterViewActivity.class));
      }
    });

    findViewById(R.id.button_list_item).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // TODO:
      }
    });

    findViewById(R.id.button_basic_plugin).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, BasicPluginActivity.class));
      }
    });

    findViewById(R.id.button_alarm_manager_plugin).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, AlarmManagerPluginActivity.class));
      }
    });

    findViewById(R.id.button_camera_plugin).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, CameraPluginActivity.class));
      }
    });
  }
}
