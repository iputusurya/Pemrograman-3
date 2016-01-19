/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absenpegawai;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mor
 */
@Entity
@Table(name = "data_pegawai", catalog = "pegawai", schema = "")
@NamedQueries({
    @NamedQuery(name = "DataPegawai.findAll", query = "SELECT d FROM DataPegawai d"),
    @NamedQuery(name = "DataPegawai.findByIdPegawai", query = "SELECT d FROM DataPegawai d WHERE d.idPegawai = :idPegawai"),
    @NamedQuery(name = "DataPegawai.findByNama", query = "SELECT d FROM DataPegawai d WHERE d.nama = :nama"),
    @NamedQuery(name = "DataPegawai.findByAlamat", query = "SELECT d FROM DataPegawai d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "DataPegawai.findByJenisKelamin", query = "SELECT d FROM DataPegawai d WHERE d.jenisKelamin = :jenisKelamin"),
    @NamedQuery(name = "DataPegawai.findByNoTelp", query = "SELECT d FROM DataPegawai d WHERE d.noTelp = :noTelp"),
    @NamedQuery(name = "DataPegawai.findByKeterangan", query = "SELECT d FROM DataPegawai d WHERE d.keterangan = :keterangan")})
public class DataPegawai implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pegawai")
    private String idPegawai;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @Column(name = "no_telp")
    private String noTelp;
    @Basic(optional = false)
    @Column(name = "keterangan")
    private String keterangan;

    public DataPegawai() {
    }

    public DataPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public DataPegawai(String idPegawai, String nama, String alamat, String jenisKelamin, String noTelp, String keterangan) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.noTelp = noTelp;
        this.keterangan = keterangan;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        String oldIdPegawai = this.idPegawai;
        this.idPegawai = idPegawai;
        changeSupport.firePropertyChange("idPegawai", oldIdPegawai, idPegawai);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        String oldNoTelp = this.noTelp;
        this.noTelp = noTelp;
        changeSupport.firePropertyChange("noTelp", oldNoTelp, noTelp);
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        String oldKeterangan = this.keterangan;
        this.keterangan = keterangan;
        changeSupport.firePropertyChange("keterangan", oldKeterangan, keterangan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPegawai != null ? idPegawai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataPegawai)) {
            return false;
        }
        DataPegawai other = (DataPegawai) object;
        if ((this.idPegawai == null && other.idPegawai != null) || (this.idPegawai != null && !this.idPegawai.equals(other.idPegawai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "absenpegawai.DataPegawai[ idPegawai=" + idPegawai + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
