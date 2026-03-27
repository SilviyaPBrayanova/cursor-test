package com.example.demo.kafkaStreamsTopologies;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.springframework.stereotype.Component;

@Component
public class TopologyGenerator {

    private final StreamsBuilder streamsBuilder;

    public TopologyGenerator() {
        this.streamsBuilder = new StreamsBuilder();
    }

    public Topology buildTopology() {
        return streamsBuilder.build();
    }
}
