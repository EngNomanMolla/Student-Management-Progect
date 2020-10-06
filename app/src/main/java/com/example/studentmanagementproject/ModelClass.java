package com.example.studentmanagementproject;

public class ModelClass {
    int Id;

     public ModelClass(){}

    public ModelClass(int id, String semester, String technology, String name, String roll, String regestation, String classGroup, String phoneNumber, String bloodGroup, String religion, String nationality, String email, String gender, String fatherName, String fatherNumber, String motherName, String motherNumber, String firstSemester, String secondSemester, String thirdSemester, String fourthSemester, String fifthSemester, String sixthSemester, String seventhSemester, String eightSemester) {
        Id = id;
        Semester = semester;
        Technology = technology;
        Name = name;
        Roll = roll;
        Regestation = regestation;
        ClassGroup = classGroup;
        PhoneNumber = phoneNumber;
        BloodGroup = bloodGroup;
        Religion = religion;
        Nationality = nationality;
        Email = email;
        Gender = gender;
        FatherName = fatherName;
        FatherNumber = fatherNumber;
        MotherName = motherName;
        MotherNumber = motherNumber;
        FirstSemester = firstSemester;
        SecondSemester = secondSemester;
        ThirdSemester = thirdSemester;
        FourthSemester = fourthSemester;
        FifthSemester = fifthSemester;
        SixthSemester = sixthSemester;
        SeventhSemester = seventhSemester;
        EightSemester = eightSemester;
    }

    String Semester,Technology,Name,Roll,Regestation,ClassGroup,PhoneNumber,BloodGroup,Religion,Nationality,Email,Gender,FatherName,FatherNumber,MotherName,MotherNumber,FirstSemester,SecondSemester,ThirdSemester,FourthSemester,FifthSemester,SixthSemester,SeventhSemester,EightSemester;

    public ModelClass(String semester, String technology, String name, String roll, String regestation, String classGroup, String phoneNumber, String bloodGroup, String religion, String nationality, String email, String gender, String fatherName, String fatherNumber, String motherName, String motherNumber, String firstSemester, String secondSemester, String thirdSemester, String fourthSemester, String fifthSemester, String sixthSemester, String seventhSemester, String eightSemester) {
        Semester = semester;
        Technology = technology;
        Name = name;
        Roll = roll;
        Regestation = regestation;
        ClassGroup = classGroup;
        PhoneNumber = phoneNumber;
        BloodGroup = bloodGroup;
        Religion = religion;
        Nationality = nationality;
        Email = email;
        Gender = gender;
        FatherName = fatherName;
        FatherNumber = fatherNumber;
        MotherName = motherName;
        MotherNumber = motherNumber;
        FirstSemester = firstSemester;
        SecondSemester = secondSemester;
        ThirdSemester = thirdSemester;
        FourthSemester = fourthSemester;
        FifthSemester = fifthSemester;
        SixthSemester = sixthSemester;
        SeventhSemester = seventhSemester;
        EightSemester = eightSemester;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getTechnology() {
        return Technology;
    }

    public void setTechnology(String technology) {
        Technology = technology;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public String getRegestation() {
        return Regestation;
    }

    public void setRegestation(String regestation) {
        Regestation = regestation;
    }

    public String getClassGroup() {
        return ClassGroup;
    }

    public void setClassGroup(String classGroup) {
        ClassGroup = classGroup;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getFatherNumber() {
        return FatherNumber;
    }

    public void setFatherNumber(String fatherNumber) {
        FatherNumber = fatherNumber;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public String getMotherNumber() {
        return MotherNumber;
    }

    public void setMotherNumber(String motherNumber) {
        MotherNumber = motherNumber;
    }

    public String getFirstSemester() {
        return FirstSemester;
    }

    public void setFirstSemester(String firstSemester) {
        FirstSemester = firstSemester;
    }

    public String getSecondSemester() {
        return SecondSemester;
    }

    public void setSecondSemester(String secondSemester) {
        SecondSemester = secondSemester;
    }

    public String getThirdSemester() {
        return ThirdSemester;
    }

    public void setThirdSemester(String thirdSemester) {
        ThirdSemester = thirdSemester;
    }

    public String getFourthSemester() {
        return FourthSemester;
    }

    public void setFourthSemester(String fourthSemester) {
        FourthSemester = fourthSemester;
    }

    public String getFifthSemester() {
        return FifthSemester;
    }

    public void setFifthSemester(String fifthSemester) {
        FifthSemester = fifthSemester;
    }

    public String getSixthSemester() {
        return SixthSemester;
    }

    public void setSixthSemester(String sixthSemester) {
        SixthSemester = sixthSemester;
    }

    public String getSeventhSemester() {
        return SeventhSemester;
    }

    public void setSeventhSemester(String seventhSemester) {
        SeventhSemester = seventhSemester;
    }

    public String getEightSemester() {
        return EightSemester;
    }

    public void setEightSemester(String eightSemester) {
        EightSemester = eightSemester;
    }
}
