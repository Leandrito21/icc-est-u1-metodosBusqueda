package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    private Persona[] people;
    private ShowConsole pantalla;


    public MetodosBusquedaBinaria () {

    }
    /*
     * Un calse tipo publica, que para instanciar tengo que 
     * mandar un argumento
     */
    public MetodosBusquedaBinaria(Persona[] people) {
        this.people = people;
        this.pantalla = new ShowConsole();
        pantalla.showMessage("*** Método de busqueda Binaria ***");
        
    }
    
    private int findPersonByCode(int code) {
        int bajo = 0;
        int alto = people.length -1;

        while(alto >= bajo) {
            int central = (alto + bajo) /2;
            if(people[central].getCode() == code){
                return central;
            }
            /*
             * no se pone else if porque tiene un return y acaba el método
             */
            if(people[central].getCode() > code){
                // ponemos - 1 y +1 para obviar el central
                alto = central - 1; //izq

            }else {
                bajo = central + 1; //der
            }
        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFind = pantalla.inputCode();
        /*
         * hay 6 posibilidades y un -1
         */
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson == -1) {
            pantalla.showMessage("Persona no encontrada");

        }else {
            pantalla.showMessage("Persona con codigo " + codeToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }

    }
    public void ordenarPorNombre() {
        for(int i = 0; i < people.length - 1; i++) {
            for(int j = 0; j < people.length - i - 1; j++) {
                if(people[j].getName().compareToIgnoreCase(people[j + 1].getName()) > 0) {
                    Persona temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
    }

    private int findPersonByName(String name) {
        ordenarPorNombre();
        int bajo = 0;
        int alto = people.length -1;

        while(alto >= bajo) {
            int central = (alto + bajo) /2;
            if(people[central].getName().equalsIgnoreCase(name)) {
                return central;
            }
            if(people[central].getName().compareToIgnoreCase(name) > 0) { //Nunca llega a cero
                alto = central - 1; //izq

            }else {
                bajo = central + 1; //der
            }

        }
        return -1;
    }


    public void showPersonByName(){
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if(indexPerson == -1) {
            pantalla.showMessage("Persona no encontrada");

        }else {
            pantalla.showMessage("Persona con codigo " + nameToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    
    }
        
}
