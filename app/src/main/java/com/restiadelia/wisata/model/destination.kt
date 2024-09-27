package com.restiadelia.wisata.model

import com.restiadelia.wisata.R

data class destination(
    val imageResId: Int,
    val name: String,
   val descrip :String
)


object MockList1 {

    fun getModel(): List<destination> {
        val itemModel1 = destination(
            imageResId = R.drawable.japan,
            name = "Gunung fuji",
            descrip = "Tempat wisata ini menampilkan rumah-rumah adat Jepang yang dikenal sebagai gassho-zukuri, arsitektur tradisional yang unik dengan atap jerami berbentuk segitiga curam, dirancang untuk menahan salju tebal di musim dingin. Desa-desa seperti ini bisa ditemukan di area pedesaan Jepang, seperti Shirakawa-go atau di sekitarnya. Rumah-rumah tersebut dikelilingi oleh suasana alam yang indah, dan dari beberapa titik, pengunjung dapat menikmati pemandangan spektakuler Gunung Fuji yang megah di kejauhan.\n" +
                    "\n" +
                    "Pemandangan ini sangat indah terutama saat Gunung Fuji terlihat jelas di musim semi, dengan latar bunga sakura yang bermekaran, atau di musim gugur dengan dedaunan berwarna-warni. Tempat ini tidak hanya menawarkan keindahan arsitektur tradisional Jepang, tetapi juga ketenangan alam yang menggabungkan sejarah dan pesona alam Jepang, menjadikannya destinasi favorit bagi wisatawan yang ingin merasakan keaslian budaya Jepang dengan panorama Gunung Fuji yang ikonik."
        )
        val itemModel2 = destination(
            imageResId = R.drawable.wisata,
            name = "Tokyo",
            descrip = "Sebagai ibu kota Jepang, Tokyo adalah pusat ekonomi, politik, dan budaya yang sangat dinamis. Tokyo terkenal dengan gedung pencakar langitnya, distrik bisnis yang padat, dan kawasan hiburan seperti Shibuya, Shinjuku, dan Ginza. Di Tokyo, pengunjung dapat menemukan perpaduan unik antara teknologi canggih dan tradisi kuno, dengan kuil-kuil bersejarah yang berdampingan dengan pusat perbelanjaan modern, seperti Tokyo Tower, Sensoji Temple di Asakusa, dan Tokyo Skytree."
        )
        val itemModel3 = destination(
            imageResId = R.drawable.kaisar_jepang,
            name = "Istana kekaisar Tokyo",
            descrip = "Istana kekaisaran Tokyo adalah rumah kediaman utama darai kaisar Jepang. Istana ini biasa dibuka untuk umum tiap harinya. Hanya saja untuk tanggal 2 januari dan 23 desember, bangunan istana dan juga taman bagian dalam dari istana ini tidak terbuka untuk umum. Untuk bisa melihat keluarga kerajaan, hanya bisa dilihat pada hari – hari tertentu saja dimna pada saat itu, anggota keluaraga kekaisaran biasanya membuat sebuah penampilan publik di balkon."
        )
        val itemModel4 = destination(
            imageResId = R.drawable.kuil_meiji,
            name = "Kuil Meiji",
            descrip = "Kuil ini dibangun pada tahun 1920 di Tokyo untuk mengenang Kaisar Meiji dan juga istrinya Empress Shōken. Berbeda dengan suasana hingar bingar kota Tokyo yang penuh dengan keramaian, Kuil Meiji ini justru merupakan tempat wisata yang cenderung lebih tenang dan juga jauh sekali dari gambaran perkotaan. Di wilayah kuil ini, sejauh mata memandang hanya ada panorama hutan hijau dengan jajaran pohon yang rindang yang tentunya bisa membuat tubuh dan juga pikiranmu beristirahat sejenak dari kepenatan perkotaan."
        )


        val itemList: ArrayList<destination> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        return itemList


    }
}

