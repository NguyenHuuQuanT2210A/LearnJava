package assignment2;

public class PhanSo {
    int tuSo;
    int mauSo;

    public PhanSo() {
    }

    public PhanSo(int a, int b) {
    }

    public int getTuSo() {
        return this.tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return this.mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo() {
        System.out.println("Phan So: " + this.tuSo + "/" + this.mauSo);
    }

    public void nghichDao() {
        System.out.println("Phan So Ngich Dao: " + this.mauSo + "/" + this.tuSo);
    }

    public void rutGon() {
        int ucln = 1;
        this.tuSo /= ucln;
        this.mauSo /= ucln;
    }

    public PhanSo add(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * p.mauSo;
        return null;
    }

    public PhanSo sub(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * p.mauSo;
        return null;
    }

    public PhanSo mul(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * p.tuSo;
        kq.mauSo = this.mauSo * p.mauSo;
        return null;
    }

    public PhanSo div(PhanSo p) {
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo * p.mauSo;
        kq.mauSo = this.mauSo * p.tuSo;
        return null;
    }
}
