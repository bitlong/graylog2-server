package org.graylog2.indexer.messages;

import org.graylog2.indexer.IndexFailure;
import org.graylog2.indexer.results.ResultMessage;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public interface MessagesAdapter {
    ResultMessage get(String messageId, String index) throws IOException, DocumentNotFoundException;

    List<String> analyze(String toAnalyze, String index, String analyzer) throws IOException;

    List<IndexFailure> bulkIndex(List<IndexingRequest> messageList, Consumer<Long> successCallback);
}
