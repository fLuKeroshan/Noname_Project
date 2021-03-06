package forevtechnologies.alegriauiux;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import com.fujiyuu75.sequent.Sequent;

import forevtechnologies.alegriauiux.RegisterClasses.RegisterActivity;

/**
 * Created by thisi on 12-05-2017.
 */

public class HOUSE extends Fragment implements View.OnClickListener {
    CardView profileCardView,contactCardView,eventsCardView,campusCardView,concertCardView,chatCardView,scheduleCardView,registerCardView;
    TextView profileTextView,contactTextView,eventsTextView,campusTextView,concertTextView,chatTextView,scheduleTextView,registerTextView;
    ImageView profileImageView,contactImageView,eventsImageView,campusImageView,concertImageView,chatImageView,scheduleImageView,registerImageView;
    LinearLayout profileLayout,contactLayout,eventsLayout,campusLayout,concertLayout,chatLayout,scheduleLayout,registerLayout;
    TableLayout TX,TX1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initui(view);

        Sequent.origin(TX).anim(getActivity(), R.anim.bounce_in).start();
        Sequent.origin(TX1).anim(getActivity(), R.anim.bounce_in).start();



    return view;
    }

    void initui(View v)
    {
        profileCardView=(CardView)v.findViewById(R.id.profileCardView);
        profileLayout=(LinearLayout)v.findViewById(R.id.profileLinearLayout);
        profileImageView=(ImageView)v.findViewById(R.id.profileImageView);
        profileTextView=(TextView)v.findViewById(R.id.profileTextView);

        contactCardView=(CardView)v.findViewById(R.id.contactCardView);
        contactLayout=(LinearLayout)v.findViewById(R.id.contactLinearLayout);
        contactImageView=(ImageView)v.findViewById(R.id.contactImageView);
        contactTextView=(TextView)v.findViewById(R.id.contactTextView);

        eventsCardView=(CardView)v.findViewById(R.id.eventsCardView);
        eventsLayout=(LinearLayout)v.findViewById(R.id.eventsLayout);
        eventsImageView=(ImageView)v.findViewById(R.id.eventsImageView);
        eventsTextView=(TextView)v.findViewById(R.id.eventsTextView);

        campusCardView=(CardView)v.findViewById(R.id.campusCardView);
        campusLayout=(LinearLayout)v.findViewById(R.id.campusLayout);
        campusImageView=(ImageView)v.findViewById(R.id.campusImageView);
        campusTextView=(TextView)v.findViewById(R.id.campusTextView);

        concertCardView=(CardView)v.findViewById(R.id.concertCardView);
        concertLayout=(LinearLayout)v.findViewById(R.id.concertLayout);
        concertImageView=(ImageView)v.findViewById(R.id.concertImageView);
        concertTextView=(TextView)v.findViewById(R.id.concertTextView);

        chatCardView=(CardView)v.findViewById(R.id.scheduleCardView);
        chatLayout=(LinearLayout)v.findViewById(R.id.scheduleLayout);
        chatImageView=(ImageView)v.findViewById(R.id.scheduleImageView);
        chatTextView=(TextView)v.findViewById(R.id.scheduleTextView);

        scheduleCardView=(CardView)v.findViewById(R.id.chatCardView);
        scheduleLayout=(LinearLayout)v.findViewById(R.id.chatLayout);
        scheduleImageView=(ImageView)v.findViewById(R.id.chatImageView);
        scheduleTextView=(TextView)v.findViewById(R.id.chatTextView);


        registerCardView=(CardView)v.findViewById(R.id.registerCardView);
        registerLayout=(LinearLayout)v.findViewById(R.id.registerLayout);
        registerImageView=(ImageView)v.findViewById(R.id.registerImageView);
        registerTextView=(TextView)v.findViewById(R.id.registerTextView);

        TX=(TableLayout) v.findViewById(R.id.TX);
        TX1=(TableLayout) v.findViewById(R.id.TX1);

        profileCardView.setOnClickListener(this);
        profileLayout.setOnClickListener(this);
        profileImageView.setOnClickListener(this);
        profileTextView.setOnClickListener(this);

        contactCardView.setOnClickListener(this);
        contactLayout.setOnClickListener(this);
        contactImageView.setOnClickListener(this);
        contactTextView.setOnClickListener(this);

        eventsCardView.setOnClickListener(this);
        eventsLayout.setOnClickListener(this);
        eventsImageView.setOnClickListener(this);
        eventsTextView.setOnClickListener(this);

        campusCardView.setOnClickListener(this);
        campusLayout.setOnClickListener(this);
        campusImageView.setOnClickListener(this);
        campusTextView.setOnClickListener(this);

        concertCardView.setOnClickListener(this);
        concertLayout.setOnClickListener(this);
        concertImageView.setOnClickListener(this);
        concertTextView.setOnClickListener(this);

        scheduleCardView.setOnClickListener(this);
        scheduleLayout.setOnClickListener(this);
        scheduleImageView.setOnClickListener(this);
        scheduleTextView.setOnClickListener(this);

        chatCardView.setOnClickListener(this);
        chatLayout.setOnClickListener(this);
        chatImageView.setOnClickListener(this);
        chatTextView.setOnClickListener(this);

        registerCardView.setOnClickListener(this);
        registerLayout.setOnClickListener(this);
        registerImageView.setOnClickListener(this);
        registerTextView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    switch (view.getId())
    {
        case R.id.profileCardView:
        case R.id.profileLinearLayout:
        case R.id.profileImageView:
        case R.id.profileTextView:
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            startActivity(new Intent(getActivity(),Profile.class));
            break;
        case R.id.contactCardView:
        case R.id.contactLinearLayout:
        case R.id.contactImageView:
        case R.id.contactTextView:
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            startActivity(new Intent(getActivity(),ContactsActivity.class));
            break;
        case R.id.eventsCardView:
        case R.id.eventsLayout:
        case R.id.eventsImageView:
        case R.id.eventsTextView:
            startActivity(new Intent(getActivity(), EventsActivity.class).setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT));
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            break;
        case R.id.campusCardView:
        case R.id.campusLayout:
        case R.id.campusImageView:
        case R.id.campusTextView:
            //startActivity(new Intent(getActivity(),BrochureActivity.class));
            //getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            break;
        case R.id.concertCardView:
        case R.id.concertLayout:
        case R.id.concertImageView:
        case R.id.concertTextView:
            startActivity(new Intent(getActivity(),ConcertActivity.class));
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            break;
        case R.id.scheduleCardView:
        case R.id.scheduleLayout:
        case R.id.scheduleImageView:
        case R.id.scheduleTextView:
            startActivity(new Intent(getActivity(), Schedule.class));
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            break;


        case R.id.chatCardView:
        case R.id.chatLayout:
        case R.id.chatImageView:
        case R.id.chatTextView:
            startActivity(new Intent(getActivity(), forevtechnologies.alegriauiux.SendBird.MainActivity.class));
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            break;

        case R.id.registerCardView:
        case R.id.registerLayout:
        case R.id.registerImageView:
        case R.id.registerTextView:
            startActivity(new Intent(getActivity(),RegisterActivity.class));
            getActivity().overridePendingTransition(R.anim.scale_in,R.anim.scale_out);
            break;

    }
    }

}