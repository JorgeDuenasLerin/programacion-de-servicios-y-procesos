// Java code illustrating start() method
import java.io.*;
import java.lang.*;
import java.util.*;
class ProcessBuilderPow {
    public static void main(String[] arg) throws IOException
    {
        // creating list of commands
        /*List<String> commands = new ArrayList<String>();
        commands.add("ls"); // command
        commands.add("-l"); // command
        commands.add("/home/alumno"); // command in Mac OS*/
        String [] commands = {
            "./pow"
        };
 
        // creating the process
        ProcessBuilder pb = new ProcessBuilder(commands);
 
        // starting the process
        Process process = pb.start();
 
        BufferedWriter stdOut = new BufferedWriter(
                    new OutputStreamWriter(
                        process.getOutputStream()
                    )
                );
        //stdOut.write('9');
        ///stdOut.write("\n");
        stdOut.write("9\n");
        //stdOut.flush();
        stdOut.close();

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