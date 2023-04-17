package nilai;

class Nilai {
    protected MataKuliah mataKuliah;
    protected int nilaiTugas;

    public Nilai(int nilai, MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilai;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilai) {
        this.nilaiTugas = nilai;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void showDetail() {
        System.out.println("Nilai Tugas : " + nilaiTugas);
    }
}
