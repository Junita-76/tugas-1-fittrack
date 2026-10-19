/**
* Menyimpan informasi anggota gym FitTrack.
*/
public class Member{
  private String nama;
  private String noTelepon;
  private String tanggalDaftar;
  private String jenisPaket;

public String getNama(){
  return nama;
  }
public String getNoTelepon(){
  return noTelepon;
  }
public String getTanggalDaftar(){
  return tanggalDaftar;
  }
public String getJenisPaket(){
  return jenisPaket;
  }

  public void setNama(String nama){
    if(nama != null && !nama.trim().is Empty()){
      this.nama = nama;
    }
    else{
      System.out.println("Nama tidak boleh kosong");
    }
}
