package com.example.bmi_app.ui.theme

data class ValueState (
    val label: String,
    val suffix: String,
    val value: String = "",
    val error: String? = null
) {
    fun toNumber() = value.toDoubleOrNull()
}