package com.example.changchoonkit.myapplication;

/*
 *
 * Recycler.Adapter
 * RecyclerView.ViewHolde
 *
 *
 * */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CertificateAdapter extends RecyclerView.Adapter<CertificateAdapter.CertificateViewHolder> {

    private Context mCtx; //context object
    private List<Certificates> certificateList;

    public CertificateAdapter(Context mCtx, List<Certificates> certificateList) {
        this.mCtx = mCtx;
        this.certificateList = certificateList;
    }

    @NonNull
    @Override
    public CertificateViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layoutlist_cert, null); //secound parameter: parent to the view
        CertificateViewHolder holder = new CertificateViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CertificateViewHolder certificateViewHolder, int i) {

        //this is where you bind the data
        //i is position
        Certificates certificates = certificateList.get(i);

        certificateViewHolder.certTitle.setText(certificates.getCertTitle());
        certificateViewHolder.certIssuer.setText(certificates.getCertIssuer());
        certificateViewHolder.recevDate.setText(certificates.getRecevDate());
    }

    @Override
    public int getItemCount() {
        return certificateList.size();
    }

    class CertificateViewHolder extends RecyclerView.ViewHolder {


        //ui elements
        TextView certTitle, certIssuer, recevDate;

        public CertificateViewHolder(@NonNull View itemView) {
            super(itemView);

            certTitle = itemView.findViewById(R.id.certTitle);
            certIssuer = itemView.findViewById(R.id.certIssuer);
            recevDate = itemView.findViewById(R.id.recevDate);
        }
    }
}
