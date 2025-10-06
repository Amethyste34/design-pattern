package org.example.state;

/**
 * État concret : Une pièce a été insérée, en attente de sélection
 */
public class EtatPieceInseree implements State {

    private MachineBoisson machine;

    public EtatPieceInseree(MachineBoisson machine) {
        this.machine = machine;
    }

    @Override
    public void insererPiece() {
        System.out.println("❌ Une pièce est déjà insérée.");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("💸 Pièce éjectée. Voici votre remboursement.");
        machine.setState(machine.getEtatEnAttente());
    }

    @Override
    public void selectionnerBoisson() {
        System.out.println("☕ Boisson sélectionnée !");
        machine.setState(machine.getEtatDistribution());
        machine.distribuerBoisson();
    }

    @Override
    public void distribuerBoisson() {
        System.out.println("❌ Veuillez d'abord sélectionner une boisson.");
    }

    @Override
    public void remplirStock() {
        System.out.println("✅ Stock rempli !");
    }

    @Override
    public String toString() {
        return "PIÈCE INSÉRÉE";
    }
}