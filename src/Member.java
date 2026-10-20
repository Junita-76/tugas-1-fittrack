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
    if(nama != null && !nama.trim().isEmpty()){
      this.nama = nama;
    }
    else{
      System.out.println("Nama tidak boleh kosong");
    }
  }

  public void setNoTelepon(String noTelepon){
    if(noTelepon != null && noTelepon.matches("0[0-9]{9,}")){
      this.noTelepon = noTelepon;
   }
    else{
      System.out.println("Nomor telepon harus diawali 0 dan minimal 10 digit!");
    }
  }
}
