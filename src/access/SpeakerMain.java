package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

//        필드(클래스 내의 변수) 직접 접근
//        Speaker class의 내부 변수는 private이라서 접근이 불가하다.
//        System.out.println("음량에 직접 접근 후에 수정");
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
