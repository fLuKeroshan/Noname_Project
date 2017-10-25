package forevtechnologies.alegriauiux.RegisterClasses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import forevtechnologies.alegriauiux.R;

/**
 * Created by ABHIJAY on 10-10-2017.
 */

public class RegisterActivity extends Activity implements View.OnClickListener {

    CardView fineartsCardView,informalCardView,performingArtsCardView,managementCardView,workshopsCardView,literaryArtsCardView,sportsAndGamingCardView,technicalCardView;
    TextView fineartsTextView,informalTextView,performingArtsTextView,managementTextView,workshopsTextView,literaryArtsTextView,sportsAndGamingTextView,technicalTextView;
    ImageView fineartsImageView,informalImageView,performingArtsImageView,managementImageView,workshopsImageView,literaryArtsImageView,sportsAndGamingImageView,technicalImageView;
    LinearLayout fineartsLayout,informalLayout,performingArtsLayout,managementLayout,workshopsLayout,literaryArtsLayout,sportsAndGamingLayout,technicalLayout;
    TableLayout TX,TX1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity_main);

        informalCardView = (CardView) findViewById(R.id.informalCardView);
        informalLayout = (LinearLayout) findViewById(R.id.informalLinearLayout);
        informalImageView = (ImageView) findViewById(R.id.informalImageView);
        informalTextView = (TextView) findViewById(R.id.informalTextView);

        fineartsCardView = (CardView) findViewById(R.id.fineartsCardView);
        fineartsLayout = (LinearLayout) findViewById(R.id.fineartsLayout);
        fineartsImageView = (ImageView) findViewById(R.id.fineartsImageView);
        fineartsTextView = (TextView) findViewById(R.id.fineartsTextView);

        technicalCardView = (CardView) findViewById(R.id.technicalCardView);
        technicalLayout = (LinearLayout) findViewById(R.id.technicalLinearLayout);
        technicalImageView = (ImageView) findViewById(R.id.technicalImageView);
        technicalTextView = (TextView) findViewById(R.id.technicalTextView);

        performingArtsCardView = (CardView) findViewById(R.id.performingArtsCardView);
        performingArtsLayout = (LinearLayout) findViewById(R.id.performingArtsLayout);
        performingArtsImageView = (ImageView) findViewById(R.id.performingArtsImageView);
        performingArtsTextView = (TextView) findViewById(R.id.performingArtsTextView);

        managementCardView = (CardView) findViewById(R.id.managementCardView);
        managementLayout = (LinearLayout) findViewById(R.id.managementLayout);
        managementImageView = (ImageView) findViewById(R.id.managementImageView);
        managementTextView = (TextView) findViewById(R.id.managementTextView);

        workshopsCardView = (CardView) findViewById(R.id.workshopsEvents);
        workshopsLayout = (LinearLayout) findViewById(R.id.workshopsLinearLayout);
        workshopsImageView = (ImageView) findViewById(R.id.workshopsImageView);
        workshopsTextView = (TextView) findViewById(R.id.workshopsTextView);

        sportsAndGamingCardView = (CardView) findViewById(R.id.sportsAndGamingCardView);
        sportsAndGamingLayout = (LinearLayout) findViewById(R.id.sportsAndGamingLinearLayout);
        sportsAndGamingImageView = (ImageView) findViewById(R.id.sportsAndGamingImageView);
        sportsAndGamingTextView = (TextView) findViewById(R.id.sportsAndGamingTextView);

        literaryArtsCardView = (CardView) findViewById(R.id.literaryArtsCardView);
        literaryArtsLayout = (LinearLayout) findViewById(R.id.literaryArtsLinearLayout);
        literaryArtsImageView = (ImageView) findViewById(R.id.literaryArtsImageView);
        literaryArtsTextView = (TextView) findViewById(R.id.literaryArtsTextView);


        TX = (TableLayout) findViewById(R.id.TX);
        TX1 = (TableLayout) findViewById(R.id.TX1);


        informalCardView.setOnClickListener(this);
        informalLayout.setOnClickListener(this);
        informalImageView.setOnClickListener(this);
        informalTextView.setOnClickListener(this);

        fineartsCardView.setOnClickListener(this);
        fineartsLayout.setOnClickListener(this);
        fineartsImageView.setOnClickListener(this);
        fineartsTextView.setOnClickListener(this);

        literaryArtsCardView.setOnClickListener(this);
        literaryArtsLayout.setOnClickListener(this);
        literaryArtsImageView.setOnClickListener(this);
        literaryArtsTextView.setOnClickListener(this);

        sportsAndGamingCardView.setOnClickListener(this);
        sportsAndGamingLayout.setOnClickListener(this);
        sportsAndGamingImageView.setOnClickListener(this);
        sportsAndGamingTextView.setOnClickListener(this);

        workshopsCardView.setOnClickListener(this);
        workshopsLayout.setOnClickListener(this);
        workshopsImageView.setOnClickListener(this);
        workshopsTextView.setOnClickListener(this);

        managementCardView.setOnClickListener(this);
        managementLayout.setOnClickListener(this);
        managementImageView.setOnClickListener(this);
        managementTextView.setOnClickListener(this);

        technicalCardView.setOnClickListener(this);
        technicalLayout.setOnClickListener(this);
        technicalImageView.setOnClickListener(this);
        technicalTextView.setOnClickListener(this);


        performingArtsCardView.setOnClickListener(this);
        performingArtsLayout.setOnClickListener(this);
        performingArtsImageView.setOnClickListener(this);
        performingArtsTextView.setOnClickListener(this);





    }
    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.fineartsCardView:
            case R.id.fineartsImageView:
            case R.id.fineartsLayout:
            case R.id.fineartsTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterFA.class));
                break;

            case R.id.performingArtsCardView:
            case R.id.performingArtsImageView:
            case R.id.performingArtsLayout:
            case R.id.performingArtsTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterPA.class));
                break;

            case R.id.informalCardView:
            case R.id.informalImageView:
            case R.id.informalLinearLayout:
            case R.id.informalTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterInformal.class));
                break;

            case R.id.sportsAndGamingCardView:
            case R.id.sportsAndGamingImageView:
            case R.id.sportsAndGamingLinearLayout:
            case R.id.sportsAndGamingTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterGaming.class));
                break;

            case R.id.managementCardView:
            case R.id.managementImageView:
            case R.id.managementLayout:
            case R.id.managementTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterManagement.class));
                break;

            case R.id.workshopsEvents:
            case R.id.workshopsLinearLayout:
            case R.id.workshopsImageView:
            case R.id.workshopsTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterWorkshops.class));
                break;

            case R.id.literaryArtsCardView:
            case R.id.literaryArtsImageView:
            case R.id.literaryArtsLinearLayout:
            case R.id.literaryArtsTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterLA.class));
                break;

            case R.id.technicalCardView:
            case R.id.technicalImageView:
            case R.id.technicalLinearLayout:
            case R.id.technicalTextView:
                startActivity(new Intent(RegisterActivity.this,RegisterTech.class));
                break;
        }

    }
}
