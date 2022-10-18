package perbankan;
public class Tabungan{
	protected int saldo;

	public int getSaldo(){
		return saldo;
	}
	public void simpanUang(int jumlah){
		saldo += jumlah;
	}
	public boolean ambilUang(int jumlah){
		if(saldo >= jumlah){
			saldo -= jumlah;
			return true;
		}else{
			return false;
		}
	}
}