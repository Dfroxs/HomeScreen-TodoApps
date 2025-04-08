package id.dfroxs.todoapps.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.dfroxs.todoapps.R
import id.dfroxs.todoapps.data.BarAttribute
import id.dfroxs.todoapps.data.ItemProgress
import id.dfroxs.todoapps.ui.component.BottomBar
import id.dfroxs.todoapps.ui.component.CircularBar
import id.dfroxs.todoapps.ui.component.InProgressItem
import id.dfroxs.todoapps.ui.component.StatusBar
import id.dfroxs.todoapps.ui.component.TaskItem
import id.dfroxs.todoapps.ui.theme.HomeScreenTodoAppsTheme
import id.dfroxs.todoapps.ui.theme.Purple10
import id.dfroxs.todoapps.ui.theme.Purple100

@Composable
fun HomeScreen(modifier: Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = {
            StatusBar()
        },
        bottomBar = {
            BottomBar()
        }) { innerPadding ->
        Box(modifier = modifier
                .fillMaxSize()
                .blur(90.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.background),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.4f
            )
        }
        LazyColumn(modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding))
        {
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp, horizontal = 16.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = Purple100)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(18.dp)
                                .weight(1.5f)
                        ) {
                            Text(
                                text = "Your today's task almost done!",
                                color = Color.White,
                                fontWeight = FontWeight(400),
                                fontSize = 16.sp
                            )
                            Button(
                                modifier = Modifier.padding(top = 18.dp),
                                shape = RoundedCornerShape(10.dp),
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                            ) {
                                Text(
                                    text = "View Task",
                                    fontWeight = FontWeight(900),
                                    color = Purple100
                                )
                            }
                        }
                        Row(modifier = Modifier
                            .padding(18.dp)) {
                            CircularBar(
                                modifier = Modifier.size(100.dp),
                                data = BarAttribute(
                                    barColor = Color.White,
                                    progress = 0.5f,
                                    textColor = Color.White,
                                    textSize = 20.sp
                                )
                            )
                        }

                    }

                }
            }
            item {
                Spacer(modifier = Modifier.padding(4.dp))
                Row {
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "In Progress",
                        fontWeight = FontWeight(700),
                        fontSize = 20.sp
                    )
                    Box(
                        modifier = Modifier
                            .background(Purple10, CircleShape), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            modifier = Modifier.padding(horizontal = 8.dp),
                            text = "6",
                            fontWeight = FontWeight(500),
                            fontSize = 12.sp,
                            color = Purple100,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.padding(8.dp))
                LazyRow {
                    items(2) {
                        InProgressItem(ItemProgress())
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.padding(8.dp))
                Row {
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = "Task Groups",
                        fontWeight = FontWeight(700),
                        fontSize = 20.sp
                    )
                    Box(
                        modifier = Modifier
                            .background(Purple10, CircleShape), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            modifier = Modifier.padding(horizontal = 8.dp),
                            text = "4",
                            fontWeight = FontWeight(500),
                            fontSize = 12.sp,
                            color = Purple100,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.padding(8.dp))
            }
            items(5) {
                TaskItem()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TodoList() {
    HomeScreenTodoAppsTheme {
        Scaffold(Modifier.fillMaxSize()) { innerPadding ->
            HomeScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}