package org.graylog2.indexer.messages;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.auto.value.AutoValue;
import org.graylog2.indexer.IndexSet;
import org.graylog2.plugin.Message;

import javax.validation.constraints.NotNull;

@AutoValue
@JsonAutoDetect
public abstract class IndexingRequest {
    public abstract IndexSet indexSet();
    public abstract Message message();

    public static IndexingRequest create(@NotNull IndexSet indexSet, @NotNull Message message) {
        return new AutoValue_IndexingRequest(indexSet, message);
    }

}
