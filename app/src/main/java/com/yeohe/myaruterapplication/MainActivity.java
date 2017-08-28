package com.yeohe.myaruterapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.DropBoxManager;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


@Route(path="/test/MainActivity")
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.hello_tv)
    TextView hello_tv;

    private static Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        activity = this;
    }

    public static Activity getThis() {
        return activity;
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @OnClick(R.id.hello_tv)
   public  void toNextActivity(View view){
        switch (view.getId()) {
            case R.id.hello_tv:

                Bundle bundle=new Bundle();
                Entity entity=new Entity();
                entity.setId("001");
                entity.setName("快快快");
                bundle.putParcelable("entity",entity);

//                Uri uri=new Uri.parse("lys://com.lys/test/TwoActivity");

                // 转场动画(API16+)
                ActivityOptionsCompat compat = ActivityOptionsCompat.
                        makeScaleUpAnimation(view, view.getWidth() / 2, view.getHeight() / 2, 0, 0);

                Uri uri=Uri.parse("lys://com.lys/test/TwoActivity");

//                ARouter.getInstance().build("/test/TwoActivity").withOptionsCompat(compat).navigation();
//                ARouter.getInstance().build("/test/TwoActivity").withTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom).navigation();
//                ARouter.getInstance().build("/test/TwoActivity").navigation(this,666);

//               Fragment fragment=(Fragment) ARouter.getInstance().build("/test/testFragment").navigation();
//                Toast.makeText(MainActivity.this,"找到了："+fragment.toString(),Toast.LENGTH_LONG).show();

//                ARouter.getInstance().build("/test/TwoActivity").navigation(this, new NavigationCallback() {
//                    @Override
//                    public void onFound(Postcard postcard) {
//
//                    }
//
//                    @Override
//                    public void onLost(Postcard postcard) {
//
//                    }
//
//                    @Override
//                    public void onArrival(Postcard postcard) {
//
//                    }
//
//                    @Override
//                    public void onInterrupt(Postcard postcard) {
//                        Toast.makeText(MainActivity.this,"被拦截了。。。。。。",Toast.LENGTH_LONG).show();
//                    }
//                });

//                ARouter.getInstance().build("/test/TwoActivity").withParcelable("entity",entity).navigation();

//                ARouter.getInstance()
//                        .build("/test/webview")
//                        .withString("url", "file:///android_asset/sc_test.html")
//                        .navigation();



//                ARouter.getInstance().build(uri)
//                        .withBoolean("status",false)
//                        .withString("result","0123456789")
//                        .withParcelable("entity",entity)
//                        .navigation(this, new NavigationCallback() {
//                            @Override
//                            public void onFound(Postcard postcard) {
//                                Toast.makeText(MainActivity.this, "发现目标Activity", Toast.LENGTH_SHORT).show();
//                            }
//
//                            @Override
//                            public void onLost(Postcard postcard) {
//                                Toast.makeText(MainActivity.this, "没有目标Activity", Toast.LENGTH_SHORT).show();
//                            }
//
//                            @Override
//                            public void onArrival(Postcard postcard) {
//                                Toast.makeText(MainActivity.this, "跳转完成", Toast.LENGTH_SHORT).show();
//                            }
//
//                            @Override
//                            public void onInterrupt(Postcard postcard) {
//                                Toast.makeText(MainActivity.this, "已被拦截", Toast.LENGTH_SHORT).show();
//                            }
//                        });
                Toast.makeText(MainActivity.this, "点击了....", Toast.LENGTH_LONG).show();
                break;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 666:
                Toast.makeText(MainActivity.this,"返回了。。。。。",Toast.LENGTH_LONG).show();
                break;
            default:

                break;
        }
    }
}
