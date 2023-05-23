package com.ahmeturunveren.adana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ahmeturunveren.adana.databinding.ActivityTarihceBinding;

public class TarihceActivity extends AppCompatActivity {
    private ActivityTarihceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTarihceBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        Intent intent = getIntent();
        String gelenVeri = intent.getStringExtra("sonuc");

        if (gelenVeri.equals("tarihce")) {
            binding.baslik.setText("ADANA");
            binding.imageView2.setImageResource(R.drawable.adana);
            binding.aciklamaText.setText("Adana'nın tarihçesi 3.000 yıl kadar öncesine dayanmaktadır; bölgedeki arkeolojik bulgular Paleolitik Çağ'a değin uzanan insan yerleşkelerini gün yüzüne çıkarmıştır. Arkeologların taş bir duvar ve bir şehir merkezi buldukları Tepebağ Höyüğü Neolitik Çağ'da inşa edilmiştir ve Çukurova bölgesindeki en eski şehir olarak düşünülmektedir. Adana isminde bir yer Sümer destanlarından biri olan Gılgamış Destanı'nda söz edilmektedir; ancak bu çalışmanın coğrafyası, sözü geçen yerin konumunu belirlemek için çok muğlaktır.");

        } else if (gelenVeri.equals("seyhannehri")) {
            binding.baslik.setText("Seyhan Nehri");
            binding.imageView2.setImageResource(R.drawable.seyhannehri);
            binding.aciklamaText.setText("Seyhan Nehri, Türkiye'nin Akdeniz'e dökülen ırmaklarından birisidir. Uzunluğu 560 km'dir. Havza alanı ise 20.600 km²'dir. İki önemli kolu vardır: uzun olanı, Kayseri-Pınarbaşı ilçesinden, 1500 metre yükseklikteki Uzun Yayla'dan doğan Zamantı suyudur ve Kayseri'nin Pınarbaşı, Tomarza, Develi, ve Yahyalı ilçelerinden geçer.");

        } else if (gelenVeri.equals("taskopru")) {
            binding.baslik.setText("Taş Köprü");
            binding.imageView2.setImageResource(R.drawable.taskopru);
            binding.aciklamaText.setText("Taşköprü, Türkiye'nin Karadeniz Bölgesi'nde yer alan Kastamonu ilinin bir ilçesidir. Taşköprü ilçesi adını Gökırmak üzerinde Roma öncesi dönemlerde yapıldığı tahmin edilen ve hâlen kullanılan yedi gözlü 68 metre uzunluğundaki Taş Köprü'den almaktadır.");

        } else if (gelenVeri.equals("ulucami")) {
            binding.baslik.setText("Ramazanoğulları Camii veya Adana Ulu Cami, Adana’da bulunan 16. yy.’dan kalma tarihi bir camidir. Ramazanoğulları Beyliği’nin başyapıtı olan cami, şehrin en önemli tarihi yapılarından birisidir.");
            binding.imageView2.setImageResource(R.drawable.ulucami);
            binding.aciklamaText.setText("Ulucami");

        } else if (gelenVeri.equals("tepebag")) {
            binding.baslik.setText("Tepebağ");
            binding.imageView2.setImageResource(R.drawable.tepebag);
            binding.aciklamaText.setText("Tepebağ, Adana'nın Seyhan ilçesinde bulunan bir mahalledir. Mahalle, batıda Seyhan Nehri'ne bakan bir tepe üzerinde, Taşköprü'den birkaç adım ötede yer almaktadır ve şehrin geleneksel konut mimarisini yansıtmaktadır.");

        } else if (gelenVeri.equals("ramazanoglu")) {
            binding.baslik.setText("Ramazanoğlu Konağı");
            binding.imageView2.setImageResource(R.drawable.ramazanoglu);
            binding.aciklamaText.setText("Ramazanoğlu Konağı, Türkiye'nin Adana kentinde bulunan bir konaktır. Ramazanoğulları Beyliği döneminde inşa edilmiş olup halen bir kültür merkezi olarak kullanılmaktadır ve Türkiye'deki en eski konak örneklerinden biridir. ");
        } else if (gelenVeri.equals("kebap")) {
            binding.baslik.setText("Adana Kebabı");
            binding.imageView2.setImageResource(R.drawable.kebap);
            binding.aciklamaText.setText("Adana kebabı, Adana'ya özgü, \"zırh\" adı verilen, satıra benzer bir bıçak ile elde kıyılan parça etten yapılan Türk mutfağında bir kebap veya şiş köfte çeşidi. Adana kebabını diğer kebaplardan ayıran en belirgin özellik kullanılan ettir.");

        } else if (gelenVeri.equals("sirdan")) {
            binding.baslik.setText("Şırdan");
            binding.imageView2.setImageResource(R.drawable.sirdan);
            binding.aciklamaText.setText("Şırdan dolması, kısaca şırdan, gevişgetiren hayvanların midelerinin son ve dördüncü bölümü olan şırdanın temizlenip içine baharatlı pirinç doldurulup dikilmesi ve salçalı suda pişirilmesi suretiyle hazırlanan Türk mutfağına özgü bir sakatat yiyeceğidir.");

        } else if (gelenVeri.equals("iclikofte")) {
            binding.baslik.setText("İçliköfte");
            binding.imageView2.setImageResource(R.drawable.iclikofte);
            binding.aciklamaText.setText("Bulgurun hamur hâline getirilerek içinin doldurulması suretiyle yapılan, Orta Doğu mutfağında bir yemektir. Aslen Levant mutfağına ait olan bu yemeğe kibbe ve bazı yörelerde dolgulu köfte de deniliyor. İçli köfte, iki türlü hazırlanır. Bunlardan birincisi haşlama usulüdür. ");

        } else if (gelenVeri.equals("oruk")) {
            binding.baslik.setText("Oruk");
            binding.imageView2.setImageResource(R.drawable.oruk);
            binding.aciklamaText.setText("Emeğin, kaliteli malzemenin konuştuğu bir içli köfte çeşidi. En büyük özelliği hamuruna dövülmüş et konulması. Kasaptan alınan et, en az 3-4 kez çektirilir.");

        } else if (gelenVeri.equals("alinazik")) {
            binding.baslik.setText("Alinazik");
            binding.imageView2.setImageResource(R.drawable.alinazik);
            binding.aciklamaText.setText("Közlenmiş patlıcanın sıcakken sarımsak, yoğurt, ve baharatla ezilmesiyle ılık bir püre hazırlanır. Küçük kuşbaşı doğranmış dana ya da kuzu eti veya kıyma yağda iyice kavrulur ve pürenin üzerine eklenir. Biberli yağ ile de servis edilebilmektedir.");

        } else if (gelenVeri.equals("bicibici")) {
            binding.baslik.setText("Bici Bici");
            binding.imageView2.setImageResource(R.drawable.bicibici);
            binding.aciklamaText.setText("Bici bici muhallebisi, yaz dönemlerinde yenilen, Adana iline özgü[1] bir tür tatlı. Halk arasında kısaca bici bici adıyla anılır. En bilinen şekliyle rendelenmiş buz, pişmiş nişasta, pudra şekeri ve şerbetten oluşur. Bici bici geçmişte neredeyse tamamen seyyar satıcılarda satılan bir ürün olmasına rağmen son yıllarda restoranlarda ve kafelerdede tatlı olarak sunulmaktadır. ");
        } else if (gelenVeri.equals("sillik")) {
            binding.baslik.setText("Şıllık Tatlısı");
            binding.imageView2.setImageResource(R.drawable.sillik);
            binding.aciklamaText.setText("Akıtma arasına ceviz sarılarak şerbetlendirilip ikram edilir. İki çeşidi vardır. Sarma şıllık, krep benzeri bir hamur olan akıtmanın içine ceviz ya da nadiren fıstık sarılıp üstüne çok ince şerbet dökülerek yapılır.");
        } else if (gelenVeri.equals("kunefe")) {
            binding.baslik.setText("Künefe");
            binding.imageView2.setImageResource(R.drawable.kunefe);
            binding.aciklamaText.setText("Künefe, kıyılmış filo hamuru, veya alternatif olarak ince irmik hamuruyla yapılan, şeker bazlı şurupla beslenen ve tipik olarak peynir veya pıhtılaşmış krema, fıstık, veya fındık gibi diğer malzemelerin dahil edilmesiyle yapılan, geleneksel bir Ortadoğu tatlısı.");

        } else if (gelenVeri.equals("baklava")) {
            binding.baslik.setText("Baklava");
            binding.imageView2.setImageResource(R.drawable.baklava);
            binding.aciklamaText.setText("Baklava Türk, Orta Doğu, Balkan ve Güney Asya mutfaklarında yer etmiş önemli bir hamur tatlısıdır. İnce yufkaların arasına yöreye göre ceviz, antep fıstığı, badem veya fındık konarak yapılır. Genel olarak şeker şerbeti ile tatlandırılır. ");

        } else if (gelenVeri.equals("kazandibi")) {
            binding.baslik.setText("Kazandibi");
            binding.imageView2.setImageResource(R.drawable.kazandibi);
            binding.aciklamaText.setText("Kazandibi, dibi tutturularak hafifçe kızartılan muhallebi. İki çeşit kazandibi vardır. Normalde kazandibi tavukgöğsünden yapılır. Tavukgöğsü katılmamış olanına \"Muhallebi Kazandibi\" adı verilir. ");

        }


    }


}