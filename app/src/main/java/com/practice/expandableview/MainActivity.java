package com.practice.expandableview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.expandableView)
    MyExpandableView expandableView;
    View subView;
    @BindView(R.id.expandableView1)
    MyExpandableView expandableView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.actionBtn, R.id.actionBtn1})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.actionBtn:
                if (expandableView.isCollpased())
                    expandableView.expand();
                else
                    expandableView.collapse();
                break;
            case R.id.actionBtn1:
                if (expandableView1.isCollpased())
                    expandableView1.expand();
                else
                    expandableView1.collapse();
                break;
        }
    }
}
