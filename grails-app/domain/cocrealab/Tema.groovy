package admin

class Tema {
    int id
    String nombre
    static belongsTo=admin.Intereses_Usuarios

    static constraints = {
        id(blank:false)
        nombre(blank:false)
    }
}
