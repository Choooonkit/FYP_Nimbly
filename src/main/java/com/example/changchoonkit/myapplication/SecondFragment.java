package com.example.changchoonkit.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false );

        /*This makes the Action bar back button to behave the same way as hardware back button*/
        setHasOptionsMenu(true);

        Button button_cert = (Button) view.findViewById(R.id.button_cert);
        Button button_qrscan  = (Button) view.findViewById(R.id.button_qrscan);

        button_cert.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in_cert = new Intent(getActivity(), cert.class);
                startActivity(in_cert);
            }
        });

        button_qrscan.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in_qrscan = new Intent(getActivity(), qrscan.class);
                startActivity(in_qrscan);
            }
        });


        return view;
    }

}
