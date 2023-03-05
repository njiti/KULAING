package com.example.testkula.User;

import android.os.Bundle;

import androidx.constraintlayout.helper.widget.Carousel;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.testkula.R;
import com.example.testkula.databinding.FragmentHomeBinding;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        ImageCarousel carousel = v.findViewById(R.id.carousel);

        //List to store carousel images
        ArrayList<CarouselItem> clist = new ArrayList<>();
        clist.add(new CarouselItem(
                "https://images.pexels.com/photos/5589943/pexels-photo-5589943.jpeg?auto=compress&cs=tinysrgb&w=600",
                "random pictures should appear"
        ));

        clist.add(new CarouselItem(
                "https://images.pexels.com/photos/2097090/pexels-photo-2097090.jpeg?auto=compress&cs=tinysrgb&w=600",
                "random pictures should appear"
        ));

        clist.add(new CarouselItem(
                "https://images.pexels.com/photos/323682/pexels-photo-323682.jpeg?auto=compress&cs=tinysrgb&w=600",
                "random pictures should appear"
        ));

        carousel.setData(clist);

        return v;

    }
}