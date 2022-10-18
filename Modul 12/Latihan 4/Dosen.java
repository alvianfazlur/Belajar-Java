public class Dosen extends Orang{
	private int nip;

	public Dosen(String nama){
		super(nama);
	}
	public Dosen(String nama, int nip){
		super(nama);
		this.nip = nip;
	}
	public Dosen(String nama, int nip, int umur){
		super(nama,umur);
		this.nip = nip;
	}
	public void Info(){
		if(nip == 0 && umur == 0){
			System.out.println("Nama : " + nama);
			System.out.println("NIP : - ");
			System.out.println("Umur : - ");
		}
		else if(umur == 0){
			System.out.println("Nama : " + nama);
			System.out.println("NIP : " + nip);
			System.out.println("Umur : - ");
		}
		else if(nip == 0){
			System.out.println("Nama : " + nama);
			System.out.println("NIP : - ");
			System.out.println("Umur : " + umur);
		}
		else{
			System.out.println("Nama : " + nama);
			System.out.println("NIP : " + nip);
			System.out.println("Umur :  " + umur);
		}
		
	}
}