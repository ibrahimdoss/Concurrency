package notes;

public enum GeneralNotes {
	
//	Threadleri Neden Kullanırız ?
//			
//	Bir uygulamada birden fazla islem yaptırmak istiyorsak,
//	
//	Diyelim ki main thread'imiz icinde baska thread yoksa islemler bu main thread icinde
//	adım adım ilerler.
//	Ama CPU'yu efektik kullanma seviyesi çok kötü gözükür. Burada CPU daha fazla is yaptır manasında 
//	belirtiyor.
//	
//Ama main thread icinde birden fazla thread acarak islem yaparsak CPU'ya daha fazla is yaptırabiliriz
//Mesela Thread-1 CPU'da baska bir parcada islem yaparken, Thread-0 baska parcada islem yapar bu sekilde.
//
//Threadleri bu yüzden kullanıyoruz, CPU'ya daha fazla is yaptırmak icin.
//
//Diğer nokta da servlete request atıyoruz direkt sonuc alıyoruz bunun sebebi de requeste özel
//thread acmasından dolayı.
	
	
	//AtomicInteger deki yapı birden fazla islem gelse bile sırayla alarak islem yapıyor.
	//Yani thread 1 ve 2 aynı anda istek gelse bile burada sırayla alarak islem yaptırtıyor.


}
