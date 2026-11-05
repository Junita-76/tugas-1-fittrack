/**
 * Menguji program keanggotaan gym TesFitTrack.
 */
public class TesFitTrack{

  /**
   * Menjalankan pengujian validasi dan menampilkan daftar anggota FitTrack.
   * @param args argumen dari command line
   */
  public static void main(String[] args){
    Member anggota1 = new Member("Anet", "081234567890", "24-10-2026", "Basic");
    Member anggota2 = new Member("Andi", "081234567891", "25-10-2026", "Premium");
    Member anggota3 = new Member("Putri", "081234567892", "26-10-2026", "VIP");
    Member anggota4 = new Member("Putra", "081234567893", "27-10-2026");

    System.out.println("=== PENGUJIAN VALIDASI ===");

    anggota1.setNama("");
    anggota2.setNoTelepon("12345");
    anggota3.setJenisPaket("Gold");
    anggota4.setTanggalDaftar("");

    Member[] daftarAnggota = {
      anggota1, anggota2, anggota3, anggota4
    };

    System.out.println("\n== DAFTAR ANGGOTA FITTRACK ==");

    for(int i = 0; i < daftarAnggota.length; i++){
      System.out.println("Anggota ke-" + (i + 1));
      System.out.println(daftarAnggota[i]);
      System.out.println("-------------------------------");
    }
  }
}
