package Training01;

class Mahasiswa{
    String nama;
    String NPM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception{
       //instansiasi / membuat object
       Mahasiswa mahasiswa1 = new Mahasiswa(); 
       mahasiswa1.nama = "bijix";
       mahasiswa1.NPM = "098764";
       mahasiswa1.jurusan = "teknik kematian";
       mahasiswa1.IPK = 9.9;
       mahasiswa1.umur = 18;

       System.out.println(mahasiswa1.nama);
       System.out.println(mahasiswa1.NPM);
       System.out.println(mahasiswa1.jurusan);
       System.out.println(mahasiswa1.IPK);
       System.out.println(mahasiswa1.umur); 
       
       Mahasiswa mahasiswa2 = new Mahasiswa(); 
       mahasiswa2.nama = "m2";
       mahasiswa2.NPM = "098764";
       mahasiswa2.jurusan = "teknik kematian";
       mahasiswa2.IPK = 9.9;
       mahasiswa2.umur = 18;

       System.out.println(mahasiswa2.nama);
       System.out.println(mahasiswa2.NPM);
       System.out.println(mahasiswa2.jurusan);
       System.out.println(mahasiswa2.IPK);
       System.out.println(mahasiswa2.umur);
    }
}