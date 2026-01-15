package com.example.ghostremote

import java.io.Serializable

data class ModConfig(
    var horsepower: Int = 100,
    var braking: Int = 50,
    var topSpeed: Int = 120,
    var lowSpeed: Int = 30,
    var maxTopSpeed: Int = 200,
    var mirrors: Boolean = true,
    var exhaust: Boolean = true,
    var suspensionMode: String = "normal"
) : Serializable