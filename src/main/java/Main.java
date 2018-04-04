import java.io.File;

public class Main {

    public int counter = 0;

    public static void main(String[] args) {
        Main m = new Main();
        int result = m.countFiles("/home/robertn/Documents/web_develop/recursion_dojo/TEST/1");
        System.out.println(result);
    }

    public int countFiles(String path){
        File folder = new File(path);
        File[] content = folder.listFiles();

        for(int i = 0; i < content.length; i++) {
            if(content[i].isDirectory()){
                countFiles(content[i].getPath());
            }
            else {
                counter++;
            }
        }
        return counter;
    }
}
