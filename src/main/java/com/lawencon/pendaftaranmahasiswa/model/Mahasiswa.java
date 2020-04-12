package com.lawencon.pendaftaranmahasiswa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_mahasiswa"
,uniqueConstraints = {
  @UniqueConstraint(name = "ktp_mhs", columnNames = {"noKtpMhs"})
, @UniqueConstraint(name = "email_mhs", columnNames = {"emailMhs"})
, @UniqueConstraint(name = "ktp_ortu", columnNames = {"noKtpOrtu"})})
public class Mahasiswa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mahaId;
	private String noKtpMhs;
	private String emailMhs;
	private String namaMhs;
	private String alamatMhs;
	private String noKtpOrtu;
	private String namaOrtu;
	private String namaAsalSekolah;
	private String alamatAsalSekolah;
	private int nilaiBindo;
	private int nilaiMatematika;
	private int nilaiFisika;
	private String Status;
	
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getMahaId() {
		return mahaId;
	}
	public void setMahaId(int mahaId) {
		this.mahaId = mahaId;
	}
	public String getNoKtpMhs() {
		return noKtpMhs;
	}
	public void setNoKtpMhs(String noKtpMhs) {
		this.noKtpMhs = noKtpMhs;
	}
	public String getEmailMhs() {
		return emailMhs;
	}
	public void setEmailMhs(String emailMhs) {
		this.emailMhs = emailMhs;
	}
	public String getNamaMhs() {
		return namaMhs;
	}
	public void setNamaMhs(String namaMhs) {
		this.namaMhs = namaMhs;
	}
	public String getAlamatMhs() {
		return alamatMhs;
	}
	public void setAlamatMhs(String alamatMhs) {
		this.alamatMhs = alamatMhs;
	}
	public String getNoKtpOrtu() {
		return noKtpOrtu;
	}
	public void setNoKtpOrtu(String noKtpOrtu) {
		this.noKtpOrtu = noKtpOrtu;
	}
	public String getNamaOrtu() {
		return namaOrtu;
	}
	public void setNamaOrtu(String namaOrtu) {
		this.namaOrtu = namaOrtu;
	}
	public String getNamaAsalSekolah() {
		return namaAsalSekolah;
	}
	public void setNamaAsalSekolah(String namaAsalSekolah) {
		this.namaAsalSekolah = namaAsalSekolah;
	}
	public String getAlamatAsalSekolah() {
		return alamatAsalSekolah;
	}
	public void setAlamatAsalSekolah(String alamatAsalSekolah) {
		this.alamatAsalSekolah = alamatAsalSekolah;
	}
	public int getNilaiBindo() {
		return nilaiBindo;
	}
	public void setNilaiBindo(int nilaiBindo) {
		this.nilaiBindo = nilaiBindo;
	}
	public int getNilaiMatematika() {
		return nilaiMatematika;
	}
	public void setNilaiMatematika(int nilaiMatematika) {
		this.nilaiMatematika = nilaiMatematika;
	}
	public int getNilaiFisika() {
		return nilaiFisika;
	}
	public void setNilaiFisika(int nilaiFisika) {
		this.nilaiFisika = nilaiFisika;
	}
	
}
