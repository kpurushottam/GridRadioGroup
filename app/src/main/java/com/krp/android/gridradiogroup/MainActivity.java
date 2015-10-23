package com.krp.android.gridradiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.krp.android.gridradiogroup.widget.GridRadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*private void initBuyingSource() {
        RadioButton testChild = (RadioButton) buyingSrcRg.findViewById(R.id.rb_lead_buying_src);
        GridRadioGroup.LayoutParams lastChildParams = (GridRadioGroup.LayoutParams) testChild.getLayoutParams();

        if(sourceArr == null || sourceArr.length == 0) {
            // No lead buying times
            testChild.setVisibility(View.GONE);
        } else {
            testChild.setText(sourceArr[0]);
            for(int index=1, childCount=buyingSrcRg.getChildCount(); index < sourceArr.length; index++, childCount++) {
                RadioButton child = (RadioButton) getLayoutInflater().inflate(R.layout.layout_radio_btn_buy_pref_source, null);
                child.setText(sourceArr[index]);
                child.setLayoutParams(lastChildParams = new GridRadioGroup.LayoutParams(lastChildParams));
                buyingSrcRg.addView(child, childCount);
            }
        }
    }*/
}
