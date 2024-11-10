package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        // Получаем текущие данные в базе данных
        Map<String, String> originalMap = storage.toMap();
        Map<String, String> swappedMap = new HashMap<>();

        // Меняем местами ключи и значения
        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        // Очищаем все записи из хранилища
        originalMap.forEach((key, value) -> storage.unset(key));

        // Добавляем новые пары с поменявшимися ключами и значениями
        swappedMap.forEach(storage::set);
    }
}
