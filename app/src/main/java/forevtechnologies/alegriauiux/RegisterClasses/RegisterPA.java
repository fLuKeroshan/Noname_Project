package forevtechnologies.alegriauiux.RegisterClasses;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import forevtechnologies.alegriauiux.R;
import forevtechnologies.alegriauiux.adapter.StableArrayAdapter;

/**
 * Created by ABHIJAY on 20-10-2017.
 */


public class RegisterPA extends Activity {


    public static String UNIQUE_ID;
    public static String NAME;
    public static String EVENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity_tech);


/*
        FirebaseAuth x = FirebaseAuth.getInstance();
        UNIQUE_ID= x.getCurrentUser().getUid();
        NAME = x.getCurrentUser().getDisplayName();
*/

        final ListView listview = (ListView) findViewById(R.id.reg_tech_lv);
        final String[] values = new String[]{"Dance Hero","Nrityanjali","Mario","Taandav","Turntables","Just Dance Now",
                                              "Faces","Skecz","Make Your Move","Parappa","The Voice Of Alegria","Open Mic",
                                                "Beat Boxing",};

        final ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0://todo add the fragment
                        break;
                    case 1://todo add the fragment
                        break;
                    case 2://todo add the fragment
                        break;
                    case 3://todo add the fragment
                        break;
                    case 4://todo add the fragment
                        break;
                    case 5://todo add the fragment
                        break;
                    case 6://todo add the fragment
                        break;
                    case 7://todo add the fragment
                        break;
                    case 8://todo add the fragment
                        break;
                    case 9://todo add the fragment
                        break;
                    case 10://todo add the fragment
                        break;
                    case 11://todo add the fragment
                        break;
                    case 12://todo add the fragment
                        break;
                    case 13://todo add the fragment
                        break;
                }
            }
        });
    }
}


