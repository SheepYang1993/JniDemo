package com.sheepyang.jnidemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JniUtils jniUtils = new JniUtils();
        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText("调用Jni运算的结果为： " + jniUtils.addInt(1, 2));
    }
}
