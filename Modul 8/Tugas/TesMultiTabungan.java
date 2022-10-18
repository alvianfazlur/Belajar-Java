import java.util.Scanner;
public class TesMultiTabungan{
	public static void main (String srt[]){
		boolean status;
		MultiTabungan tabungan = new MultiTabungan(100000);
		System.out.println("Saldo awal :"+tabungan.getSaldo());
		System.out.println("1. US 2. AUD 3.IDR");

		Scanner mataUang = new Scanner(System.in);
		System.out.print("Input Mata Uang: ");
		int currency = mataUang.nextInt();

		Scanner simpan = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Uang: ");
		int save = simpan.nextInt();

		tabungan.simpanUang(save,currency);
		System.out.println("Jumlah uang yang disimpan : Rp." + tabungan.konversiUang(save,currency));

		Scanner cash = new Scanner(System.in);
		System.out.print("Ambil Tunai Sebesar: ");
		int ambil= cash.nextInt();
		status = tabungan.ambilUang(ambil);
		System.out.println("Jumlah uang yang diambil : Rp." +ambil);
		if (status)
			System.out.println("Ok");
		else
			System.out.println("Gagal");
		System.out.println("Saldo  :"+tabungan.getSaldo());
	}
}