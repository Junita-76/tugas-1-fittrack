import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

/**
* Menyimpan informasi anggota gym FitTrack.
*/
public class Member{
  private String nama;
  private String noTelepon;
  private String tanggalDaftar;
  private String jenisPaket;

/**
  *mengambil nama anggota
  *@return nama anggota
  */
public String getNama(){
  return nama;
  }

/**
  *mengambil nomor telepon anggota
  *@return nomor telepon anggota
  */ 
public String getNoTelepon(){
  return noTelepon;
  }

/**
  *mengambil tanggal pendaftaran anggota
  *@return tanggal pendaftaran anggota
  */
public String getTanggalDaftar(){
  return tanggalDaftar;
  }

/**
  *mengambil jenis paket anggota
  *@return jenis paket anggota
  */
public String getJenisPaket(){
  return jenisPaket;
  }

/**
 * Mengatur nama anggota.
 * Nama tidak boleh kosong atau null.
 * @param nama nama anggota
 */ 
public void setNama(String nama){
    if(nama != null && !nama.trim().isEmpty()){
      this.nama = nama;
    }
    else{
      System.out.println("Nama tidak boleh kosong");
    }
  }
  
/**
 * Mengatur nomor telepon anggota.
 * Nomor harus diawali 0 dan minimal 10 digit.
 * @param noTelepon nomor telepon anggota
 */
public void setNoTelepon(String noTelepon){
    if(noTelepon != null && noTelepon.matches("0[0-9]{9,}")){
      this.noTelepon = noTelepon;
   }
    else{
      System.out.println("Nomor telepon harus diawali 0 dan minimal 10 digit!");
    }
  }


  /**
   * Mengatur tanggal pendaftaran anggota.
   * Format tanggal harus dd-MM-yyyy dan tanggal harus valid.
   * @param tanggalDaftar tanggal pendaftaran anggota
   */
  public void setTanggalDaftar(String tanggalDaftar){
    try{
      DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);

      LocalDate.parse(tanggalDaftar, format);
      this.tanggalDaftar = tanggalDaftar;
    }

    catch (DateTimeParseException | NullPointerException e){
      System.out.println("Tanggal harus menggunakan format dd-MM-yyyy dan tanggal yang valid");
    }
  }

  /**
   * Mengatur jenis paket anggota.
   * Paket yang tersedia adalah Basic, Premium, dan VIP.
   * @param jenisPaket jenis paket anggota
   */
    public void setJenisPaket(String jenisPaket){
      if(jenisPaket != null && (jenisPaket.equals("Basic") || jenisPaket.equals("Premium") || jenisPaket.equals("VIP"))){
        this.jenisPaket = jenisPaket;
      }
      else{
      System.out.println("Jenis paket harus Basic, Premium, atau VIP");
      }
    }
  
    /**
     * Membuat objek anggota dengan empat data.
     * @param nama nama anggota
     * @param noTelepon nomor telepon anggota
     * @param tanggalDaftar tanggal pendaftaran
     * @param jenisPaket jenis paket anggota
     */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket){
      setNama(nama);
      setNoTelepon(noTelepon);
      setTanggalDaftar(tanggalDaftar);
      setJenisPaket(jenisPaket);
    }

  /**
   * Membuat objek anggota dengan paket Basic sebagai default.
   * @param nama nama anggota
   * @param noTelepon nomor telepon anggota
   * @param tanggalDaftar tanggal pendaftaran
   */
    public Member(String nama, String noTelepon, String tanggalDaftar){
      this(nama, noTelepon, tanggalDaftar, "Basic");
    }
  
 /**
  * Mengubah informasi anggota menjadi bentuk teks.
  * @return informasi lengkap anggota
  */
  @Override
  public String toString(){
    return "Nama: " + nama + "\nNo. Telepon: " + noTelepon + "\nTanggal Daftar: " + tanggalDaftar + "\nJenis Paket: " + jenisPaket;
  }
}
