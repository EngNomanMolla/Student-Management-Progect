package com.example.studentmanagementproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<ModelClass> arrayList;
    BottomSheetDialog bottomSheetDialog;
  public   LinearLayout updateLinearLayout,deleteLinearLayout;
 DatabaseHelper databaseHelper=new DatabaseHelper(context);

    public MyCustomAdapter(Context context, List<ModelClass> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclesample,parent,false);
        MyViewHolder myViewHolder= new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final   String seme=arrayList.get(position).getSemester();

        holder.cardView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                View view=LayoutInflater.from(context).inflate(R.layout.buttom_sheet_dialoge,null);
                updateLinearLayout=view.findViewById(R.id.updateLinierId);
                updateLinearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                deleteLinearLayout=view.findViewById(R.id.deleteLayoutId);

                deleteLinearLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int Id=arrayList.get(position).getId();
                        Toast.makeText(context, ""+Id, Toast.LENGTH_SHORT).show();
                        databaseHelper.deleteData(Id);

                    }
                });
                bottomSheetDialog=new BottomSheetDialog(context);
                bottomSheetDialog.setContentView(view);
                bottomSheetDialog.show();

                return true;
            }

        });

        final String sem=arrayList.get(position).getSemester();
        final String technology=arrayList.get(position).getTechnology();
        final String name=arrayList.get(position).getName();
        final String roll=arrayList.get(position).getRoll();
        final String reg=arrayList.get(position).getRegestation();
        final String classgroup=arrayList.get(position).getClassGroup();
        final String phone=arrayList.get(position).getPhoneNumber();
        final String bloodgroup=arrayList.get(position).getBloodGroup();
        final String religion=arrayList.get(position).getReligion();
        final String nationality=arrayList.get(position).getNationality();
        final String email=arrayList.get(position).getEmail();
        final String gender=arrayList.get(position).getGender();
        final String fathername=arrayList.get(position).getFatherName();
        final String fathernumber=arrayList.get(position).getFatherNumber();
        final String mothername=arrayList.get(position).getMotherName();
        final String mothernumber=arrayList.get(position).getMotherNumber();
        final String firstsem=arrayList.get(position).getFirstSemester();
        final String secondsem=arrayList.get(position).getSecondSemester();
        final String thirdsem=arrayList.get(position).getThirdSemester();
        final String fourthsem=arrayList.get(position).getFourthSemester();
        final String fifthsem=arrayList.get(position).getFifthSemester();
        final String sixthsem=arrayList.get(position).getSixthSemester();
        final String sevensem=arrayList.get(position).getSeventhSemester();
        final String eightsem=arrayList.get(position).getEightSemester();


      final  int pos=position;
      holder.nameTextView.setText(arrayList.get(position).getName());
      holder.rollTextView.setText(arrayList.get(position).getRoll());
        holder.regTextView.setText(arrayList.get(position).getRegestation());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DisplayInformationActivity.class);
                intent.putExtra("semester",sem);
                intent.putExtra("technology",technology);
                intent.putExtra("name",name);
                intent.putExtra("roll",roll);
                intent.putExtra("reg",reg);
                intent.putExtra("classgroup",classgroup);
                intent.putExtra("phone",phone);
                intent.putExtra("bloodgroup",bloodgroup);
                intent.putExtra("religion",religion);
                intent.putExtra("nationality",nationality);
                intent.putExtra("email",email);
                intent.putExtra("gender",gender);
                intent.putExtra("fathername",fathername);
                intent.putExtra("fathernumber",fathernumber);
                intent.putExtra("mothername",mothername);
                intent.putExtra("mothernumber",mothernumber);
                intent.putExtra("firstsem",firstsem);
                intent.putExtra("secondsem",secondsem);
                intent.putExtra("thirdsem",thirdsem);
                intent.putExtra("fourthsem",fourthsem);
                intent.putExtra("fifthsem",fifthsem);
                intent.putExtra("sixthsem",sixthsem);
                intent.putExtra("sevensem",sevensem);
                intent.putExtra("eightsem",eightsem);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
