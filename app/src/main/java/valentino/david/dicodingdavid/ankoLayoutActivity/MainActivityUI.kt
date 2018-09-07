package valentino.david.dicodingdavid.ankoLayoutActivity

import android.support.constraint.R.attr.*
import kotlinx.android.synthetic.main.activity_main.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.constraint.layout.constraintLayout
import org.jetbrains.anko.recyclerview.v7.recyclerView
import valentino.david.dicodingdavid.MainActivity
import valentino.david.dicodingdavid.R

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        constraintLayout{
            recyclerView().lparams(width = matchParent) {
                height = matchParent
                id = R.id.club_list
                layout_constraintBottom_toBottomOf == matchParent
                layout_constraintLeft_toLeftOf == matchParent
                layout_constraintRight_toRightOf == matchParent
                layout_constraintTop_toTopOf == matchParent
            }
        }
    }
}