package me.drakeet.toast.sample;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import me.drakeet.support.toast.ToastCompat;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ToastCompat.makeText(this, "hello", Toast.LENGTH_SHORT)
        .setBadTokenListener(toast -> {
          Log.e("failed toast", "hello");
        }).show();
  }
}
