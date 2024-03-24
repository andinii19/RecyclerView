package recyelerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pemrogramanbergerak.R

class adapterClass (private  val dataList: ArrayList<dataClass> ): RecyclerView.Adapter<adapterClass.ViewHolderClass>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val  currentItem = dataList[position]
        holder.fotoMHS.setImageResource(currentItem.listFoto)
        holder.namaMHS.text = currentItem.listNama
        holder.nimMHS.text = currentItem.listNIM

    }


    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val fotoMHS:ImageView = itemView.findViewById(R .id.foto)
        val namaMHS:TextView = itemView.findViewById(R.id.nama)
        val nimMHS:TextView = itemView.findViewById(R.id.nim)
    }
}