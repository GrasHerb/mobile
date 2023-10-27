package com.example.figmadisigne.recadapters

import com.example.figmadisigne.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{
    val list = arrayListOf(feel(R.drawable.mood_ic1,"Спокойным"),
        feel(R.drawable.mood_ic2,"Расслабленным"),
        feel(R.drawable.mood_ic3,"Сосредоточеным"),
        feel(R.drawable.mood_ic4,"Взволнованным")
    )}
    data class state(val title:String, val text_state:String, val image_state: Int)
    class MyState{
        val state_list = arrayListOf(
            state("Заголовок статьи","Краткое описание", R.drawable.stateimage),
            state("Заголовок статьи","Краткое описание", R.drawable.stateimage),
            state("Заголовок статьи","Краткое описание", R.drawable.stateimage),
            state("Заголовок статьи","Краткое описание", R.drawable.stateimage)
        )
    }
