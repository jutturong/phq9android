package training.bit.kku.myapplication;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost = getTabHost();

        mTabHost.addTab(mTabHost.newTabSpec("tab_test1").setIndicator("Part I (Personal Information) ").setContent(R.id.tab1));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test2").setIndicator("Part II (Stress Questionnaire Daily)").setContent(R.id.tab2));
        mTabHost.addTab(mTabHost.newTabSpec("tab_test3").setIndicator("Part III (Patient Health Questionnaire)").setContent(R.id.tab3));

        mTabHost.setCurrentTab(0);




        // numberPicker1
        final NumberPicker numberPK1 = (NumberPicker) findViewById(R.id.numberPicker1);
        numberPK1.setMaxValue(100);
        numberPK1.setMinValue(1);
        numberPK1.setWrapSelectorWheel(false);

        // numberPicker2
        final NumberPicker numberPK2 = (NumberPicker) findViewById(R.id.numberPicker2);
        numberPK2.setMaxValue(12);
        numberPK2.setMinValue(1);
        numberPK2.setWrapSelectorWheel(false);

        // numberPicker3
        final NumberPicker numberPK3 = (NumberPicker) findViewById(R.id.numberPicker3);
        numberPK3.setMaxValue(30);
        numberPK3.setMinValue(1);
        numberPK3.setWrapSelectorWheel(false);


/*
        // numberPicker4
        final NumberPicker numberPK4 = (NumberPicker) findViewById(R.id.numberPicker4);
        numberPK4.setMaxValue(50);
        numberPK4.setMinValue(0);
        numberPK4.setWrapSelectorWheel(false);
*/


        /*
        final ImageButton imbtn=(ImageButton)findViewById(R.id.imageButton1);
        //imbtn.setImageResource(R.drawable.);
*/



    }
}
