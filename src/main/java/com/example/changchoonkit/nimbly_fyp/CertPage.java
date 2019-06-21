package com.example.changchoonkit.nimbly_fyp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class CertPage extends AppCompatActivity {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference certRef = db.collection("0331184");

    private CertificatesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cert_page);

        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        Query query = certRef;

        FirestoreRecyclerOptions<Certificates> options = new FirestoreRecyclerOptions.Builder<Certificates>()
                .setQuery(query, Certificates.class)
                .build();

        adapter = new CertificatesAdapter(options);

        RecyclerView recyclerView = findViewById(R.id.recyclerview_cert);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
