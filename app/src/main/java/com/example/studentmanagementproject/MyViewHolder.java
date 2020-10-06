package com.example.studentmanagementproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView nameTextView,rollTextView,regTextView;
    CardView cardView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
      nameTextView=  itemView.findViewById(R.id.nameTextViewId);
     rollTextView=   itemView.findViewById(R.id.rollTextViewId);
       regTextView= itemView.findViewById(R.id.regTextViewId);
       cardView=itemView.findViewById(R.id.viewSampleCardViewId);

    }
}
