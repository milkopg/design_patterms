package design_patterns.com.milko.training.kafka.getting_started.simple;

import org.apache.kafka.clients.producer.*;

import java.text.*;
import java.util.*;

public class ProducerApp {
    public static void main(String[] args){

        // Create the Properties class to instantiate the Consumer with the desired settings:
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092, localhost:9093, localhost:9094");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("acks", "0"); // Delivery guarantee 0-fire and forget,  1-leader acknowledged , 2-repliation quorum acknowledged 
//        props.put("buffer.memory", 33554432); //limit of maximum used memory send to broker 
//        props.put("compression.type", "none"); // compression type of sent messages
//        props.put("retries", 0); //Broker respond with error - numbers with retries
//        props.put("retry.backoff.ms", 5); // delay in ms between retries 
//        props.put("batch.size", 16384); //maximum number of size of each record in bytes
//        props.put("client.id", "");
//        props.put("linger.ms", 0); //delay in ms until current record batch size == batch.size
//        props.put("max.block.ms", 60000); //if high volume occurs with high memory usage, how many ms to to be blocked before send buffer  
//        props.put("max.request.size", 1048576);
//        props.put("partitioner.class", "org.apache.kafka.clients.producer.internals.DefaultPartitioner");
//        props.put("request.timeout.ms", 30000);
//        props.put("timeout.ms", 30000);
//        props.put("max.in.flight.requests.per.connection", 5);

        KafkaProducer<String, String> myProducer = new KafkaProducer<String, String>(props);
        DateFormat dtFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        String topic = "replicated_topic_1";

        
        int numberOfRecords = 10; // number of records to send
        long sleepTimer = 1000; // how long you want to wait before the next record to be sent

        try {
                for (int i = 0; i < numberOfRecords; i++ ) {
             //       myProducer.send(new ProducerRecord<String, String>(topic, String.format("new Message from Milko: %s  sent at %s", Integer.toString(i), dtFormat.format(new Date()))));
                	myProducer.send(new ProducerRecord<String, String>(topic, "Demo1", "My Message Delay" + i));
                    Thread.sleep(sleepTimer);
                     //Thread.sleep(new Random(5000).nextLong()); // use if you want to randomize the time between record sends
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myProducer.close();
        }

    }
}
