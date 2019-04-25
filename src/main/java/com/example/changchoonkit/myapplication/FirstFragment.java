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

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false );

        Button button_accountInformation = (Button) view.findViewById(R.id.button_accountInformation);
        Button button_recentActivities  = (Button) view.findViewById(R.id.button_recentActivities);

        button_accountInformation.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in_accInfo = new Intent(getActivity(), accInfo.class);
                startActivity(in_accInfo);
            }
        });

        button_recentActivities.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in_recAct = new Intent(getActivity(), recentActivities.class);
                startActivity(in_recAct);
            }
        });


        return view;
    }
}
