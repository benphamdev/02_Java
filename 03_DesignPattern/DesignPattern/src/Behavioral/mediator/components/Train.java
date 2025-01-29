package Behavioral.mediator.components;

import Behavioral.mediator.mediator.Mediator;

public abstract class Train {
    protected Mediator mediator;

    protected Train(Mediator mediator) {this.mediator = mediator;}

    public abstract void arrive();

    public abstract void depart();

    public abstract void permitArrival();
}
