package by.bsuir.zhenyabigel.pmislabs.sport.repisitory

import android.os.Build
import androidx.annotation.RequiresApi
import by.bsuir.zhenyabigel.pmislabs.sport.R
import by.bsuir.zhenyabigel.pmislabs.sport.model.SportEvent
import java.time.LocalDate
import java.time.Month

class FavoriteEventsRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    var favoriteEventsList = mutableListOf<SportEvent>(
        SportEvent(
            id= 0,
            name = "Spain - La Liga",
            date = LocalDate.of(2023, Month.SEPTEMBER, 15),
            firstTeam = "Granada",
            secondTeam = "Villarreal",
            winningTeam = "Villarreal",
            score = "3:4",
            imageFirst = R.drawable.logo_teambravo,
            imageSecond =R.drawable.logo_mascots
        ),
        SportEvent(
            id= 0,
            name = "Italy - Serie A",
            date = LocalDate.of(2023, Month.NOVEMBER, 23),
            firstTeam = "Empoli",
            secondTeam = "Atalanta",
            winningTeam = "Atalanta",
            score = "1:0",
            imageFirst = R.drawable.logo_mascots,
            imageSecond =R.drawable.logo_teambravo
        ),
        SportEvent(
            id= 0,
            name = "England - Championship",
            date = LocalDate.of(2016, Month.OCTOBER, 11),
            firstTeam = "Coventry",
            secondTeam = "West Bromwich",
            winningTeam = "Coventry",
            score = "3:1",
            imageFirst = R.drawable.logo_mascots,
            imageSecond =R.drawable.logo_teambravo
        )
    )
    @RequiresApi(Build.VERSION_CODES.O)
    fun getListOfFavoriteEvents(): MutableList<SportEvent>{
        return favoriteEventsList
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun addToListOfEvents(sportEvent: SportEvent){
        favoriteEventsList.add(sportEvent)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun saveListOfEvents(newList:MutableList<SportEvent>){
        favoriteEventsList = newList
    }
}