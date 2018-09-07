package valentino.david.dicodingdavid

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.AnkoContext
import valentino.david.dicodingdavid.ankoLayoutActivity.MainActivityUI
import valentino.david.dicodingdavid.ankoLayoutList.ItemListUI

class RecyclerViewAdapter(private val context: Context, private val items: List<item.Item>, private val listener: (item.Item) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

//    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): LaunchMenuItemViewHolder? {
//        return LaunchMenuItemViewHolder(LunchMenuItemUI().createView(AnkoContext.create(parent!!.context, parent)))
//    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=
//            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int){
//
//    return MainActivity(ItemListUI().createView(AnkoContext.create(parent!!.context, parent)))
//}
//            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val name = view.findViewById<TextView>(R.id.name)!!
        private val image = view.findViewById<ImageView>(R.id.image)

        fun bindItem(items: item.Item, listener: (item.Item) -> Unit) {
            name.text = items.name
            Glide.with(itemView.context).load(items.image).into(image)
            itemView.setOnClickListener {
                listener(items)
            }
        }
    }
}