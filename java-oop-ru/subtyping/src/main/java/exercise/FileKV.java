package exercise;

import java.util.HashMap;
import java.util.Map;

public class FileKV implements KeyValueStorage {
    private String filePath;

    public FileKV(String filePath, Map<String, String> map) {
        this.filePath = filePath;
        writeDataToFile(map);  // Записываем начальные данные сразу
    }

    private Map<String, String> readDataFromFile() {
        String content = Utils.readFile(filePath);
        return content.isEmpty() ? new HashMap<>() : Utils.deserialize(content);
    }

    private void writeDataToFile(Map<String, String> data) {
        if (data.isEmpty()) {
            System.out.println("Warning: Attempting to write empty data.");
        }
        String serializedData = Utils.serialize(data);
        System.out.println("Writing to file: " + serializedData);
        Utils.writeFile(filePath, serializedData);  // Запись данных в файл
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> data = readDataFromFile();
        data.put(key, value);  // Обновляем данные
        writeDataToFile(data);  // Записываем обновленные данные в файл
    }

    @Override
    public void unset(String key) {
        Map<String, String> data = readDataFromFile();
        data.remove(key);  // Удаляем ключ
        writeDataToFile(data);  // Записываем обновленные данные в файл
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> data = readDataFromFile();
        return data.getOrDefault(key, defaultValue);  // Получаем значение по ключу
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(readDataFromFile());  // Возвращаем текущие данные
    }
}
