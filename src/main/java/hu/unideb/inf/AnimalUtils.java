package hu.unideb.inf;

public class AnimalUtils {

    private AnimalDAO aDAO;

    public void setaDAO(AnimalDAO aDAO) {
        this.aDAO = aDAO;
    }

    //Business Logic
    public void runUtils(){
        Animal ellyElephant = new Animal("Elly", 9, Animal.GenderType.FEMALE);
        aDAO.saveAnimal(ellyElephant);
    }
}
