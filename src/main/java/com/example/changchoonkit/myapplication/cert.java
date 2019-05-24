package com.example.changchoonkit.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class cert extends AppCompatActivity {

    RecyclerView recyclerView;
    CertificateAdapter adapter;

    List<Certificates> certificatesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cert);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Recycler view stuff
        certificatesList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        certificatesList.add(
                new Certificates(
                        "NASA Unlock Design",
                        "21-11-2018",
                        "Space App Challenege Finalist'"
                )
        );

        certificatesList.add(
                new Certificates(
                        "Taylor's University",
                        "21-11-2018",
                        "Dean's List Award Recepient"
                )
        );

        certificatesList.add(
                new Certificates(
                        "Taylor's University",
                        "21-11-2018",
                        "Bachelor of Software Engineering (HONS)'"
                )
        );

        certificatesList.add(
                new Certificates(
                        "Unlock Design",
                        "21-11-2018",
                        "ABCDE Data Science and Big Data Hackathon"
                )
        );

        adapter = new CertificateAdapter(this, certificatesList);
        recyclerView.setAdapter(adapter);

    }


    /*This makes the Action bar back button to behave the same way as hardware back button*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return false;
    }
}
