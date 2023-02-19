package utils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonReaderUtils {

    private static Map<String, Boolean> test_data = new HashMap<>();

    public static  Map<String, Boolean> getTest_data() {
      if(test_data.isEmpty())
      {
          fileToTestData();
      }
        return test_data;
    }

    private static Map<String, String> config = new HashMap<>();
    public static String getValueByKey(String key) {
        if(config.isEmpty())
        {
            fileToConfig();
        }
        return config.get(key);
    }


    public static void fileToTestData() {
        File file = new File("src/main/resources/test_data.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            test_data = objectMapper.readValue(file, new TypeReference<>() {
            });
        } catch (IOException e) {
             throw new RuntimeException(e);
        }
    }
    public static void fileToConfig() {
        File file = new File("src/main/resources/config_data.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            config = objectMapper.readValue(file, new TypeReference<>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}