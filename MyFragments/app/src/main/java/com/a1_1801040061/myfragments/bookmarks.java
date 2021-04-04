package com.a1_1801040061.myfragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bookmarks extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bookmarks, container, false);

        CardView zing = view.findViewById(R.id.zing);
        CardView bluezone = view.findViewById(R.id.bluezone);
        CardView youtube = view.findViewById(R.id.youtube);
        CardView facebook = view.findViewById(R.id.facebook);

        Bundle link = new Bundle();
        FragmentManager manager = getFragmentManager();
        Fragment fragment = new web_view();

        zing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link.putString("URL", "https://zingmp3.vn/");
                fragment.setArguments(link);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Zing MP3")
                        .commit();
            }
        });

        bluezone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link.putString("URL", "https://bluezone.gov.vn/");
                fragment.setArguments(link);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("Blue zone")
                        .commit();
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link.putString("URL", "https://www.youtube.com/");
                fragment.setArguments(link);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("youtube")
                        .commit();
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link.putString("URL", "https://www.facebook.com/");
                fragment.setArguments(link);
                manager.beginTransaction()
                        .replace(R.id.fragmentContainer, fragment)
                        .addToBackStack("facebook")
                        .commit();
            }
        });

        return view;
    }
}