# FitTrack - Sistem Keanggotaan Gym

## Deskripsi

FitTrack merupakan program sederhana berbasis Java untuk mengelola data anggota gym. Program ini dibuat untuk menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO).

## Fitur
- Menyimpan informasi anggota gym.
- Mengelola nama, nomor telepon, tanggal pendaftaran, dan jenis paket.
- Memvalidasi nama agar tidak kosong.
- Memvalidasi nomor telepon agar diawali angka 0 dan minimal 10 digit.
- Memvalidasi tanggal pendaftaran dengan format dd-MM-yyyy.
- Memvalidasi jenis paket Basic, Premium, dan VIP.
- Menampilkan daftar anggota menggunakan array dan perulangan.

## Konsep PBO yang Digunakan
- Class dan Object: Class Member digunakan untuk membuat objek anggota gym.
- Encapsulation: Atribut dibuat private dan diakses melalui getter dan setter.
- Constructor: Digunakan untuk menginisialisasi data anggota.
- Method Overriding: Menggunakan toString() untuk menampilkan informasi anggota.

## Struktur Folder
```text
tugas-1-fittrack-main/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Cara Menjalankan Program

1. Pastikan Java Development Kit (JDK) sudah terpasang.
2. Buka terminal pada folder utama project.
3. Compile program:

```bash
javac -d out src/Member.java src/TesFitTrack.java
```

4. Jalankan program:

```bash
java -cp out TesFitTrack
```

## Pengujian
Program diuji menggunakan beberapa kondisi input, termasuk:
- Nama kosong.
- Nomor telepon tidak valid.
- Jenis paket yang tidak tersedia.
- Format tanggal yang tidak valid.

Program juga menampilkan daftar anggota yang berhasil dibuat.
