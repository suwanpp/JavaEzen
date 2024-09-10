package com.suwan.section06.abstraction;

public class Tv {

    private boolean isOn;
    private int volume;
    private int channel;

    public void turnOn(){
        if(isOn){
            System.out.println("티비가 이미 켜져있습니다.");
        } else{
            this.isOn = true;
            System.out.println("티비가 켜졌습니다.");
        }
    }

    public void channelUp(){
        if(isOn){
            System.out.println("채널을 1 올립니다.");
            this.channel += 1;
            System.out.println("현재 채널은 " + this.channel + "번 이고, 볼륨은 " + this.volume + "입니다.");
        }else {
            System.out.println("티비가 꺼져있습니다. 티비를 먼저 켜주세요 ");
        }
    }

    public void volumeUp(){
        if(isOn){
            System.out.println("볼륨을 10 올립니다.");
            this.volume += 10;
            System.out.println("현재 볼륨의 크기는 " + this.volume + "이고, 채널은 " + this.channel + "번 입니다.");
        }else{
            System.out.println("티비가 꺼져있습니다. 티비를 먼저 켜주세요");
        }
    }

    public void channelZero(){
        if(isOn){
            if(channel > 0){
                this.channel = 0;
                System.out.println("채널이 0번이 되었습니다. 현재 채널은 " + this.channel + "번 이고, 볼륨의 크기는 " + this.volume + "입니다.");
            }else {
                System.out.println("이미 채널이 0번입니다.");
            }
        }else{
            System.out.println("티비가 꺼져있습니다. 티비를 먼저 켜주세요");
        }
    }

    public void mute(){
        if(isOn){
            if(volume > 0){
                this.volume = 0;
                System.out.println("음소거가 되었습니다. 현재 볼륨의 크기는 " + this.volume +"이고, 채널은 " + this.channel + "번 입니다.");
            }else {
                System.out.println("이미 볼륨이 0입니다.");
            }
        }else {
            System.out.println("티비가 꺼져있습니다. 티비를 먼저 켜주세요");
        }
    }

    public void turnOff(){
        if(isOn){
            if(volume > 0 && channel > 0){
                System.out.println("볼륨과 채널을 모두 0으로 만들어주세요");
            } else if ( volume == 0 && channel > 0) {
                System.out.println("채널을 0번으로 만들어주세요");
            } else if( volume > 0 && channel ==0 ){
                System.out.println("볼륨을 0으로 줄여주세요");
            } else {
                this.isOn = false;
                System.out.println("티비가 꺼졌습니다.");
            }
        }else {
            System.out.println("티비가 꺼져있는 상태입니다. ");
        }
    }
}
