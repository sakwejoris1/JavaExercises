// Exercise 17.10 (Summarizing the File Types in a Directory)
// Asks for a directory path, then uses a Stream<Path> together with lambdas
// to count how many files of each extension (.txt, .java, etc.) are there.
//
// NOTE ON DirectoryStream.entries(): the exercise text describes a default
// method named entries() on interface DirectoryStream that returns a
// Stream<Path>. That method does not actually exist in any released version
// of the JDK (checked on JDK 21) - DirectoryStream only provides an
// Iterator. The real, standard way to get a Stream<Path> for a directory's
// contents is Files.list(directory), so that's what this program uses; it
// accomplishes exactly what the exercise is asking for.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryFileTypeSummary {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory path: ");
        String dirPath = input.nextLine();

        Path directory = Paths.get(dirPath);

        if (!Files.isDirectory(directory)) {
            System.out.println("That is not a valid directory.");
            return;
        }

        try (Stream<Path> directoryStream = Files.list(directory)) {
            Map<String, Long> extensionCounts = directoryStream
                .filter(Files::isRegularFile)
                .map(DirectoryFileTypeSummary::getExtension)
                .collect(Collectors.groupingBy(extension -> extension, Collectors.counting()));

            System.out.println("\nFile type summary for: " + dirPath);
            extensionCounts.forEach((extension, count) ->
                System.out.println("." + extension + " -> " + count + " file(s)"));
        }
    }

    // Returns the part of the file name after the last dot (its extension)
    private static String getExtension(Path path) {
        String name = path.getFileName().toString();
        int dotIndex = name.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == name.length() - 1) {
            return "(no extension)";
        }
        return name.substring(dotIndex + 1);
    }
}
