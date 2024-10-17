package com.rpm24.mad_assignment_1_22012011042

import androidx.room.Query

interface Dao {
    @get:Query("SELECT * FROM recipe")
    var all: List<Recipe?>?
}