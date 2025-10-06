package org.example.state;

/**
 * État concret : Machine en attente d'une pièce
 */
public class EtatEnAttente implements State {

    private MachineBoisson machine;

    public EtatEnAttente(MachineBoisson machine) {
        this.machine = machine;
    }

    @Override
    public void insererPiece() {
        System.out.println("💰 Pièce insérée avec succès !");
        machine.setState(machine.getEtatPieceInseree());
    }

    @Override
    public void ejecterPiece() {
        System.out.println("❌ Aucune pièce à éjecter.");
    }

    @Override
    public void selectionnerBoisson() {
        System.out.println("❌ Veuillez d'abord insérer une pièce.");
    }

    @Override
    public void distribuerBoisson() {
        System.out.println("❌ Veuillez d'abord insérer une pièce.");
    }

    @Override
    public void remplirStock() {
        System.out.println("✅ Stock rempli !");
    }

    @Override
    public String toString() {
        return "EN ATTENTE";
    }
}