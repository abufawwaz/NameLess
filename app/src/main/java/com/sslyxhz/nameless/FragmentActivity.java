package com.sslyxhz.nameless;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sslyxhz.basecomponent.ServiceFactory;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ServiceFactory.getInstance().getAccountService().newUserFragment(this, R.id.layout_fragment, getSupportFragmentManager(), null, "");
    }
}
