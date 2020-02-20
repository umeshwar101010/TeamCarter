import Objects.Player;
import com.github.TeamCarter.Frame.Canvas;
import com.github.TeamCarter.Frame.Controls;
import org.academiademiadecodigo.hackstreetboys.teamcarter.Audio;
import org.academiademiadecodigo.hackstreetboys.teamcarter.Music;

public class Main {
    public static void main(String[] args) {

        Canvas canvas= new Canvas(423, 850);
        canvas.makeCanvas();


        //Music starts after canvas is made
        Audio audio = new Audio();
        audio.startAudio();

        Player player = new Player();
        player.spawn();

        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();


    }
}
