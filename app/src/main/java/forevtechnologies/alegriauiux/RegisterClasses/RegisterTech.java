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


public class RegisterTech extends Activity {


    public static String UNIQUE_ID;
    public static String NAME;
    public static String EVENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity_tech);



        FirebaseAuth x = FirebaseAuth.getInstance();
        UNIQUE_ID= x.getCurrentUser().getUid();
        NAME = x.getCurrentUser().getDisplayName();

        final ListView listview = (ListView) findViewById(R.id.reg_tech_lv);

        final String[] values = new String[]{"Asphalt", "Hill Climb", "Pac Man", "Mortal Combat", "Foosball", "World Wide Web",
                                             "Paper Toss","Tetris", "Circuit Puzzle", "Code Surfer", "The Wrap", "Tech Roadies",
                                             "Hackathon"};

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
                switch(position)
                {
                    case 0 ://TODO redirect to register
                        break;
                    case 1 ://TODO redirect to register
                        break;
                    case 2 ://TODO redirect to register
                        break;
                    case 3 ://TODO redirect to register
                        break;
                    case 4 ://TODO redirect to register
                        break;
                    case 5 ://TODO redirect to register
                        break;
                    case 6 ://TODO redirect to register
                        break;
                    case 7 ://TODO redirect to register
                        break;
                    case 8 ://TODO redirect to register
                        break;
                    case 9 ://TODO redirect to register
                        break;
                    case 10 ://TODO redirect to register
                        break;
                    case 11 ://TODO redirect to register
                        break;
                    case 12 ://TODO redirect to register
                        break;

                }
            }
        });
    }
}

