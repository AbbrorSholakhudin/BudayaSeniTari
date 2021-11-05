package com.example.utsrizkydwisaputra
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.utsabbrorsholakhudin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.tari_gambyong,"Tari Gambyong","Daerah asal : Jawa Tengah", "Gambyong merupakan salah satu bentuk tarian Jawa klasik yang berasal-mula dari wilayah Surakarta dan biasanya dibawakan untuk pertunjukan atau menyambut tamu."))

        data?.add(DataModel(R.drawable.tari_ketuk_tilu,"Tari Ketuk Tilu","Daerah asal : Jawa Barat","Ketuk Tilu adalah salah satu tarian khas dari daerah Jawa Barat yang dianggap sebagai cikal bakal tari jaipong yang lebih populer. Tarian ini mengandung unsur tari dan pencak silat yang dilakukan oleh para laki-laki dan perempuan secara berpasangan untuk menunjukan eksistensinya."))

        data?.add(DataModel(R.drawable.tari_pendet,"Tari Pendet","Daerah asal : Bali", "Tari Pendet pada awalnya merupakan tari pemujaan yang banyak diperagakan di pura, tempat ibadat umat Hindu di Bali, Indonesia. Tarian ini melambangkan penyambutan atas turunnya dewata ke alam dunia."))

        data?.add(DataModel(R.drawable.tari_remo,"Tari Remo","Daerah asal: Jawa Timur", "Tari Remo merupakan tari yang khusus dibawakan oleh penari laki – laki. Ini berkaitan dengan lakon yang dibawakan dalam tarian ini."))

        data?.add(DataModel(R.drawable.tari_saman,"Tari Saman","LDaerah asal : Nanggroe Aceh Darussalam", "Tari Saman adalah sebuah tarian suku Gayo yang biasa ditampilkan untuk merayakan peristiwa-peristiwa penting dalam adat. Syair dalam tarian saman mempergunakan bahasa Gayo. Selain itu biasanya tarian ini juga ditampilkan untuk merayakan kelahiran Nabi Muhammad SAW."))

        data?.add(DataModel(R.drawable.tari_yospan,"Tari Yospan","Daerah Asal : Papua", "Tari Yospan adalah jenis tarian Kontemporer yang menggambarkan pergaulan atau persahabatan pada kaum muda-mudi Biak Numfor.Tarian ini muncul pada tahun 1960 yang kemudian sempat menjadi bagian dari senam kesehatan jasmani di sejumlah instansi pemerintahan.Yospan adalah bentuk akronim dari kata Yosim Pancar."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.namatari)
                intent.putExtra("harga", item?.namadaerah)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}