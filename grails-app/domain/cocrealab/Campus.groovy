package admin

class Campus {
    int id
    static belongsTo=[ies: admin.IES,municipio:admin.Municipio]
    static hasMany = [programas:admin.Programa_Campus]
}
