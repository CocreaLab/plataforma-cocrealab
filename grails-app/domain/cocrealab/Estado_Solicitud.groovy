package admin

class Estado_Solicitud {
    int id
    String nombre

    static constraints = {
        id(blank:false)
        nombre(blank: false)
    }
}
