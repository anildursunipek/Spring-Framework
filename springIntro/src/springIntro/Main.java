package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// IoC -> inversion of Control -> Birbirinin alternatifi olan isler yonetilir
		// Kisaca birbirinin alternatifi olan isler farkli siniflarda yazilir
		// SOLID
		// Prensip olarak yeni bir ozellik eklediginde mevcut kodu degistiremezsin
		// Dependency injection
		// Yazilim gelistirilebilir, degisebilir olmalidir
		// Example
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.Add();
		CustomerManager customermanager2 = new CustomerManager(new MysqlCustomerDal());
		customermanager2.Add();*/
		CustomerManager customerManager = new CustomerManager(context.getBean("database",ICustomerDal.class));
		customerManager.Add();
		/*ICustomerDal interface'i kullanarak 2 farkli sinif olusturuldu ve ICustomerDal implement edildi
		Daha sonrasında CustomerManager sinifi icerisindeki Add() fonksiyonu olusturulan interface referens edilerek
		o interface'in implement edildigi diger sinifların referans tip ile parametre olarak girilmesine olanak saglandi
		Bu durumun en buyuk avantajı ilerleyen zamanlarda yeni bir database eklenmek istendiginde impelement edilerek 
		parametre olarak girilmesi yeterli olacaktir. Kodumuz deigisme ve gelisime acik olacaktir.*/
	}
}
