public class MilKilometreTablosu {
    public static void main(String[] args) {
        //Önce mili kilometre olarak tanımlayalım
        double mil=  1.609;
        //Şimdi ise tablo başlığını halledelim
        System.out.println("Mil - Kilometre Tablosu:");
        System.out.println("------------------------");
        //Bizden istendiği şekilde 1,5,10,20 ve 50 mili hesaplamak için uygun kodları yazalım.
        double mil1= 1*1.609;
        System.out.println("1      " + mil1);
        double mil2= 5*1.609;
        System.out.println("5      " + mil2);
        double mil3= 10*1.609;
        System.out.println("10     " + mil3);
        double mil4= 20*1.609;
        System.out.println("20     " + mil4);
        double mil5= 50*1.609;
        System.out.println("50     " + mil5);
    }
}
