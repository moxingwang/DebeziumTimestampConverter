package top.moxingwang.debezium.smt;

import org.apache.kafka.connect.data.Schema;

/**
 * Created by svegesna on 9/29/17.
 */
public interface OptionalTypeFieldSchema {
    /**
     * @return the optional schema.
     */
    Schema optionalSchemaNonTimestamp();
}
