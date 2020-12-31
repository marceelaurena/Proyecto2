package examenFinal;

public class EquipoSonidoController {

    public void iniciar() {
        EquipoSonido eS = new EquipoSonido();
        EquipoSonidoVista esv;
        esv = new EquipoSonidoVista(eS);
    }
}
