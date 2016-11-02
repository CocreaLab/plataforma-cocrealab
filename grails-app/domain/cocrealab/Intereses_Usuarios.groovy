package admin

class Intereses_Usuarios {



    int id
    static belongsTo=admin.Miembro
    static hasOne=[tema:admin.Tema]
}
