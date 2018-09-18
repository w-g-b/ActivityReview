package com.gb.activityreview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ThirdActivity extends Activity {

  String msg = "ActivityThird : ";

  /** 当活动第一次被创建时调用 */
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate( savedInstanceState );
    //setTheme( R.style.MyDialog );
    setContentView( R.layout.activity_third );
    Log.d( msg, "The onCreate() event" );
    Window win = getWindow();
    win.getDecorView().setPadding( 0, 0, 0, 0 );
    WindowManager.LayoutParams lp = win.getAttributes();
    lp.width = WindowManager.LayoutParams.MATCH_PARENT;
    lp.height = getWindowManager().getDefaultDisplay().getHeight();
    win.setAttributes( lp );
  }

  public void onClickFinish(View view) {
    finish();
  }

  /** 当活动即将可见时调用 */
  @Override protected void onStart() {
    super.onStart();
    View v = getWindow().getDecorView();
    v.setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN );
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
}
