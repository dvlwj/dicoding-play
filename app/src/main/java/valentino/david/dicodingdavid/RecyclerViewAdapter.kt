package valentino.david.dicodingdavid

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.AnkoContext
import valentino.david.dicodingdavid.ankoLayoutList.ItemListUI
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.view.LayoutInflater



class RecyclerViewAdapter(private val context: Context, private val items: List<item.Item>, private val listener: (item.Item) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListUI().createView(AnkoContext.create(parent.context,parent)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val clubList = items[position]
        holder.name.text = clubList.name
        Glide.with(context).load(clubList.image).into(holder.image)
//        Picasso.get().load(clubList.image).into(holder.image)
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val name = view.findViewById<TextView>(R.id.textViewClub)
        val image = view.findViewById<ImageView>(R.id.imageViewClub)

        fun bindItem(items: item.Item, listener: (item.Item) -> Unit) {
            name.text = items.name
            Glide.with(itemView.context).load(items.image).into(image)
            itemView.setOnClickListener {
                listener(items)
                val context = it.context
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("name", items.name)
                intent.putExtra("image", items.image)
                intent.putExtra("desc", items.desc)
//                startActivity(intent)
                context.startActivity(intent)
            }
        }
    }
}