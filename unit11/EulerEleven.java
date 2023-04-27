package unit11;
import java.io.File;
import java.lang.Object;
import java.nio.file.Files;
import java.nio.file.Path;

public class EulerEleven{

    int[][] grid = new int[20][20];
    public EulerEleven(){
        
        //File myGrid = new File("EulerElevenGrid.txt");
        //Path path = new Path.get("myGrid");
        Path path = new Path("EulerElevenGrid.txt");
        Path filePath = Path.of("c:/temp/demo.txt");
        String content = Files.readString(myGrid);
        int[] nums = EulerElevenGrid.split(" ");
        

        grid[0] = 

    }
    public static void main(String[] args) {
        
    }
    
}