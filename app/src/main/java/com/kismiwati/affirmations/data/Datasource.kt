package com.kismiwati.affirmations.data

import com.kismiwati.affirmations.R
import com.kismiwati.affirmations.model.Affirmation

//format data dibawah ini menggunakan format Affirmation,
//bedasarkan tipe data yang dibuat di Affirmation.kt.
//data diambil dari stringResourceId.
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1 ),
            Affirmation(R.string.affirmation2 ),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}