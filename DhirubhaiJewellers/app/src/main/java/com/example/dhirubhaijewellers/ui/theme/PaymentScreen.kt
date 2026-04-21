package com.example.dhirubhaijewellers.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dhirubhaijewellers.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaymentScreen(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("PAYMENT", color = GoldPrimary, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    scrolledContainerColor = Color.Unspecified,
                    navigationIconContentColor = Color.Unspecified,
                    titleContentColor = Color.Unspecified,
                    actionIconContentColor = Color.Unspecified
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Black).padding(padding).padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Scan to Pay", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text("Dhirubhai Jewellers", color = Color.Gray, fontSize = 16.sp)

            Spacer(modifier = Modifier.height(30.dp))

            // QR Code Container
            Card(
                modifier = Modifier.size(300.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(16.dp)
            ) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.shop_qr1), // Ensure this exists!
                        contentDescription = "QR Code",
                        modifier = Modifier.size(260.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                "After payment, please share the screenshot on WhatsApp for order processing.",
                color = Color.LightGray,
                textAlign = TextAlign.Center,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth().height(56.dp),
                colors = ButtonDefaults.buttonColors(containerColor = GoldPrimary),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("I HAVE PAID", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}