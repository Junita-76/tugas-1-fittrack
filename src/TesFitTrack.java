/**
 * Menguji program keanggotaan gym TesFitTrack.
 */
public class TesFitTrack{
  public static void main(String[] args){
    Member anggota1 = new Member("Anet", "081234567890", "24-10-2026", "Basic");
    Member anggota2 = new Member("Andi", "081234567891", "25-10-2026", "Premium");
    Member anggota3 = new Member("Putri", "081234567892", "26-10-2026", "VIP");
    Member anggota4 = new Member("Putra", "081234567893", "27-10-2026");

    anggota1.setNama("");
    System.out.println(anggota1);

    anggota2.setNoTelepon("12345");
    System.out.println(anggota2);

    anggota3.setJenisPaket("Gold");
    System.out.println(anggota3);

    anggota4.setTanggalDaftar("");
    System.out.println(anggota4);
  }
}
