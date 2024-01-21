package com.practice.bluromatic

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.practice.bluromatic.ui.BluromaticScreen

class BlurActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BluromaticScreen()
        }
    }
}

fun Context.getImageUri(): Uri {
    val resources = this.resources

    return Uri.Builder()
        .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
        .authority(resources.getResourcePackageName(R.drawable.cupcake))
        .appendPath(resources.getResourceTypeName(R.drawable.cupcake))
        .appendPath(resources.getResourceEntryName(R.drawable.cupcake))
        .build()
}
