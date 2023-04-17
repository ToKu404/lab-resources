package nilai;

class NilaiKelas extends Nilai {
    private int nilaiUjian;

    public NilaiKelas(int nilaiTugas, int nilaiUjian, MataKuliah mataKuliah) {
        super(nilaiTugas, mataKuliah);
        this.nilaiUjian = nilaiUjian;
    }

    public int getNilaiUjian() {
        return nilaiUjian;
    }

    public void setNilaiUjian(int nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Nilai Final : " + nilaiUjian);
    }
}
