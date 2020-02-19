import Objects.Player;
import com.github.TeamCarter.Frame.Canvas;
import com.github.TeamCarter.Frame.Controls;

public class Main {
    public static void main(String[] args) {

        Canvas canvas= new Canvas(423, 850);
        canvas.makeCanvas();

        Player player = new Player();
        player.spawn();

        Controls controls = new Controls();
        controls.setPlayerObject(player);
        controls.init();


    }
}
