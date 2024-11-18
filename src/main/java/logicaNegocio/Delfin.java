package logicaNegocio;

public class Delfin extends Animal {
    private TipoHabitat Habitat;
 
    public Delfin() {
        this.habitat = TipoHabitat.ACUATICO;
    }
 
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }
 
    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
 
    public TipoHabitat gethabitat() {
        return Habitat;
    }
}
