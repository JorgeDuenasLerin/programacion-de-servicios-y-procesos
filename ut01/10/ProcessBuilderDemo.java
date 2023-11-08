// Java code illustrating start() method
import java.io.*;
import java.lang.*;
import java.util.*;
class ProcessBuilderDemo {
    public static void main(String[] arg) throws IOException
    {
        // creating list of commands
        /*List<String> commands = new ArrayList<String>();
        commands.add("ls"); // command
        commands.add("-l"); // command
        commands.add("/home/alumno"); // command in Mac OS*/
        String [] commands = {
            "ls",
            "-l",
            arg[1]
        };
 
        // creating the process
        ProcessBuilder pb = new ProcessBuilder("ls", "-l");
 
        // starting the process
        Process process = pb.start();
 
        // for reading the output from stream
        BufferedReader stdInput
            = new BufferedReader(new InputStreamReader(
                process.getInputStream()));
        String s = null;
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
    }
}