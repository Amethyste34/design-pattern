package org.example.command;

/**
 * Commande concrète : éteindre un ventilateur
 */
public class FanOffCommand implements Command {

    private Fan fan;
    private int previousSpeed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.turnOff();
    }

    @Override
    public void undo() {
        if (previousSpeed > 0) {
            fan.setSpeed(previousSpeed);
        }
    }
}