package ru.gx.core.redis.load;

/**
 * Ошибки при загрузке и обработке входящих сообщений.
 */
@SuppressWarnings("unused")
public class RedisIncomeLoadingException extends RuntimeException {
    public RedisIncomeLoadingException(String message) {
        super(message);
    }
}
