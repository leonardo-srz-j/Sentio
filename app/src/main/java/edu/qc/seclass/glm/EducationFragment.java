package edu.qc.seclass.glm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class EducationFragment extends Fragment{
    /**
     * Every time we create a new instance of this class we are calling
     * the onCreateView method
     * From my understanding, the returned inflater populates the layout with
     * the objects we created for it, somewhat of an onCreate method for the fragment
     * This is needed because we are not creating a new activity
     * Creating new activities makes your app slower
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */

    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.fragment_education, container, false);
        context = rootView.getContext(); // Assign your rootView to context

        ImageButton moodDisorderBtn = rootView.findViewById(R.id.mood_disorder_btn);
        public void Mood(View view){
            Intent i = new Intent(this, MainActivity9.class);
            startActivity(i);
        }

        Button **yourButton** = (Button) rootView.findViewById(R.id.**your_button_id**);
            **yourButton**.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Pass the context and the Activity class you need to open from the Fragment Class, to the Intent
                Intent intent = new Intent(context, **YourActivityClass**.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}




        /*
        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.fragment_education,container,false);
        context = rootView.getContext(); // Assign your rootView to context
        return rootView;
    }

    public void MoodDisorder(View view) {
        Intent n = new Intent(context, MoodActivity.class);
        startActivity(n);
    }
    public void Anxiety(View view){
        Intent n = new Intent(context, AnxietyActivity.class);
        startActivity(n);
    }
    public void Autism(View view){
        Intent m = new Intent(context, AutismActivity.class);
        startActivity(m);
    }
}*/
