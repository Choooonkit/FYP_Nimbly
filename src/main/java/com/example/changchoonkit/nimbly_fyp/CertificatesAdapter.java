package com.example.changchoonkit.nimbly_fyp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;


/*
 * This part gets data into recyclerView*/

public class CertificatesAdapter extends FirestoreRecyclerAdapter<Certificates, CertificatesAdapter.CertificatesHolder> {

    public CertificatesAdapter(@NonNull FirestoreRecyclerOptions<Certificates> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull CertificatesHolder holder, int position, @NonNull Certificates model) {
        holder.textViewTitle.setText(model.getCertTitle());
    }

    @NonNull
    @Override
    public CertificatesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutlist_cert,
                parent, false);
        return new CertificatesHolder(v);
    }

    class CertificatesHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewDescription;
        TextView textViewPriority;

        public CertificatesHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.certTitle);
        }
    }
}

