package by.bsuir.zhenyabigel.pmislabs.sport.model

import androidx.annotation.DrawableRes
import java.time.LocalDate
import java.util.Date

data class SportEvent (
    val id: Int,
    val name: String,
    val date: LocalDate,
    val firstTeam: String,
    val secondTeam: String,
    val winningTeam: String,
    val score: String,
    @DrawableRes val imageFirst: Int,
    @DrawableRes val imageSecond: Int
)

//У матча есть название, дата, команды которые играли, результат матча, кто победил.
