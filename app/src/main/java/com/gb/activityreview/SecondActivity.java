package com.gb.activityreview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

  String msg = "ActivitySecond : ";

  /** 当活动第一次被创建时调用 */
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.activity_second );

    Log.d( msg, "The onCreate() event" );
  }

  /** 当活动即将可见时调用 */
  @Override protected void onStart() {
    super.onStart();
    Log.d( msg, "The onStart() event" );
  }

  /** 当活动可见时调用 */
  @Override protected void onResume() {
    super.onResume();
    Log.d( msg, "The onResume() event" );
  }

  /** 当其他活动获得焦点时调用 */
  @Override protected void onPause() {
    super.onPause();
    Log.d( msg, "The onPause() event" );
  }

  /** 当活动不再可见时调用 */
  @Override protected void onStop() {
    super.onStop();
    Log.d( msg, "The onStop() event" );
  }

  /** 当活动将被销毁时调用 */
  @Override public void onDestroy() {
    super.onDestroy();
    Log.d( msg, "The onDestroy() event" );
  }

  /** 当活动将被销毁时调用 */
  @Override public void onRestart() {
    super.onRestart();
    Log.d( msg, "The onRestart() event" );
  }

  public void toSecondActivity(View view) {
    startActivity( new Intent( this, SecondActivity.class ) );
  }

  public void toThirdActivity(View view) {
    startActivity( new Intent( this, ThirdActivity.class ) );
  }

  public void onClickFinish(View view) {
    finish();
  }

  public void callOnDestroy(View view) {
    onDestroy();
    finish();
  }
}
