package com.yeohe.myaruterapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/8/22.
 */

@Route(path="/test/TwoActivity")
public class TwoActivity extends Activity {

    @BindView(R.id.tv1)
    TextView tv1;

    @Autowired
    public boolean status;

    @Autowired
    public String result;

    @Autowired
    public Entity entity;

    @Autowired
    public Bean bean;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_activity);

        ButterKnife.bind(this);

        ARouter.getInstance().inject(this);
        if (!status)
            tv1.setText(result+"\n"+entity.getId()+"\n"+entity.getName()+"\n");
    }
}
