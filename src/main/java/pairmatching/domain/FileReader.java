package pairmatching.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.informtaion.Course;

public class FileReader {

    private FileReader() {

    }

    public static List<String> getCrewNames(Course course) {
        try {
            File file = new File(course.getPath());
            java.io.FileReader fileReader = new java.io.FileReader(file);
            BufferedReader bufReader = new BufferedReader(fileReader);
            List<String> crews = new ArrayList<>();

            String crewName = "";
            while ((crewName = bufReader.readLine()) != null) {
                crews.add(crewName);
            }
            return crews;
        } catch (IOException e) {
            throw new IllegalArgumentException("[ERROR] 파일 에러");
        }
    }
}
