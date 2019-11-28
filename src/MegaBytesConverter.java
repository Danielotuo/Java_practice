public class MegaBytesConverter {

    public static void pmbakb(int KiloBytes) {
        if (KiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            int MegaByte = KiloBytes / 1024;
            int remaining = KiloBytes % 1024;
            System.out.println(KiloBytes + "KB = " + MegaByte + "MB and " + remaining + " kilobytes KB");
        }
    }
}
