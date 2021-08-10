package Training03;

class buku{
    String judul;
    String penulis;

    buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void show(){
        System.out.println("\nJudul\t : " + this.judul);
        System.out.println("Penulis\t : " + this.penulis);
    }

}

public class Main {
    public static void main(String[] args) {
        buku buku1 = new buku("3 babi","bijiku");
        buku1.show();
        
        // menampilkan address
        String addressbuku1 = Integer.toString(System.identityHashCode(buku1));
        System.out.println(addressbuku1);
        
        // assigment object
        buku buku2 = new buku("3 babi","bijiku");
        buku2.show();
        String addressbuku2 = Integer.toString(System.identityHashCode(buku2));
        System.out.println(addressbuku2);
        buku1.judul = "matilah kau";
        buku1.show();
        buku2.show();
    }
}