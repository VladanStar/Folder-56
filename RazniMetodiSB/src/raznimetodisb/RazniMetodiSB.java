
package raznimetodisb;

public class RazniMetodiSB {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Metod append vraca referencu na StringBuilder nad kojim je pozvan,
        // tako da mozemo ulancavati pozive (ovaj nacin rada koriste i neki drugi jezici)
        sb.append("Zdravo").append(" ").append("svima, kako ste danas?");
        System.out.println("sb = " + sb);

        // II nacin:
        // StringBuilder mozemo da napravimo na osnovu String literala.
        StringBuilder sb1 = new StringBuilder("Zdravo ");
        sb1.append("svima!");
        // ili, krace:
        // sb = new StringBuilder("Zdravo ").append("svima, kako ste danas");
        System.out.println("sb1 = " + sb1);

        // III nacin:
        // StringBuilder mozemo da napravimo na osnovu String objekta.
        String tmp = "Java";
        StringBuilder sb2 = new StringBuilder(tmp).append(" i Intellij IDEA");
        System.out.println("sb2 = " + sb2);

        // Sadrzaj StringBuildera obrce u mestu.
        System.out.println("sb.reverse() = " + sb.reverse());

        System.out.println("sb.length() = " + sb.length());

        // Mozemo da promenimo i-ti karakter.
        sb.setCharAt(0, '!');
        System.out.println("sb = " + sb);

        // Kako ocistiti StringBuilder? Postavljamo mu duzinu na 0 :)
        sb.setLength(0);
        sb.append("Zdravo kolege!");

        // Mozemo ubacivati i brisati podstringove
        sb.insert(7, "drage ");
        System.out.println("sb = " + sb);
        // Mozemo zameniti podstring sa datim indeksima drugim stringom
        sb.replace(7,12, "vredne");
        System.out.println("sb = " + sb);
        sb.delete(7, 14);
        System.out.println("sb = " + sb);
       
        
        
    }
    
}
