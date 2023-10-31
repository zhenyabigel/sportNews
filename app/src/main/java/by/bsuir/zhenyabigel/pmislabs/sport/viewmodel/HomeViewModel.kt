package by.bsuir.zhenyabigel.pmislabs.sport.viewmodel

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import by.bsuir.zhenyabigel.pmislabs.sport.R
import by.bsuir.zhenyabigel.pmislabs.sport.model.SportEvent
import by.bsuir.zhenyabigel.pmislabs.sport.repisitory.EventsRepository
import by.bsuir.zhenyabigel.pmislabs.sport.repisitory.FavoriteEventsRepository
import java.time.LocalDate
import java.time.Month

class HomeViewModel:ViewModel() {
    private val eventsRepository = EventsRepository()
    private val favEventsRepository = FavoriteEventsRepository()
    @RequiresApi(Build.VERSION_CODES.O)
    val getListOfEvents = eventsRepository.getListOfEvents()
    @RequiresApi(Build.VERSION_CODES.O)
    val getListOfFavEvents =favEventsRepository.getListOfFavoriteEvents()
    @RequiresApi(Build.VERSION_CODES.O)
    val items: MutableList<SportEvent> = getListOfEvents
    @RequiresApi(Build.VERSION_CODES.O)
    val favoriteItems: MutableList<SportEvent> = getListOfFavEvents
    @RequiresApi(Build.VERSION_CODES.O)
    fun onClickRemoveEvent(sportEvent: SportEvent):Unit {
        items.remove(sportEvent)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun onClickAddToFavorite(sportEvent: SportEvent) :Unit {
        favoriteItems.add(sportEvent)
        favEventsRepository.addToListOfEvents(sportEvent)
    }    @RequiresApi(Build.VERSION_CODES.O)
    fun onClickRemoveFavEvent(sportEvent: SportEvent):Unit {
        favoriteItems.remove(sportEvent)
    }
}