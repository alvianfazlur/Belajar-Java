public class TesTugas{
public static void main(String args[]){
	Truk truk1 = new Truk();
	Truk truk2 = new Truk();
	Taksi taksi1 = new Taksi();
	Taksi taksi2 = new Taksi();
	Sepeda sepeda1 = new Sepeda();
	Sepeda sepeda2 = new Sepeda();

	truk1.setJmlRoda(4);
	truk2.setJmlRoda(6);
	taksi1.setJmlRoda(4);
	taksi2.setJmlRoda(4);
	sepeda1.setJmlRoda(3);
	sepeda2.setJmlRoda(2);
	
	truk1.setWarna("kuning");
	truk2.setWarna("merah");
	taksi1.setWarna("oranye");
	taksi2.setWarna("biru");
	sepeda1.setWarna("hitam");
	sepeda2.setWarna("putih");

	truk1.setBahanBakar("solar");
	truk2.setBahanBakar("Solar");
	taksi1.setBahanBakar("Bensin");
	taksi2.setBahanBakar("Bensin");
	sepeda1.setJmlSadel(1);
	sepeda2.setJmlSadel(2);
	
	truk1.setKapasitasMesin(1500);
	truk2.setKapasitasMesin(2000);
	taksi1.setKapasitasMesin(1500);
	taksi2.setKapasitasMesin(1300);
	sepeda1.setJmlGir(2);
	sepeda2.setJmlGir(5);
	
	truk1.setMuatanMaks(1000);
	truk2.setMuatanMaks(5000);
	taksi1.setTarifAwal(10000);
	taksi2.setTarifAwal(7000);
	taksi1.setTarifPerKm(5000);
	taksi2.setTarifPerKm(3500);

	System.out.println("Truk 1");
	System.out.println("Jumlah Roda = " + truk1.getJmlRoda());
	System.out.println("Warna = " + truk1.getWarna());
	System.out.println("Baahan Bakar = " + truk1.getBahanBakar());
	System.out.println("Kapasitas Mesin = " + truk1.getKapasitasMesin());
	System.out.println("Muatan Maksimal = " + truk1.getMuatanMaks());
	System.out.println("");
	System.out.println("Truk 2");
	System.out.println("Jumlah Roda = " + truk2.getJmlRoda());
	System.out.println("Warna = " + truk2.getWarna());
	System.out.println("Bahan Bakar = " + truk2.getBahanBakar());
	System.out.println("Kapasitas Mesin = " + truk2.getKapasitasMesin());
	System.out.println("Muatan Maksimal = " + truk2.getMuatanMaks());
	System.out.println("");
	System.out.println("Taksi 1");
	System.out.println("Jumlah Roda = " + taksi1.getJmlRoda());
	System.out.println("Warna = " + taksi1.getWarna());
	System.out.println("Bahan Bakar = " + taksi1.getBahanBakar());
	System.out.println("Kapasitas Mesin = " + taksi1.getKapasitasMesin());
	System.out.println("Tarif Awal = " + taksi1.getTarifAwal());
	System.out.println("Tarif Per Km = " + taksi1.getTarifPerKm());
	System.out.println("");
	System.out.println("Taksi 2");
	System.out.println("Jumlah Roda = " + taksi2.getJmlRoda());
	System.out.println("Warna = " + taksi2.getWarna());
	System.out.println("Bahan Bakar = " + taksi2.getBahanBakar());
	System.out.println("Kapasitas Mesin = " + taksi2.getKapasitasMesin());
	System.out.println("Tarif Awal = " + taksi2.getTarifAwal());
	System.out.println("Tarif Per Km = " + taksi2.getTarifPerKm());
	System.out.println("");
	System.out.println("Sepeda 1");
	System.out.println("Jumlah Roda = " + sepeda1.getJmlRoda());
	System.out.println("Warna = " + sepeda1.getWarna());
	System.out.println("Jumlah Sadel = " + sepeda1.getJmlSadel());
	System.out.println("Jumlah Gir = " + sepeda1.getJmlGir());
	System.out.println("");
	System.out.println("Sepeda 2");
	System.out.println("Jumlah Roda = " + sepeda2.getJmlRoda());
	System.out.println("Warna = " + sepeda2.getWarna());
	System.out.println("Jumlah Sadel = " + sepeda2.getJmlSadel());
	System.out.println("Jumlah Gir = " + sepeda2.getJmlGir());
	
	
	
}
}