package ar.edu.ort.tp3.grupo6.csha.model

enum class Relationship(val id: String) {
    TITULAR("T"),
    CONYUGE("Y"),
    HIJO("JO"),
    PADRE("P"),
    MADRE("M"),
    NIETO("NO"),
    HERMANO("HO"),
    NUERA("NA"),
    OTROS("O")
}