public class Tes {
	public static void Proses(Pegawai peg) {
		if (peg instanceof Manajer) {
			Manajer man = (Manajer) peg;
			System.out.println("Data Manajer : " + peg.getNama() + " Gaji " + peg.getGaji());
		} else if (peg instanceof Kurir) {
			Kurir kur = (Kurir) peg;
			System.out.println("Data Kurir : " + peg.getNama() + " Gaji: " + peg.getGaji());
		} else {
			System.out.println("Data Pegawai : " + peg.getNama() + " Gaji " + peg.getGaji());
		}
	}
	public static void main(String args[]) {
		Manajer manager = new Manajer("Yanto", 7000);
		Kurir kurir = new Kurir("Riku", 10000);
		Pegawai pegawai = new Pegawai("Mega", 3000);
		Proses(manager);
		Proses(kurir);
		Proses(pegawai);
	}
}