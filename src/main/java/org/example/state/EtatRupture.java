package org.example.state;

/**
 * État concret : Machine en rupture de stock
 */
public class EtatRupture implements State {

    private MachineBoisson machine;

    public EtatRupture(MachineBoisson machine) {
        this.machine = machine;
    }

    @Override
    public void insererPiece() {
        System.out.println("❌ Désolé, la machine est en rupture de stock.");
        System.out.println("💸 Veuillez récupérer votre pièce.");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("❌ Aucune pièce à éjecter.");
    }

    @Override
    public void selectionnerBoisson() {
        System.out.println("❌ Désolé, aucune boisson disponible.");
    }

    @Override
    public void distribuerBoisson() {
        System.out.println("❌ Impossible, la machine est vide.");
    }

    @Override
    public void remplirStock() {
        System.out.println("🔧 Remplissage du stock en cours...");
        machine.setStock(10);
        System.out.println("✅ Machine réapprovisionnée ! (" + machine.getStock() + " boissons disponibles)");
        machine.setState(machine.getEtatEnAttente());
    }

    @Override
    public String toString() {
        return "RUPTURE DE STOCK";
    }
}