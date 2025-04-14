package Adam.Belajar_Java_dasar;

import java.math.BigDecimal;

class Account_Adam {
    private String nama;
    private Integer noRekening;
    private BigDecimal saldo;

    public Account_Adam(String nama, Integer noRekening, BigDecimal saldo) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

//nama

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//noRekening

    public Integer getNoRekening() {
        return noRekening;
    }

    public void setNoRekening() {
        this.noRekening = noRekening;
    }

//SourceAccount

    public void setNoRekening (String nama, Integer noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }

//saldo

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
