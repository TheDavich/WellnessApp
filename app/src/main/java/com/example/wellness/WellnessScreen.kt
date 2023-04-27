package com.example.wellness

import android.content.res.Configuration
import android.content.res.Resources.Theme
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wellness.model.Day
import com.example.wellness.model.DayList
import com.example.wellness.ui.theme.WellnessTheme
import com.example.wellness.ui.theme.md_theme_dark_surface

@Composable
fun WellnessApp(
    days: List<Day>,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .background(androidx.compose.material.MaterialTheme.colors.background)
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(days) { day ->
            WellnessCard(day = day)
        }
    }
}





@Composable
fun WellnessCard(
    day: Day,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .height(156.dp)
            .width(156.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(androidx.compose.material.MaterialTheme.colors.surface)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                DayText(day = day)
            }

            WellnessIcon(day = day,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)

            )
        }
    }
}



@Composable
fun WellnessIcon(
    day: Day,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(day.icon),
        contentDescription = null,
        modifier = modifier
            .size(
                width = 128.dp,
                height = 54.dp
            )
            .clip(RoundedCornerShape(6.dp)),
        contentScale = ContentScale.Crop
    )
}



@Composable
fun DayText(
    day: Day,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Text(
            text = stringResource(day.day),
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 13.dp,
                ),
            color = androidx.compose.material.MaterialTheme.colors.secondary,
            style = androidx.compose.material.MaterialTheme.typography.h1
        )
        Text(
            text = stringResource(day.description),
            modifier = Modifier
                .padding(
                    top = 6.dp,
                    start = 13.dp,
                    end = 13.dp
                ),
            color = androidx.compose.material.MaterialTheme.colors.secondary,
            style = androidx.compose.material.MaterialTheme.typography.h2
        )
    }
}

@Preview(showBackground = false)
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun WellnessPreview() {
    WellnessTheme {
        WellnessApp(days = DayList.days)
    }
}