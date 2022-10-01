package pl.edu.wszib.zadankolab1;

abstract class koktajl implements Jadalne, Pijalne {

    @Override
    public void jedz() {
        pij();
    }

}
