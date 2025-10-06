package org.example.state;

/**
 * État concret : Distribution de la boisson en cours
 */
public class EtatDistribution implements State {

    private MachineBoisson machine;

    public EtatDistribution(MachineBoisson machine) {
        this.machine = machine;
    }

    @Override
    public void insererPiece() {
        System.out.println("❌ Veuillez patienter, distribution en cours...");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("❌ Trop tard ! La boisson est en cours de distribution.");
    }

    @Override
    public void selectionnerBoisson() {
        System.out.println("❌ Distribution en cours...");
    }

    @Override
    public void distribuerBoisson() {
        System.out.println("🥤 Distribution en cours...");
        System.out.println("🥤 Glou glou glou...");
        System.out.println("✅ Voici votre boisson ! Bonne dégustation !");

        machine.diminuerStock();

        if (machine.getStock() > 0) {
            machine.setState(machine.getEtatEnAttente());
        } else {
            System.out.println("⚠️  Plus de boisson disponible !");
            machine.setState(machine.getEtatRupture());
        }
    }

    @Override
    public void remplirStock() {
        System.out.println("❌ Impossible de remplir pendant la distribution.");
    }

    @Override
    public String toString() {
        return "DISTRIBUTION";
    }
}