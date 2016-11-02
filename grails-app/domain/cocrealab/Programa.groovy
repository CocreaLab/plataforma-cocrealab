package admin

class Programa {


    Integer id
    String nombre
    String modalidad
    String nivel_academico
    admin.Nivel_Programa nivel_programa


    static constraints={
     id(blank: false,min:1)
     nombre(blank: false)
	 nivel_academico(blank: false,inList:['POST', 'PRE'])
	 modalidad(blank: false,inList:['V', 'P', 'DT'])

    }
    static mapping={
        id column : 'id'
        nombre column: 'nombre'
        modalidad column: 'modalidad'
        nivel_academico column: 'nivel_academico'
    }
    static hasOne=[nivel_programa: admin.Nivel_Programa]

}
