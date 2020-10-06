package com.example.studentmanagementproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistationActivity extends AppCompatActivity {
    Spinner registerSpinner;
    String mSemester,mTechnology;
    RadioButton technologyRadioButton;
    Button mButton,eraserButton,viewButton;
    // Student Informaton Variable
    EditText nameEditText,rollEditText,regestationEditText,classGroupEditText,phoneNumberEditText,bloodGroupEditText,religionEditText,nationalityEditText,emailEditText;
    //Gurdian Information Variable
    EditText fatherNameEditText,fatherNumberEditText,motherNameEditText,motherNumberEditText;

    //Result Information Variable
    EditText firstSemesterEditText,secondSemesterEditText,thirdSemesterEditText,fourthSemesterEditText,fifthSemesterEditText,sixSemesterEditText,sevenSemesterEditText,eightSemesterEditText;

    RadioGroup radioGroup;
    RadioButton radioButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation);

        technologyRadioButton=findViewById(R.id.registerRadioButtonId);
        registerSpinner=findViewById(R.id.registerSpinnerId);
        mButton=findViewById(R.id.saveButtonId);
        nameEditText=findViewById(R.id.nameEditTextId);
        rollEditText=findViewById(R.id.rollEditTextId);
        regestationEditText=findViewById(R.id.regEditTextId);
        classGroupEditText=findViewById(R.id.classGroupEditTextId);
        phoneNumberEditText=findViewById(R.id.numberEditTextId);
        bloodGroupEditText=findViewById(R.id.bloodGroupEditTextId);
        religionEditText=findViewById(R.id.religionEditTextId);
        nationalityEditText=findViewById(R.id.nationalityEditTextId);
        emailEditText=findViewById(R.id.emailEditTextId);
        radioGroup=findViewById(R.id.radioGroupId);
        fatherNameEditText=findViewById(R.id.fatherEditTextId);
        fatherNumberEditText=findViewById(R.id.fatherNumberEditTextId);
        motherNameEditText=findViewById(R.id.motherEditTextId);
        motherNumberEditText=findViewById(R.id.motherNumberEditTextId);


        firstSemesterEditText=findViewById(R.id.firstSemEditTextId);
        secondSemesterEditText=findViewById(R.id.secondSemEditTextId);
        thirdSemesterEditText=findViewById(R.id.thirdSemEditTextId);
        fourthSemesterEditText=findViewById(R.id.fourthSemEditTextId);
        fifthSemesterEditText=findViewById(R.id.fifthSemEditTextId);
        sixSemesterEditText=findViewById(R.id.sixSemEditTextId);
        sevenSemesterEditText=findViewById(R.id.sevenSemEditTextId);
        eightSemesterEditText=findViewById(R.id.eightSemEditTextId);
        eraserButton=findViewById(R.id.eraserButtonId);
        viewButton=findViewById(R.id.viewButtonId);



        if(Build.VERSION.SDK_INT>=21){
            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.statusbarcolor));
        }

        // Start Spinner Part

        ArrayAdapter<CharSequence> arrayAdapter2=ArrayAdapter.createFromResource(this,R.array.semester,android.R.layout.simple_spinner_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        registerSpinner.setAdapter(arrayAdapter2);
        registerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==1){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==2){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==3){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==4){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==5){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==6){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==7){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                else if(id==8){
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // End Spinner Part



        mButton.setOnClickListener(new View.OnClickListener() {
            String Semester;
            String Technology,Name,Roll,Regestation,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender;
            String FatherName,FatherNumber,MotherName,MotherNumber;
            String FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem;
            @Override
            public void onClick(View v) {
                Semester=mSemester;
                Technology=technologyRadioButton.getText().toString();
                Name=nameEditText.getText().toString().trim();
                Roll=rollEditText.getText().toString().trim();
                Regestation=regestationEditText.getText().toString().trim();
                ClassGroup=classGroupEditText.getText().toString().trim();
                PhoneNumber=phoneNumberEditText.getText().toString().trim();
                BloodGroup=bloodGroupEditText.getText().toString().trim();
                Religion=religionEditText.getText().toString().trim();
                Nationality=nationalityEditText.getText().toString().trim();
                Email=emailEditText.getText().toString().trim();
                Name=nameEditText.getText().toString().trim();
                int radioId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(radioId);
                Gender= radioButton.getText().toString();



                FatherName=fatherNameEditText.getText().toString().trim();
                FatherNumber=fatherNumberEditText.getText().toString().trim();
                MotherName=motherNameEditText.getText().toString().trim();
                MotherNumber=motherNumberEditText.getText().toString().trim();

                FirstSem=firstSemesterEditText.getText().toString().trim();
                SecondSem=secondSemesterEditText.getText().toString().trim();
                ThirdSem=thirdSemesterEditText.getText().toString().trim();
                FourthSem=fourthSemesterEditText.getText().toString().trim();
                FifthSem=fifthSemesterEditText.getText().toString().trim();
                SixthSem=sixSemesterEditText.getText().toString().trim();
                SevenSem=sevenSemesterEditText.getText().toString().trim();
                EightSem=eightSemesterEditText.getText().toString().trim();

                if(Semester.contains("Select One")){
                    Toast.makeText(RegistationActivity.this, "Please Select Semester", Toast.LENGTH_SHORT).show();
                    return;

                }

                if(Name.isEmpty()){
                    nameEditText.setError("Empty Field");
                    return;

                }

               if(Roll.isEmpty()){
                    rollEditText.setError("Empty Field");
                    return;
                }
                if(Regestation.isEmpty()){
                    regestationEditText.setError("Empty Field");
                    return;
                }
                if(ClassGroup.isEmpty()){
                    classGroupEditText.setError("Empty Field");
                    return;
                }
                if(PhoneNumber.isEmpty()){
                    phoneNumberEditText.setError("Empty Field");
                    return;
                }

                if(Religion.isEmpty()){
                    religionEditText.setError("Empty Field");
                    return;
                }
                if(Nationality.isEmpty()){
                    nationalityEditText.setError("Empty Field");
                    return;
                }
                if(FatherName.isEmpty()){
                    fatherNumberEditText.setError("Empty Field");
                    return;
                }
                if(MotherName.isEmpty()){
                    motherNameEditText.setError("Empty Field");
                    return;
                }


              if(mSemester.contains("1st")){
                  DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
               long id=   databaseHelper.InsertFirstSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                  ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                          MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
               if(id!=-1){
                   Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
               }
              }

                if(mSemester.contains("2nd")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertSecondSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }

                if(mSemester.contains("3rd")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertThirdSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }

                if(mSemester.contains("4th")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertFourthSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }

                if(mSemester.contains("5th")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertFifthSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }

                if(mSemester.contains("6th")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertSixthSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }

                if(mSemester.contains("7th")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertSevenSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }
                if(mSemester.contains("8th")){
                    DatabaseHelper databaseHelper=new DatabaseHelper(RegistationActivity.this);
                    long id=   databaseHelper.InsertEightSemesterData(new ModelClass(Semester,Technology,Name,Roll,Regestation
                            ,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,
                            MotherNumber,FirstSem,SecondSem,ThirdSem,FourthSem,FifthSem,SixthSem,SevenSem,EightSem));
                    if(id!=-1){
                        Toast.makeText(RegistationActivity.this, "Insert Sucess", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        eraserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameEditText.setText("");
                rollEditText.setText("");
                regestationEditText.setText("");
                classGroupEditText.setText("");
                phoneNumberEditText.setText("");
                bloodGroupEditText.setText("");
                religionEditText.setText("");
                nationalityEditText.setText("");
                emailEditText.setText("");
                fatherNameEditText.setText("");
                fatherNumberEditText.setText("");
                motherNameEditText.setText("");
                motherNumberEditText.setText("");
                firstSemesterEditText.setText("");
                secondSemesterEditText.setText("");
                thirdSemesterEditText.setText("");
                fourthSemesterEditText.setText("");
                fifthSemesterEditText.setText("");
                sixSemesterEditText.setText("");
                eightSemesterEditText.setText("");

            }
        });
       viewButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(RegistationActivity.this, ViewActivity.class);
               startActivity(intent);
           }
       });
    }

}
