package training.bit.kku.myapplication;

import android.app.AlertDialog;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.RatingBar;
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

        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        final RatingBar rating_Bar = (RatingBar)findViewById(R.id.ratingBar1);
        rating_Bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {

               // txtView1.setText("Your Selected : " + String.valueOf(rating));

                AlertDialog ad = adb.create();
                ad.setMessage(""+ String.valueOf(rating));
                ad.show();
                
                /*
                if( rating == 5 )
                {   ad.setMessage("5. ดีมาก");  }
                else if( rating == 4 )
                {   ad.setMessage("4. ดี");  }
               else if( rating == 3 )
                {   ad.setMessage("3. ดี");  }
                else if( rating == 2 )
                {   ad.setMessage("2. พอใช้");  }
                else if( rating == 1 )
                {   ad.setMessage("1. แย่");  }
                ad.show();
                */

            }
        });

    }
}
