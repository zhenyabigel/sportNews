package by.bsuir.zhenyabigel.pmislabs.sport.screens
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import by.bsuir.zhenyabigel.pmislabs.sport.R
import by.bsuir.zhenyabigel.pmislabs.sport.ui.theme.fontFamily
import by.bsuir.zhenyabigel.pmislabs.sport.viewmodel.HomeViewModel

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FavoriteScreen() {
    val viewModel = viewModel<HomeViewModel>()
    val secPartOfBackgroundImage = painterResource(id = R.drawable.secondpartofsportbackround)
    val telegramIcon = painterResource(id = R.drawable.ic_tg)
    val instagramIcon = painterResource(id = R.drawable.ic_inst)
    val vkIcon = painterResource(id = R.drawable.ic_vk)
    Scaffold(
        backgroundColor = Color.Black,
        topBar = {
            TopAppBar(
                backgroundColor = Color.White,
                modifier = Modifier.height(45.dp),
                title = {
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxHeight()
                    ) {
                        Text(
                            "FAVORITE EVENTS",
                            fontFamily = fontFamily,
                            fontSize = 27.sp,
                            color = Color.Black
                        )
                        Text(
                            "Your favorite sports events",
                            fontFamily = fontFamily,
                            fontSize = 10.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(start = 10.dp, bottom = 5.dp)
                        )
                    }

                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Localized description"
                        )
                    }
                }

            )
        },
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                Image(
                    painter = secPartOfBackgroundImage,
                    contentDescription = "contentDescription",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.matchParentSize()
                )
                LazyColumn(
                    modifier = Modifier.padding(top = 7.dp),
                    contentPadding = PaddingValues(all = 5.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(items = viewModel.favoriteItems) { event ->

                    }
                }

            }


        }

    )
}