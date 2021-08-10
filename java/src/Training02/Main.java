package Training02;

//class dengan constructor
class Mahasiswa{
    //data member
    String nama;
    String NPM;
    String jurusan;
    //constructor di panggil saat object pertama kali di buat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    // }
    
    //constructor dengan parameter
    Mahasiswa(String nama, String NPM, String jurusan){
        this.nama = nama;
        this.NPM = NPM;
        this.jurusan = jurusan;        
    }
    // method tanpa return dan parameter
    void show(){
    System.out.println("Nama : " + this.nama);
    System.out.println("NPM : " + this.NPM);
    System.out.println("Jurusan : " + this.jurusan);
    System.out.println("\n");
    }
    // ==testing==
    // int penjumlahan(int a, int b){
    //     return a+b;
    // }
    // void showp(int mati){
    //     System.out.println(mati);
    // }
    // method dengan return dan tanpa parameter
    // ==testing==
    String ubahnama(String nama){
       return this.nama = nama;
    }
    // method dengan teyurn dan parameter
    String say(String massage){
        return massage + " juga nama saya adalah " + this.nama;
    }
}


public class Main {
    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("bajingan","kmkm","bijix");
        Mahasiswa mahasiswa2 = new Mahasiswa("tolol","kmkm","bijix");
        Mahasiswa mahasiswa3 = new Mahasiswa("gadungan","kmkm","bijix");
        // method
        mahasiswa1.show();
        mahasiswa2.show();
        mahasiswa3.show();
        mahasiswa3.ubahnama("babi");
        System.out.println(mahasiswa3.say("sialan"));
    

    }
}