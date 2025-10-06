package org.example.command;

/**
 * Commande concrète : allumer un ventilateur
 */
public class FanOnCommand implements Command {

    private Fan fan;
    private int previousSpeed;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.turnOn();
    }

    @Override
    public void undo() {
        if (previousSpeed == 0) {
            fan.turnOff();
        } else {
            fan.setSpeed(previousSpeed);
        }
    }
}