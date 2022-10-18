public class MultiTabungan{
	private int saldo;

	public MultiTabungan(int initsaldo){
		saldo=initsaldo;
	}
	public int getSaldo(){
		return saldo;
	}
	public void simpanUang(int jumlah,int pilihan){
		if(pilihan == 1){
			int tambah = jumlah * 9000;
			saldo += tambah;
		}	
		else if(pilihan == 2){
			int tambah = jumlah * 10000;
			saldo += tambah;
		}
		else{
			saldo += jumlah;
		}
	}
	public boolean ambilUang(int jumlah){
		if(saldo > jumlah){
			saldo -= jumlah;
			return true;
		}
		return false;
	}
	public int konversiUang(int uang,int pilihan){
		if(pilihan == 1){
			return uang*9000;
		}
		else if(pilihan == 2){
			return uang*10000;
		}
		else{
			return uang;
		}
	}
}