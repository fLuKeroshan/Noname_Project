package forevtechnologies.alegriauiux;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.fujiyuu75.sequent.Sequent;

/**
 * Created by ABHIJAY on 10-10-2017.
 */

public class RegisterActivity extends Activity implements View.OnClickListener {

    CardView informalCardView,performingArtsCardView,managementCardView,workshopsCardView,literaryArtsCardView,sportsAndGamingCardView,technicalCardView;
    TextView informalTextView,performingArtsTextView,managementTextView,workshopsTextView,literaryArtsTextView,sportsAndGamingTextView,technicalTextView;
    ImageView informalImageView,performingArtsImageView,managementImageView,workshopsImageView,literaryArtsImageView,sportsAndGamingImageView,technicalImageView;
    LinearLayout informalLayout,performingArtsLayout,managementLayout,workshopsLayout,literaryArtsLayout,sportsAndGamingLayout,technicalLayout;
    TableLayout TX,TX1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);

        informalCardView = (CardView) findViewById(R.id.informalCardView);
        informalLayout = (LinearLayout) findViewById(R.id.informalLinearLayout);
        informalImageView = (ImageView) findViewById(R.id.informalImageView);
        informalTextView = (TextView) findViewById(R.id.informalTextView);

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

            case R.id.performingArtsCardView:
            case R.id.performingArtsImageView:
            case R.id.performingArtsLayout:
            case R.id.performingArtsTextView:
                //TODO add navigation to pages
                break;

            case R.id.informalCardView:
            case R.id.informalImageView:
            case R.id.informalLinearLayout:
            case R.id.informalTextView:
                //TODO add navigation to pages
                break;

            case R.id.sportsAndGamingCardView:
            case R.id.sportsAndGamingImageView:
            case R.id.sportsAndGamingLinearLayout:
            case R.id.sportsAndGamingTextView:
                //TODO add navigation to pages
                break;

            case R.id.managementCardView:
            case R.id.managementImageView:
            case R.id.managementLayout:
            case R.id.managementTextView:
                //TODO add navigation to pages
                break;

            case R.id.workshopsEvents:
            case R.id.workshopsLinearLayout:
            case R.id.workshopsImageView:
            case R.id.workshopsTextView:
                //TODO add navigation to pages
                break;

            case R.id.literaryArtsCardView:
            case R.id.literaryArtsImageView:
            case R.id.literaryArtsLinearLayout:
            case R.id.literaryArtsTextView:
                //TODO add navigation to pages
                break;

            case R.id.technicalCardView:
            case R.id.technicalImageView:
            case R.id.technicalLinearLayout:
            case R.id.technicalTextView:
                //TODO add navigation to pages
                break;
        }

    }
}
