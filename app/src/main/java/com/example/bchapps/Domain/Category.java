package com.example.bchapps.Domain;

//Nama        : Heri ;
//NIM         : 10121914 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan S.Kom., M.Kom. ;
//Selesai     : 11 Agustus 2024. 14:00 ;

public class Category {
    private int Id;
    private String ImagePath;
    private String Name;

    public Category() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
