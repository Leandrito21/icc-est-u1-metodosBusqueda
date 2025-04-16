package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }

    public int busquedaLineal(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;

    }

    /*
     * @param code a buscar
     * 
     * @return posicion de la persona
     */
    public int findPersonByCode(int code) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].getCode() == code) {
                return i;
            }
        }
        return-1;
        
    }
    public void showPerson() {
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0) {
            showConsole.showMessage("Persona con código " + codeToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else {
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public int findPersonByName(String name){
        for(int i = 0; i < people.length; i++) {
            if(people[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public void showPersonByName(){
        String nameTofind = showConsole.inputName();
        int indexPerson = findPersonByName(nameTofind);
        if(indexPerson >= 0) {
            showConsole.showMessage("Persona con nombre " + nameTofind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());

        }else {
            showConsole.showMessage("Persona no encontrada");
        }

    }
}
// si no tiene ningun metodo de orden se ocupa el metodo de busqueda secuencial