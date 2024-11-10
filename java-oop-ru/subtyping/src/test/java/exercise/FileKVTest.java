package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.HashMap;

class FileKVTest {

    private static final String FILE_PATH = "src/test/resources/file";
    private FileKV storage;

    @BeforeEach
    public void beforeEach() throws Exception {
        // Очищаем файл перед каждым тестом
        storage = new FileKV(FILE_PATH, Map.of("key1", "value1", "key2", "value2"));
    }

    @Test
    void testGetExistingKey() {
        assertEquals("value1", storage.get("key1", "default"));
        assertEquals("value2", storage.get("key2", "default"));
    }

    @Test
    void testGetNonExistingKey() {
        assertEquals("default", storage.get("nonExistingKey", "default"));
    }

    @Test
    void testSetAndGet() {
        storage.set("key3", "value3");
        assertEquals("value3", storage.get("key3", "default"));
    }

    @Test
    void testUnsetExistingKey() {
        storage.unset("key1");
        assertEquals("default", storage.get("key1", "default"));
    }

    @Test
    void testUnsetNonExistingKey() {
        storage.unset("nonExistingKey"); // Не должно выбрасывать исключений
        assertEquals("default", storage.get("nonExistingKey", "default"));
    }

    @Test
    void testToMap() {
        Map<String, String> expectedData = new HashMap<>(Map.of("key1", "value1", "key2", "value2"));
        assertEquals(expectedData, storage.toMap());
    }
}
