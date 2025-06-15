package access;

public class Speaker {
    private int volume; // private 접근 제어자를 사용해서 외부 접근을 방지

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량은 100 입니다.");
        }else{
            volume += 10;
            System.out.println("음량이 10 증가 됩니다.");
        }
    }

    void volumeDown(){
        if(volume <= 0){
            System.out.println("최소 음량은 0 입니다.");
        }else{
            volume -= 10;
            System.out.println("음량이 10 감소 됩니다.");
        }
    }

    void showVolume(){
        System.out.println("현재 음량: " + this.volume);
    }
}
