package com.surkhojb.darkandlight.data

import android.preference.PreferenceManager
import com.surkhojb.darkandlight.App

const val PREF_THEME_LIGHT = "light_theme"

object PrefManager {
    val context = App.context
    val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    fun saveTheme(isLightTheme: Boolean) =
        preferences.edit().putBoolean(PREF_THEME_LIGHT,isLightTheme).apply()

    fun getTheme() = preferences.getBoolean(PREF_THEME_LIGHT,true)
}