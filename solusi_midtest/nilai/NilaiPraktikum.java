package nilai;

class NilaiPraktikum extends Nilai {
    private int nilaiUjianPraktikum;

    public NilaiPraktikum(int nilaiTugas,
            int nilaiUjianPraktikum, MataKuliah mataKuliah) {
        super(nilaiTugas, mataKuliah);
        this.nilaiUjianPraktikum = nilaiUjianPraktikum;
    }

    public int getNilaiUjianPraktikum() {
        return nilaiUjianPraktikum;
    }

    public void setNilaiUjianPraktikum(int nilaiUjianPraktikum) {
        this.nilaiUjianPraktikum = nilaiUjianPraktikum;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Nilai Ujian Praktikum : " + nilaiUjianPraktikum);
    }
}
