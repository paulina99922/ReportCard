package com.example.android.reportcard;

public class ReportCard {

    private String cStudentName;
    private String cStudentSurname;
    private String cBirthDate;
    private int sEnglish;
    private int sFrench;
    private int sSpanish;
    private int sMaths;
    private int sIT;

    public ReportCard(String studentName, String studentSurname, String birthDate, int englishMark,
                      int frenchMark, int spanishMark, int mathsMark, int itMark) {
        cStudentName = studentName;
        cStudentSurname = studentSurname;
        cBirthDate = birthDate;
        sEnglish = englishMark;
        sFrench = frenchMark;
        sSpanish = spanishMark;
        sMaths = mathsMark;
        sIT = itMark;
    }

    public String showStudentName() {
        return cStudentName;
    }

    public void setStudentName(String studentName) {
        cStudentName = studentName;
    }

    public String showStudentSurname() {
        return cStudentSurname;
    }

    public void setStudentSurname(String studentSurname) {cStudentSurname = studentSurname;}

    public String showBirthDate() {
        return cBirthDate;
    }

    public void setBirthDate(String birthDate) {
        cBirthDate = birthDate;
    }

    public int showEnglishMark() {
        return sEnglish;
    }

    public void setEnglishMark(int englishMark) {
        sEnglish = englishMark;
    }

    public int showFrenchMark() {
        return sFrench;
    }

    public void setFrenchMark(int frenchMark) {
    sFrench=frenchMark;
    }

    public int showSpanishMark() {
        return sSpanish;
    }

    public void setSpanishMark(int spanishMark) {
        sSpanish=spanishMark;
    }

    public int showMathsMark() {
        return sMaths;
    }

    public void setMathsMark(int mathsMark) {
        sMaths=mathsMark;
    }

    public int showItMark() {
        return sIT;
    }

    public void setItMark(int ithMark) {
        sIT=ithMark;
    }

    @Override
    public String toString() {
        return "REPORT CARD" + "\nName: " + showStudentName() + "\nSurname: " + showStudentSurname()
                + "\nDate of birth: " + showBirthDate() + "\nEnglish: " + showEnglishMark() +
                "\nFrench: " + showFrenchMark() + "\nSpanish: " + showSpanishMark() + "\nMaths: " +
                showMathsMark() + "\nIT: " + showItMark();
    }

}
