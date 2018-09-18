package com.gb.activityreview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

  String msg = "ActivityFirst : ";

  /** 当活动第一次被创建时调用 */
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.activity_first );
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

  public void showDialog(View view) {
    AlertDialog.Builder builder = new AlertDialog.Builder( this );
    builder.setTitle( "对话框" );
    builder.setMessage( "点击按钮关闭对话框" );
    builder.setPositiveButton( "关闭", new DialogInterface.OnClickListener() {
      @Override public void onClick(DialogInterface dialog, int which) {
        //dialog.cancel();
      }
    } );
    builder.show();
  }

  public void showToast(View view) {
    Toast.makeText( this, "吐司吐司吐司", Toast.LENGTH_SHORT ).show();
  }
}

