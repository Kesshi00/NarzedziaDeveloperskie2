package pl.edu.wszib.zadankolab1;

abstract class koktajl implements Jadalne, Pijalne {

    private final int kcal;

    public koktajl(int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void jedz() {
        pij();
    }

}
