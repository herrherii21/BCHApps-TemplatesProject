package com.example.bchapps.Domain;

//Nama        : Heri ;
//NIM         : 10121914 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;
//Selesai     : 11 Agustus 2024. 14:00 ;

public class Location {
    private int Id;
    private String Loc;

    public Location() {
    }

    @Override
    public String toString() {
        return Loc;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getLoc() {
        return Loc;
    }

    public void setLoc(String loc) {
        Loc = loc;
    }
}
