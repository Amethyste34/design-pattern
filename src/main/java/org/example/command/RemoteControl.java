package org.example.command;

import java.util.Stack;

/**
 * Invocateur (Invoker) : télécommande universelle
 * Ne connaît pas les détails des appareils, travaille uniquement avec des commandes
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> commandHistory;

    public RemoteControl() {
        onCommands = new Command[7]; // 7 boutons
        offCommands = new Command[7];
        commandHistory = new Stack<>();

        // Initialisation avec une commande vide (pattern Null Object)
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * Configure un bouton avec une paire de commandes ON/OFF
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot >= 0 && slot < 7) {
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    /**
     * Appuie sur le bouton ON
     */
    public void onButtonPressed(int slot) {
        if (slot >= 0 && slot < 7) {
            onCommands[slot].execute();
            commandHistory.push(onCommands[slot]);
        }
    }

    /**
     * Appuie sur le bouton OFF
     */
    public void offButtonPressed(int slot) {
        if (slot >= 0 && slot < 7) {
            offCommands[slot].execute();
            commandHistory.push(offCommands[slot]);
        }
    }

    /**
     * Annule la dernière commande exécutée
     */
    public void undoButtonPressed() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            System.out.println("↩️  Annulation de la dernière commande...");
            lastCommand.undo();
        } else {
            System.out.println("❌ Aucune commande à annuler");
        }
    }

    /**
     * Affiche l'état de la télécommande
     */
    public void displayStatus() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║   TÉLÉCOMMANDE UNIVERSELLE             ║");
        System.out.println("╠════════════════════════════════════════╣");
        for (int i = 0; i < 7; i++) {
            System.out.printf("║ [%d] %s | %s%n",
                    i,
                    onCommands[i].getClass().getSimpleName(),
                    offCommands[i].getClass().getSimpleName());
        }
        System.out.println("╚════════════════════════════════════════╝");
    }

    /**
     * Commande vide (pattern Null Object)
     */
    private class NoCommand implements Command {
        @Override
        public void execute() {
            System.out.println("⚠️  Aucune commande assignée à ce bouton");
        }

        @Override
        public void undo() {
            // Ne fait rien
        }
    }
}