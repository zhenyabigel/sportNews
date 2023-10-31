package by.bsuir.zhenyabigel.pmislabs.sport.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import by.bsuir.zhenyabigel.pmislabs.sport.R
import by.bsuir.zhenyabigel.pmislabs.sport.model.SportEvent
import by.bsuir.zhenyabigel.pmislabs.sport.navigation.BottomBarScreen
import by.bsuir.zhenyabigel.pmislabs.sport.ui.theme.fontFamily
import by.bsuir.zhenyabigel.pmislabs.sport.viewmodel.HomeViewModel
import java.time.LocalDate
import java.time.Month


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CustomItem(sportEvent: SportEvent, OnClickDelete:()->Unit) {
    val backgroundImage = painterResource(id = R.drawable.secondpartofsportbackround)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .clip(
                shape = RoundedCornerShape(
                    topStart = 10.dp,
                    topEnd = 10.dp,
                    bottomEnd = 10.dp,
                    bottomStart = 10.dp,
                ),
            )
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp,end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier = Modifier
                                .width(150.dp)
                        ) {
                            Text(
                                text = sportEvent.name,
                                color = Color.Black,
                                fontFamily = fontFamily,
                                fontSize = 22.sp

                            )
                            Text(
                                text = sportEvent.date.toString(),
                                color = Color.Black,
                                fontFamily = fontFamily
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(sportEvent.imageFirst),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(60.dp)
                                    .height(60.dp)
                            )
                            Text(
                                fontSize = 18.sp,
                                text = sportEvent.firstTeam,
                                color = Color.Black,
                                fontFamily = fontFamily
                            )
                        }
                        Text(
                            text = "VS",
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontFamily = fontFamily
                        )
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(sportEvent.imageSecond),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(60.dp)
                                    .height(60.dp)
                            )
                            Text(
                                fontSize = 18.sp,
                                text = sportEvent.secondTeam,
                                color = Color.Black,
                                fontFamily = fontFamily
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.CenterHorizontally
                        )
                        {
                            IconButton(
                                onClick = {OnClickDelete}, modifier = Modifier
                                    .size(25.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    contentDescription = "Localized description",
                                    tint = Color.Black
                                )
                            }
                            IconButton(
                                onClick = {  }, modifier = Modifier
                                    .size(25.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.FavoriteBorder,
                                    contentDescription = "Localized description",
                                    tint = Color.Black
                                )
                            }
                        }
                    }
                    }

                }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.LightGray)
                    .padding(start = 20.dp,end = 20.dp)
                    ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row (horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.width(150.dp)){
                    Text(
                        fontSize = 16.sp,
                        text = "WINNER",
                        color = Color.Black,
                        fontFamily = fontFamily
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Localized description",
                        tint = Color.Black
                    )
                    Text(
                        fontSize = 16.sp,
                        text =sportEvent.winningTeam,
                        color = Color.Black,
                        fontFamily = fontFamily
                    )


                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.width(100.dp)) {
                    Text(
                        fontSize = 16.sp,
                        text = "SCORE",
                        color = Color.Black,
                        fontFamily = fontFamily
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Localized description",
                        tint = Color.Black
                    )
                    Text(
                        fontSize = 16.sp,
                        text =sportEvent.score,
                        color = Color.Black,
                        fontFamily = fontFamily
                    )
                }

            }


        }


    }
}


