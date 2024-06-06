package ClassesFilhas;

import ClassesPai.Animal;
import ClassesPai.Mamifero;

public class Cao extends Mamifero {
    private int hora;
    private boolean emCasa;

    public void Atividade(int hora){
        if (this.hora >= 6 && this.hora <= 7){
            System.out.println("Hora de comer");
        }else {
            System.out.println("Brincando");
        }
    }

    public void Atividade(int hora, boolean emCasa){
        this.hora = hora;
        this.emCasa = emCasa;
        if (this.emCasa == true){
            if (this.hora > 22){
                System.out.println("Dormindo");
            }else {
                System.out.println("Brincando/Deitado");
            }
        }else {
            System.out.println("Rotina alterada");
        }
    }

    @Override
    public void mamar() {
        System.out.println("Mamando");
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void comida() {

    }

    @Override
    public void som() {

    }
}
