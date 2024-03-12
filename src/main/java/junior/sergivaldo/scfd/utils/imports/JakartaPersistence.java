package junior.sergivaldo.scfd.utils.imports;

import java.util.HashMap;
import java.util.Map;

public class JakartaPersistence {
    private static final Map<JakartaPersistenceClasses, String> imports = new HashMap<>();

    public JakartaPersistence() {
        imports.put(JakartaPersistenceClasses.ACCESS, "import jakarta.persistence.access");
        imports.put(JakartaPersistenceClasses.ACCESS_TYPE, "import jakarta.persistence.access_type");
        imports.put(JakartaPersistenceClasses.BASIC, "import jakarta.persistence.basic");
        imports.put(JakartaPersistenceClasses.CACHEABLE, "import jakarta.persistence.cacheable");
        imports.put(JakartaPersistenceClasses.CASCADE_TYPE, "import jakarta.persistence.cascade_type");
        imports.put(JakartaPersistenceClasses.COLUMN, "import jakarta.persistence.column");
        imports.put(JakartaPersistenceClasses.DISCRIMINATOR_COLUMN, "import jakarta.persistence.discriminator_column");
        imports.put(JakartaPersistenceClasses.DISCRIMINATOR_TYPE, "import jakarta.persistence.discriminator_type");
        imports.put(JakartaPersistenceClasses.DISCRIMINATOR_VALUE, "import jakarta.persistence.discriminator_value");
        imports.put(JakartaPersistenceClasses.ELEMENT_COLLECTION, "import jakarta.persistence.element_collection");
        imports.put(JakartaPersistenceClasses.EMBEDDABLE, "import jakarta.persistence.embeddable");
        imports.put(JakartaPersistenceClasses.EMBEDDED, "import jakarta.persistence.embedded");
        imports.put(JakartaPersistenceClasses.EMBEDDED_ID, "import jakarta.persistence.embedded_id");
        imports.put(JakartaPersistenceClasses.ENTITY, "import jakarta.persistence.entity");
        imports.put(JakartaPersistenceClasses.ENTITY_MANAGER, "import jakarta.persistence.entity_manager");
        imports.put(JakartaPersistenceClasses.ENTITY_MANAGER_FACTORY, "import jakarta.persistence.entity_manager_factory");
        imports.put(JakartaPersistenceClasses.ENTITY_NOT_FOUND_EXCEPTION, "import jakarta.persistence.entity_not_found_exception");
        imports.put(JakartaPersistenceClasses.ENTITY_TRANSACTION, "import jakarta.persistence.entity_transaction");
        imports.put(JakartaPersistenceClasses.ENUMERATED, "import jakarta.persistence.enumerated");
        imports.put(JakartaPersistenceClasses.FETCH_TYPE, "import jakarta.persistence.fetch_type");
        imports.put(JakartaPersistenceClasses.FIELD_RESULT, "import jakarta.persistence.field_result");
        imports.put(JakartaPersistenceClasses.FLUSH_MODE_TYPE, "import jakarta.persistence.flush_mode_type");
        imports.put(JakartaPersistenceClasses.GENERATED_VALUE, "import jakarta.persistence.generated_value");
        imports.put(JakartaPersistenceClasses.GENERATION_TYPE, "import jakarta.persistence.generation_type");
        imports.put(JakartaPersistenceClasses.ID, "import jakarta.persistence.id");
        imports.put(JakartaPersistenceClasses.ID_CLASS, "import jakarta.persistence.id_class");
        imports.put(JakartaPersistenceClasses.INDEX, "import jakarta.persistence.index");
        imports.put(JakartaPersistenceClasses.INHERITANCE, "import jakarta.persistence.inheritance");
        imports.put(JakartaPersistenceClasses.JOIN_COLUMN, "import jakarta.persistence.join_column");
        imports.put(JakartaPersistenceClasses.JOIN_COLUMNS, "import jakarta.persistence.join_columns");
        imports.put(JakartaPersistenceClasses.JOIN_TABLE, "import jakarta.persistence.join_table");
        imports.put(JakartaPersistenceClasses.LOB, "import jakarta.persistence.lob");
        imports.put(JakartaPersistenceClasses.LOCK_MODE_TYPE, "import jakarta.persistence.lock_mode_type");
        imports.put(JakartaPersistenceClasses.MANY_TO_ONE, "import jakarta.persistence.many_to_one");
        imports.put(JakartaPersistenceClasses.MANY_TO_MANY, "import jakarta.persistence.many_to_many");
        imports.put(JakartaPersistenceClasses.MAP_KEY, "import jakarta.persistence.map_key");
        imports.put(JakartaPersistenceClasses.MAP_KEY_CLASS, "import jakarta.persistence.map_key_class");
        imports.put(JakartaPersistenceClasses.MAP_KEY_COLUMN, "import jakarta.persistence.map_key_column");
        imports.put(JakartaPersistenceClasses.MAP_KEY_ENUMERATED, "import jakarta.persistence.map_key_enumerated");
        imports.put(JakartaPersistenceClasses.MAP_KEY_JOIN_COLUMN, "import jakarta.persistence.map_key_join_column");
        imports.put(JakartaPersistenceClasses.MAP_KEY_JOIN_COLUMNS, "import jakarta.persistence.map_key_join_columns");
        imports.put(JakartaPersistenceClasses.MAP_KEY_TEMPORAL, "import jakarta.persistence.map_key_temporal");
        imports.put(JakartaPersistenceClasses.MAPPED_SUPERCLASS, "import jakarta.persistence.mapped_superclass");
        imports.put(JakartaPersistenceClasses.MAPS_ID, "import jakarta.persistence.maps_id");
        imports.put(JakartaPersistenceClasses.NAMED_NATIVE_QUERIES, "import jakarta.persistence.named_native_queries");
        imports.put(JakartaPersistenceClasses.NAMED_NATIVE_QUERY, "import jakarta.persistence.named_native_query");
        imports.put(JakartaPersistenceClasses.NAMED_QUERIES, "import jakarta.persistence.named_queries");
        imports.put(JakartaPersistenceClasses.NAMED_QUERY, "import jakarta.persistence.named_query");
        imports.put(JakartaPersistenceClasses.NAMED_STORED_PROCEDURE_QUERIES, "import jakarta.persistence.named_stored_procedure_queries");
        imports.put(JakartaPersistenceClasses.NAMED_STORED_PROCEDURE_QUERY, "import jakarta.persistence.named_stored_procedure_query");
        imports.put(JakartaPersistenceClasses.ONE_TO_MANY, "import jakarta.persistence.one_to_many");
        imports.put(JakartaPersistenceClasses.ONE_TO_ONE, "import jakarta.persistence.one_to_one");
        imports.put(JakartaPersistenceClasses.ORDER_BY, "import jakarta.persistence.order_by");
        imports.put(JakartaPersistenceClasses.ORDER_COLUMN, "import jakarta.persistence.order_column");
        imports.put(JakartaPersistenceClasses.PERSISTENCE, "import jakarta.persistence.persistence");
        imports.put(JakartaPersistenceClasses.PERSISTENCE_CONTEXT, "import jakarta.persistence.persistence_context");
        imports.put(JakartaPersistenceClasses.PERSISTENCE_CONTEXT_TYPE, "import jakarta.persistence.persistence_context_type");
        imports.put(JakartaPersistenceClasses.PERSISTENCE_PROPERTY, "import jakarta.persistence.persistence_property");
        imports.put(JakartaPersistenceClasses.PERSISTENCE_UNIT, "import jakarta.persistence.persistence_unit");
        imports.put(JakartaPersistenceClasses.PERSISTENCE_UNITS, "import jakarta.persistence.persistence_units");
        imports.put(JakartaPersistenceClasses.PERSISTENCE_UTIL, "import jakarta.persistence.persistence_util");
        imports.put(JakartaPersistenceClasses.POST_LOAD, "import jakarta.persistence.post_load");
        imports.put(JakartaPersistenceClasses.POST_PERSIST, "import jakarta.persistence.post_persist");
        imports.put(JakartaPersistenceClasses.POST_REMOVE, "import jakarta.persistence.post_remove");
        imports.put(JakartaPersistenceClasses.POST_UPDATE, "import jakarta.persistence.post_update");
        imports.put(JakartaPersistenceClasses.PRE_PERSIST, "import jakarta.persistence.pre_persist");
        imports.put(JakartaPersistenceClasses.PRE_REMOVE, "import jakarta.persistence.pre_remove");
        imports.put(JakartaPersistenceClasses.PRE_UPDATE, "import jakarta.persistence.pre_update");
        imports.put(JakartaPersistenceClasses.PRIMARY_KEY_JOIN_COLUMN, "import jakarta.persistence.primary_key_join_column");
        imports.put(JakartaPersistenceClasses.PRIMARY_KEY_JOIN_COLUMNS, "import jakarta.persistence.primary_key_join_columns");
        imports.put(JakartaPersistenceClasses.QUERY, "import jakarta.persistence.query");
        imports.put(JakartaPersistenceClasses.QUERY_HINT, "import jakarta.persistence.query_hint");
        imports.put(JakartaPersistenceClasses.QUERY_HINTS, "import jakarta.persistence.query_hints");
        imports.put(JakartaPersistenceClasses.READ_ONLY, "import jakarta.persistence.read_only");
        imports.put(JakartaPersistenceClasses.ROLLBACK_EXCEPTION, "import jakarta.persistence.rollback_exception");
        imports.put(JakartaPersistenceClasses.SECONDARY_TABLE, "import jakarta.persistence.secondary_table");
        imports.put(JakartaPersistenceClasses.SECONDARY_TABLES, "import jakarta.persistence.secondary_tables");
        imports.put(JakartaPersistenceClasses.SEQUENCE_GENERATOR, "import jakarta.persistence.sequence_generator");
        imports.put(JakartaPersistenceClasses.SHARED_CACHE_MODE, "import jakarta.persistence.shared_cache_mode");
        imports.put(JakartaPersistenceClasses.SQL_RESULT_SET_MAPPING, "import jakarta.persistence.sql_result_set_mapping");
        imports.put(JakartaPersistenceClasses.SQL_RESULT_SET_MAPPINGS, "import jakarta.persistence.sql_result_set_mappings");
        imports.put(JakartaPersistenceClasses.STORED_PROCEDURE_PARAMETER, "import jakarta.persistence.stored_procedure_parameter");
        imports.put(JakartaPersistenceClasses.STORED_PROCEDURE_QUERY, "import jakarta.persistence.stored_procedure_query");
        imports.put(JakartaPersistenceClasses.SUBGRAPH, "import jakarta.persistence.subgraph");
        imports.put(JakartaPersistenceClasses.SYNCHRONIZATION_TYPE, "import jakarta.persistence.synchronization_type");
        imports.put(JakartaPersistenceClasses.TABLE, "import jakarta.persistence.table");
        imports.put(JakartaPersistenceClasses.TABLE_GENERATOR, "import jakarta.persistence.table_generator");
        imports.put(JakartaPersistenceClasses.TEMPORAL, "import jakarta.persistence.temporal");
        imports.put(JakartaPersistenceClasses.TEMPORAL_TYPE, "import jakarta.persistence.temporal_type");
        imports.put(JakartaPersistenceClasses.TRANSIENT, "import jakarta.persistence.transient");
        imports.put(JakartaPersistenceClasses.TUPLE, "import jakarta.persistence.tuple");
        imports.put(JakartaPersistenceClasses.TUPLE_ELEMENT, "import jakarta.persistence.tuple_element");
        imports.put(JakartaPersistenceClasses.TYPED_QUERY, "import jakarta.persistence.typed_query");
        imports.put(JakartaPersistenceClasses.UNIQUE_CONSTRAINT, "import jakarta.persistence.unique_constraint");
        imports.put(JakartaPersistenceClasses.VERSION, "import jakarta.persistence.version");

    }

    public String getImport(JakartaPersistenceClasses nameClass){
        return imports.get(nameClass);
    }
    enum JakartaPersistenceClasses{
        ACCESS,
        ACCESS_TYPE,
        BASIC,
        CACHEABLE,
        CASCADE_TYPE,
        COLUMN,
        DISCRIMINATOR_COLUMN,
        DISCRIMINATOR_TYPE,
        DISCRIMINATOR_VALUE,
        ELEMENT_COLLECTION,
        EMBEDDABLE,
        EMBEDDED,
        EMBEDDED_ID,
        ENTITY,
        ENTITY_MANAGER,
        ENTITY_MANAGER_FACTORY,
        ENTITY_NOT_FOUND_EXCEPTION,
        ENTITY_TRANSACTION,
        ENUMERATED,
        FETCH_TYPE,
        FIELD_RESULT,
        FLUSH_MODE_TYPE,
        GENERATED_VALUE,
        GENERATION_TYPE,
        ID,
        ID_CLASS,
        INDEX,
        INHERITANCE,
        JOIN_COLUMN,
        JOIN_COLUMNS,
        JOIN_TABLE,
        LOB,
        LOCK_MODE_TYPE,
        MANY_TO_ONE,
        MANY_TO_MANY,
        MAP_KEY,
        MAP_KEY_CLASS,
        MAP_KEY_COLUMN,
        MAP_KEY_ENUMERATED,
        MAP_KEY_JOIN_COLUMN,
        MAP_KEY_JOIN_COLUMNS,
        MAP_KEY_TEMPORAL,
        MAPPED_SUPERCLASS,
        MAPS_ID,
        NAMED_NATIVE_QUERIES,
        NAMED_NATIVE_QUERY,
        NAMED_QUERIES,
        NAMED_QUERY,
        NAMED_STORED_PROCEDURE_QUERIES,
        NAMED_STORED_PROCEDURE_QUERY,
        ONE_TO_MANY,
        ONE_TO_ONE,
        ORDER_BY,
        ORDER_COLUMN,
        PERSISTENCE,
        PERSISTENCE_CONTEXT,
        PERSISTENCE_CONTEXT_TYPE,
        PERSISTENCE_PROPERTY,
        PERSISTENCE_UNIT,
        PERSISTENCE_UNITS,
        PERSISTENCE_UTIL,
        POST_LOAD,
        POST_PERSIST,
        POST_REMOVE,
        POST_UPDATE,
        PRE_PERSIST,
        PRE_REMOVE,
        PRE_UPDATE,
        PRIMARY_KEY_JOIN_COLUMN,
        PRIMARY_KEY_JOIN_COLUMNS,
        QUERY,
        QUERY_HINT,
        QUERY_HINTS,
        READ_ONLY,
        ROLLBACK_EXCEPTION,
        SECONDARY_TABLE,
        SECONDARY_TABLES,
        SEQUENCE_GENERATOR,
        SHARED_CACHE_MODE,
        SQL_RESULT_SET_MAPPING,
        SQL_RESULT_SET_MAPPINGS,
        STORED_PROCEDURE_PARAMETER,
        STORED_PROCEDURE_QUERY,
        SUBGRAPH,
        SYNCHRONIZATION_TYPE,
        TABLE,
        TABLE_GENERATOR,
        TEMPORAL,
        TEMPORAL_TYPE,
        TRANSIENT,
        TUPLE,
        TUPLE_ELEMENT,
        TYPED_QUERY,
        UNIQUE_CONSTRAINT,
        VERSION;

    }
}
