package com.jiuxiao.zoubei.letusgo.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.jiuxiao.zoubei.letusgo.R;


public class LoginMainActivity extends Activity {
    private TextView mTvForget;
    private TextView mTvRegister;

    private Intent mIntent = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        InitiVariebles();
        /*
        ��ת��forgetҳ��
         */
        StartActivity(mTvForget, LoginForgetPasswordActivity.class);
        /*
        ��ת��registerҳ��
         */
        StartActivity(mTvRegister, LoginRegisterActivity.class);
    }


    /*
          ��ʼ������
     */
    private void InitiVariebles() {
        mTvForget = (TextView) findViewById(R.id.tv_forgetpassword);
        mTvRegister = (TextView) findViewById(R.id.tv_register);
    }

    /*
      ��תҳ��ķ���
     */

    private void StartActivity(TextView textview, final Class target) {
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIntent = new Intent(getApplicationContext(), target);
                startActivity(mIntent);
            }
        });
    }


}
