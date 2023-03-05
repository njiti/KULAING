package com.example.testkula.User;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.testkula.R;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

public class BasketFragment extends Fragment {

    CardView food;
    ImageView plus, add;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_basket, container, false);

        food = v.findViewById(R.id.food);
        plus = v.findViewById(R.id.plus);



        food.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                plus.setImageResource(R.drawable.baseline_done);
            }
        });

        return v;
    }
}