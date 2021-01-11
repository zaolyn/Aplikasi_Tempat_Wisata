package com.example.Faza;

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNames = {
            "Raja Ampat",
            "Pulau Pahawang",
            "Gunung Bromo",
            "Pulau Seribu",
            "Taman Safari Indonesia",
            "Pulau Komodo",
            "Gunung Semeru",
            "Desa Ciptagelar",
            "Pulau Derawan",
            "Pulau Tegal Mas",
    };

    private static String[] wisataDetails = {
            "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung (Vogelkoop) Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat. Kepulauan ini sekarang menjadi tujuan para penyelam yang tertarik akan keindahan pemandangan bawah lautnya. Empat gugusan pulau yang menjadi anggotanya dinamakan menurut empat pulau terbesarnya, yaitu Pulau Waigeo, Pulau Misool, Pulau Salawati, dan Pulau Batanta,Raja ampat juga adalah tempat wisata unggulan yang Indonesia miliki, Raja ampat terletak diPapua salah satu tempat incaran para penyelam selain lautnya yang indah Raja ampat juga memiliki berbagai tempat rekreasi yang bisa dikunjungi.",
            "Pulau Pahawang adalah desa dan pulau di kecamatan Marga Punduh, Kabupaten Pesawaran, Lampung, Indonesia.Pulau ini terletak lepas Teluk Punduh.Jalan Raya Bumi Sari Natar Gang Bima Ruko Orange memiliki sejuta pesona yang tidak kalah menarik dengan obyek lainnya. Saat ini Pulau ini mulai sering dimasukkan dalam setiap penawaran paket wisata yang ada di Lampung. Paket wisata ke tempat ini menjamur, terbukti karena sudah sering ditawarkan oleh biro perjalanan wisata yang memanfaatkan pesona bawah lautnya sebagai daya tarik yang sering ditawarkan pada wisatawan negeri maupun mancanegara.",
            "Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja Brama, adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur, Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif, Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru, Bentuk tubuh Gunung Bromo bertautan antara lembah dan ngarai dengan kaldera atau lautan pasir seluas sekitar 10 kilometer persegi, Ia mempunyai sebuah kawah dengan garis tengah ± 800 meter (utara-selatan) dan ± 600 meter (timur-barat), Sedangkan daerah bahayanya berupa lingkaran dengan jari-jari 4 km dari pusat kawah Bromo.",
            "Kawasan Taman Nasional Kepulauan Seribu termasuk wilayah perairan Laut Jawa di bagian utara Teluk Jakarta. Karena termasuk dalam Paparan Sunda, maka perairan laut di kawasan ini merupakan perairan laut dangkal dengan pulau-pulau karang dan paparan karang serta terumbu karang (reef flat dan coral reef). Taman Nasional ini mempunyai SDA yang khas yaitu keindahan alam laut dengan ekosistem karang yang unik seperti terumbu karang, ikan hias dan ikan konsumsi, echinodermata, crustacea, molusca, penyu, tumbuhan laut dan darat, mangrove, padang lamun, dan lain-lain, Berdasarkan kriteria kegiatan budidaya perikanan berupa kondisi fisik geofisik (keterlindungan, kedalaman perairan, dan substrat dasar laut), oceanografis (kecepatan arus), dan kualitas air (kecerahan dan salinitas), kapasitas Kepulauan Seribu untuk pengembangan budidaya perikanan laut seluas 904,17 ha, di antaranya 622,49 ha (66%) dalam kawasan TNKpS. Berdasarkan kriteria kepariwisataan berupa keindahan alam, keaslian panorama alam, keunikan ekosistem, tidak adanya gangguan alam yang berbahaya, dan ketersediaan sarana dan prasarana pendukung, kapasitas Kepulauan Seribu untuk pengembangan pariwisata seluas 872,06 ha dengan kapasitas pengunjung 2.318 orang per hari, di antaranya 795,38 ha dan 1.699 Orang per hari (73%) adalah kapasitas dalam kawasan Taman Nasional Laut Kepulauan Seribu.",
            "Taman Safari Indonesia adalah tempat wisata keluarga berwawasan lingkungan yang berorientasi pada habitat satwa di alam bebas. Taman Safari Indonesia terletak di Desa Cibeureum Kecamatan Cisarua, Kabupaten Bogor, Jawa Barat atau yang lebih dikenal dengan kawasan Puncak. Taman ini berfungsi menjadi penyangga Taman Nasional Gunung Gede Pangrango di ketinggian 900-1800 m di atas permukaan laut, serta mempunyai suhu rata-rata 16 - 24 derajat Celsius,Keunikan tempat wisata ini dari kebun binatang lainnya di Indonesia adalah pengunjungnya bisa berkeliling ke berbagai tempat untuk bisa melihat dari dekat semua jenis binatang dengan memakai mobil pribadi ataupun naik bus yang sudah disediakan pihak pengelola Taman Safari. Pengunjung juga bisa berinteraksi langsung dengan memberi makan hewan-hewan tersebut.",
            "Pulau Komodo adalah sebuah pulau yang terletak di Kepulauan Nusa Tenggara. Pulau Komodo dikenal sebagai habitat asli hewan komodo. Pulau ini juga merupakan kawasan Taman Nasional Komodo yang dikelola oleh Pemerintah Pusat. Pulau Komodo berada di sebelah timur Pulau Sumbawa, yang dipisahkan oleh Selat Sape, Secara administratif, pulau ini termasuk wilayah Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur, Indonesia. Pulau Komodo merupakan ujung paling barat Provinsi Nusa Tenggara Timur, berbatasan dengan Provinsi Nusa Tenggara Barat, Di Pulau Komodo, hewan komodo hidup dan berkembang biak dengan baik. Hingga Agustus 2009, di pulau ini terdapat sekitar 1300 ekor komodo. Ditambah dengan pulau lain, seperti Pulau Rinca dan dan Gili Motang, jumlah mereka keseluruhan mencapai sekitar 2500 ekor. Ada pula sekitar 100 ekor komodo di Cagar Alam Wae Wuul di daratan Pulau Flores tapi tidak termasuk wilayah Taman Nasional Komodo, Selain komodo, pulau ini juga menyimpan eksotisme flora yang beragam kayu sepang yang oleh warga sekitar digunakan sebagi obat dan bahan pewarna pakaian, pohon nitak ini atau sterculia oblongata di yakini berguna sebagai obat dan bijinya gurih dan enak seperti kacang polong, Pulau Komodo juga diterima sebagai Situs Warisan Dunia UNESCO, karena dalam wilayah Taman Nasional Komodo, bersama dengan Pulau Rinca, Pulau Padar dan Gili Motang.",
            "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat[1]. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur. Gunung ini termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru, Semeru mempunyai kawasan hutan Dipterokarp Bukit, hutan Dipterokarp Atas, hutan Montane, dan Hutan Ericaceous atau hutan gunung, Posisi geografis Semeru terletak antara 8°06' LS dan 112°55' BT. Pada tahun 1913 dan 1946 Kawah Jonggring Saloka memiliki kubah dengan ketinggian 3.744,8 m hingga akhir November 1973. Di sebelah selatan, kubah ini mendobrak tepi kawah menyebabkan aliran lava mengarah ke sisi selatan meliputi daerah Pronojiwo dan Candipuro di Lumajang.",
            "Sebuah kampung adat bernama Ciptagelar di Sukabumi, Jawa Barat masih memegang erat tradisinya hingga saat ini, Masyarakat hukum adat ini tinggal di sebuah desa yang berada di kawasan pedalaman Gunung Halimun-Salak yang merupakan bagian dari kawasan Taman Nasional Gunung Halimun dan Gunung Salak yang bernama Kampung Gede Kasepuhan Cipta Gelar dan dikelilingi oleh gunung lainnya seperti Gunung Surandil, Gunung Karancang, dan Gunung Kendeng, Kampung Ciptagelar berada di wilayah Kampung Sukamulya, Desa Sirnaresmi, Kecamatan Cisolok, Kabupaten Sukabumi. Wilayahnya meliputi Kabupaten Lebak, Kabupaten Bogor, dan Kabupaten Sukabumi, Berdiri sejak tahun 1368, kampung yang berada di ketinggian 1.050 meter di atas permukaan laut ini memiliki suhu berkisar 20 - 26 derajat celcius, ini masih memegang kuat adat dan ajaran leluhur seperti ciri khas lokasi, bentuk rumah, serta tradisi yang masih dijalankan oleh penduduknya, Seren Taun Ciptagelar, Disebut kasepuhan karena desa ini memiliki model kepemimpinan yang berasal dari adat dan kebiasaan orang tua atau sesepuh.",
            "Kepulauan Derawan adalah sebuah kepulauan yang berada di Kabupaten Berau, Kalimantan Timur. Di kepulauan ini terdapat sejumlah objek wisata bahari menawan, salah satunya Taman Bawah Laut yang diminati wisatawan mancanegara terutama para penyelam kelas dunia, Kepulauan Derawan memiliki tiga kecamatan yaitu, Pulau Derawan, Maratua, dan Biduk Biduk, Berau, Sedikitnya ada empat pulau yang terkenal di kepulauan tersebut, yakni Pulau Maratua, Derawan, Sangalaki, dan Kakaban yang ditinggali satwa langka penyu hijau dan penyu sisik.",
            "Pulau Tegal Mas merupakan sebuah kawasan wisata yang terletak di Kecamatan Teluk Pandan, Kabupaten Pesawaran, Lampung. Banyak yang menyebutnya mirip dengan Maladewa, karena eksotisme alam & penginapan terapung yang ada di sekelilingnya, Belakangan ini, Pulau Tegal Mas seolah menjadi magnet yang memikat hati para wisatawan. Tak sebatas turis domestik, destinasi wisata yang berdiri di atas lahan seluas 113 Ha ini juga mulai dilirik oleh wisatawan dari berbagai negara, Meski baru dibuka sebagai kawasan wisata sejak akhir 2017 lalu, progres pembangunan sejumlah fasilitas wisata di tempat ini berkembang sangat pesat. Berbagai inovasi dilakukan, untuk memastikan pengunjung bisa memperoleh kenyamanan dan kepuasan, Panorama alam yang memukau, didukung kemudahan akses menuju lokasi, menjadi alasan para pelancong lebih memilih Pulau Tegal Mas sebagai destinasi wisata. Tak heran jika setiap harinya, Pulau Tegal Mas dapat menerima kunjungan hingga ratusan orang.",
    };

    private static int[] wisataImages = {
            R.drawable.raja_ampat,
            R.drawable.pahawang,
            R.drawable.bromo,
            R.drawable.pulau_seribu,
            R.drawable.taman_safari ,
            R.drawable.pulau_komodo,
            R.drawable.gunung_semeru,
            R.drawable.desa_ciptagelar,
            R.drawable.pulau_derawan,
            R.drawable.pulau_tegal_mas
    };

    public static ArrayList<Wisata> getlistData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(wisataNames[position]);
            wisata.setDetail(wisataDetails[position]);
            wisata.setPhoto(wisataImages[position]);
            list.add(wisata);
        }
        return list;
    }
}
