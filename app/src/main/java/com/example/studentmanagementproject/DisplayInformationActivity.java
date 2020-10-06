package com.example.studentmanagementproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class DisplayInformationActivity extends AppCompatActivity {
    CheckBox checkBox;
    TextView NameTextView,RollTextView,RegTextView,SemTextView,TechnologyTextView,ClassGroupTextView,BloodGroupTextView,ReligionTextView,
            NationalityTextView,EmailTextView,GenderTextView,PhoneTextView,FatherNameTextView,FatherNumberTextView,MotherNameTextView,MotherNumberTextView,FirstSemTextView,SecondSemTextView,ThirdSemTextView,FourthSemTextView,FifthSemTextView,SixthSemTextView,SevenSemTextView,EightSemTextView;
    BarChart pieChart;
    float FirstResult,SecondResult,ThirdResult,FourthdResult,FifthResult,SixthResult,SevendResult,EightdResult;
    float TotalResult;
    float first,second,third,fourth,fifth,sixth,seven,eight;
    TextView countTextView,totalresultTextView;
    ImageView studentCallImageView,studentMessageImageView,fatherCallImageView,fatherMessageImageView,motherCallImageView,motherMessageImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);
        pieChart=findViewById(R.id.chartId);
        NameTextView=findViewById(R.id.studentnameTextviewId);
        RollTextView=findViewById(R.id.studentrollTextviewId);
        RegTextView=findViewById(R.id.studentregTextviewId);
        SemTextView=findViewById(R.id.semesterTextviewId);
        TechnologyTextView=findViewById(R.id.technologyTextviewId);
        ClassGroupTextView=findViewById(R.id.classgroupTextviewId);
        BloodGroupTextView=findViewById(R.id.bloodgroupTextviewId);
        ReligionTextView=findViewById(R.id.religionTextviewId);
        NationalityTextView=findViewById(R.id.nationalityTextviewId);
        EmailTextView=findViewById(R.id.emailTextviewId);
        GenderTextView=findViewById(R.id.genderTextviewId);
        PhoneTextView=findViewById(R.id.numberTextViewId);
        studentCallImageView=findViewById(R.id.studentCallImageViewId);
        studentMessageImageView=findViewById(R.id.studentMessageImageViewId);
        FatherNameTextView=findViewById(R.id.fatherTextViewId);
        FatherNumberTextView=findViewById(R.id.fatherNumberTextViewId);
        fatherCallImageView=findViewById(R.id.fatherCallImageViewId);
        fatherMessageImageView=findViewById(R.id.fatherMessageImageViewId);
        MotherNameTextView=findViewById(R.id.motherNameTextViewId);
        MotherNumberTextView=findViewById(R.id.motherNumberTextViewId);
        motherCallImageView=findViewById(R.id.motherCallImageViewId);
        motherMessageImageView=findViewById(R.id.motherMessageImageViewId);
        FirstSemTextView=findViewById(R.id.firstSemTextViewId);
        SecondSemTextView=findViewById(R.id.secondSemTextViewId);
        ThirdSemTextView=findViewById(R.id.thirdSemTextViewId);
        FourthSemTextView=findViewById(R.id.fourthSemTextViewId);
        FifthSemTextView=findViewById(R.id.fifthSemTextViewId);
        SixthSemTextView=findViewById(R.id.sixthSemTextViewId);
        SevenSemTextView=findViewById(R.id.sevenSemTextViewId);
        EightSemTextView=findViewById(R.id.eightSemTextViewId);
        countTextView=findViewById(R.id.countTextViewId);
        countTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float totalResult=FirstResult+SecondResult+ThirdResult+FourthdResult+FifthResult+SixthResult+SevendResult+EightdResult;
                String total=String.format("%.02f",totalResult);
                countTextView.setText(total);
            }
        });

        if(Build.VERSION.SDK_INT>=21){
            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.statusbarcolor));
        }
        Intent intent=getIntent();

        String Semester=intent.getStringExtra("semester");
        String Technology=intent.getStringExtra("technology");
        String Name=intent.getStringExtra("name");
        String Roll=intent.getStringExtra("roll");
        String Reg=intent.getStringExtra("reg");
        String Classgroup=intent.getStringExtra("classgroup");
        final String Phone=intent.getStringExtra("phone");
        String Bloodgroup=intent.getStringExtra("bloodgroup");
        String Religion=intent.getStringExtra("religion");
        String Nationality=intent.getStringExtra("nationality");
        String Email=intent.getStringExtra("email");
        String Gender=intent.getStringExtra("gender");
        String Fname=intent.getStringExtra("fathername");
        final String Fnumber=intent.getStringExtra("fathernumber");
        String Mname=intent.getStringExtra("mothername");
       final String Mnumber=intent.getStringExtra("mothernumber");
        final String Firstsem=intent.getStringExtra("firstsem");
        final String Secondsem=intent.getStringExtra("secondsem");
        final String Thirdsem=intent.getStringExtra("thirdsem");
        final String Fourthsem=intent.getStringExtra("fourthsem");
        final String Fifthsem=intent.getStringExtra("fifthsem");
        final String Sixthsem=intent.getStringExtra("sixthsem");
        final String Sevensem=intent.getStringExtra("sevensem");
        final String Eightsem=intent.getStringExtra("eightsem");
        studentCallImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String number=Phone;
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });
        studentMessageImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                String number = Phone;
                intent.setData(Uri.parse("sms:" + number));
                startActivity(intent);
            }
        });

        NameTextView.setText(Name);
        RollTextView.setText(Roll);
        RegTextView.setText(Reg);
        SemTextView.setText(Semester);
        TechnologyTextView.setText(Technology);
        ClassGroupTextView.setText(Classgroup);
        BloodGroupTextView.setText(Bloodgroup);
        ReligionTextView.setText(Religion);
        NationalityTextView.setText(Nationality);
        EmailTextView.setText(Email);
        GenderTextView.setText(Gender);
        PhoneTextView.setText(Phone);
        FatherNameTextView.setText(Fname);
        FatherNumberTextView.setText("+880 017XXXXXXX");
        MotherNumberTextView.setText("+880 017XXXXXXX");
        if(Fnumber!=null && !Fnumber.isEmpty() && !Fnumber.equals("null")){
            FatherNumberTextView.setText(Fnumber);
            fatherCallImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    String number=Fnumber;
                    intent.setData(Uri.parse("tel:" + number));
                    startActivity(intent);
                }
            });
            fatherMessageImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    String number = Fnumber;
                    intent.setData(Uri.parse("sms:" + number));
                    startActivity(intent);
                }
            });
        }
        if(Mnumber!=null && !Mnumber.isEmpty() && !Mnumber.equals("null")){
            MotherNumberTextView.setText(Mnumber);
            motherCallImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    String number=Mnumber;
                    intent.setData(Uri.parse("tel:" + number));
                    startActivity(intent);
                }
            });
            motherMessageImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    String number = Mnumber;
                    intent.setData(Uri.parse("sms:" + number));
                    startActivity(intent);
                }
            });
        }
        MotherNameTextView.setText(Mname);

     if(Firstsem!=null && !Firstsem.isEmpty() && !Firstsem.equals("null")){
         FirstSemTextView.setText(Firstsem);
        float  firstResult= Float.parseFloat(Firstsem);
        first=firstResult;
        FirstResult= (firstResult/100)*5;

     }
        if(Secondsem!=null && !Secondsem.isEmpty() && !Secondsem.equals("null")){
            SecondSemTextView.setText(Secondsem);
          float  secondResult= Float.parseFloat(Secondsem);
          second=secondResult;
            SecondResult= (secondResult/100)*5;
        }
        if(Thirdsem!=null && !Thirdsem.isEmpty() && !Thirdsem.equals("null")){
            ThirdSemTextView.setText(Thirdsem);
            float thirdResult= Float.parseFloat(Thirdsem);
            third=thirdResult;
            ThirdResult= (thirdResult/100)*5;
        }
        if(Fourthsem!=null && !Fourthsem.isEmpty() && !Fourthsem.equals("null")){
            FourthSemTextView.setText(Fourthsem);
         float   fourthdResult= Float.parseFloat(Fourthsem);
         fourth=fourthdResult;
            FourthdResult= (fourthdResult/100)*10;
        }
        if(Fifthsem!=null && !Fifthsem.isEmpty() && !Fifthsem.equals("null")){
            FifthSemTextView.setText(Fifthsem);
         float fifthResult= Float.parseFloat(Fifthsem);
         fifth=fifthResult;
         FifthResult=(fifthResult/100)*15;
        }
        if(Sixthsem!=null && !Sixthsem.isEmpty() && !Sixthsem.equals("null")){
            SixthSemTextView.setText(Sixthsem);
          float  sixthResult= Float.parseFloat(Sixthsem);
          sixth=sixthResult;
          SixthResult=(sixthResult/100)*20;
        }
        if(Sevensem!=null && !Sevensem.isEmpty() && !Sevensem.equals("null")){
            SevenSemTextView.setText(Sevensem);
          float  sevendResult= Float.parseFloat(Sevensem);
          seven=sevendResult;
            SevendResult=(sevendResult/100)*25;
        }

        if(Eightsem!=null && !Eightsem.isEmpty() && !Eightsem.equals("null")){
            EightSemTextView.setText(Eightsem);
           float eightdResult= Float.parseFloat(Eightsem);
           eight=eightdResult;
           EightdResult=(eightdResult/100*15);
        }


        checkBox=findViewById(R.id.cheakBoxId);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    pieChart.setVisibility(View.VISIBLE);
                    pieChart.getDescription().setEnabled(false);
                    ArrayList<BarEntry> arrayList=new ArrayList<>();

                    arrayList.add(new BarEntry(0,first));
                    arrayList.add(new BarEntry(1,second));
                    arrayList.add(new BarEntry(2,third));
                    arrayList.add(new BarEntry(3,fourth));
                    arrayList.add(new BarEntry(4,fifth));
                    arrayList.add(new BarEntry(5,sixth,"Six"));
                    arrayList.add(new BarEntry(6,seven));
                    arrayList.add(new BarEntry(7,eight));

                    BarDataSet set=new BarDataSet(arrayList,"");
                    set.setColors(ColorTemplate.JOYFUL_COLORS);
                    //set.setColors(ColorTemplate.MATERIAL_COLORS);
                    set.setDrawValues(true);
                    BarData data=new BarData(set);
                    pieChart.setData(data);
                    pieChart.invalidate();
                    pieChart.animateY(5000);

                    pieChart.setFitBars(true);
                }
                else {
                    pieChart.setVisibility(View.GONE);
                }

            }
        });

    }



}
