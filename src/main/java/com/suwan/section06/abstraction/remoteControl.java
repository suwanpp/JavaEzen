package com.suwan.section06.abstraction;

public class remoteControl {

    private final Tv remoteControl = new Tv();

    public void turnOn(){
        remoteControl.turnOn();
    }

    public void volumeUp(){
        remoteControl.volumeUp();
    }

    public void channelUp(){
        remoteControl.channelUp();
    }

    public void mute(){
        remoteControl.mute();
    }

    public void channelZero(){
        remoteControl.channelZero();
    }

    public void turnOff(){
        remoteControl.turnOff();
    }
}
