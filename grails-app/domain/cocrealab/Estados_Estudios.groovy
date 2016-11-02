package admin

class Estados_Estudios {
    int id
    String nombre
    static constraints = {
        id(blank: false,min: 1)
        nombre(blank: false)
    }
    static BelongsTo = admin.Estudios_Miembros
}
