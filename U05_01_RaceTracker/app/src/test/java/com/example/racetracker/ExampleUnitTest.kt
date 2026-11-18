package com.example.racetracker

import org.junit.Test

import org.junit.Assert.*


import com.example.racetracker.ui.RaceParticipant

class RaceParticipantTest {
    private val raceParticipant = RaceParticipant(
        name = "Test",
        maxProgress = 100,
        progressDelayMillis = 500L,
        initialProgress = 0,
        progressIncrement = 1
    )
}