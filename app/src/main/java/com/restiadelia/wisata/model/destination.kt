package com.restiadelia.wisata.model

import com.restiadelia.wisata.R

data class destination(
    val imageResId: Int,
    val name: String,
   val descrip :String
)

object MockList {

    fun getModel(): List<destination> {
        val itemModel1 = destination(
            imageResId = R.drawable.japan,
            name = "Apple",
            descrip = "dsijdiejdeodkckdciddcdcjdjdkd"
        )
        val itemModel2 = destination(
            imageResId = R.drawable.japan,
            name = "Apple",
            descrip = "dsijdiejdeodkckdciddcdcjdjdkd"
        )
        val itemModel3 = destination(
            imageResId = R.drawable.japan,
            name = "Apple",
            descrip = "dsijdiejdeodkckdciddcdcjdjdkd"
        )
        val itemModel4 = destination(
            imageResId = R.drawable.japan,
            name = "Apple",
            descrip = "dsijdiejdeodkckdciddcdcjdjdkd"
        )


        val itemList: ArrayList<destination> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        return itemList


    }
}

