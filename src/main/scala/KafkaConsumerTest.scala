import java.util.{Collections, Properties}

import org.apache.kafka.clients.consumer.KafkaConsumer
object KafkaConsumerTest {
  def main(args:Array[String]): Unit ={
    val props=getKafkaProperties()
    val consumer=new KafkaConsumer[String,String](props);
    consumer.subscribe(Collections.singletonList())

  }

  def getKafkaProperties():Properties={
    val props=new Properties()
    props.setProperty("bootstrap.servers","192.168.172.130:9092")
    props.setProperty("group.id","test")
    props.setProperty("enable.auto.commit","true");
    props.setProperty("auto.commit.interval.ms","1000")
    props.setProperty("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer")
    props.setProperty("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props
  }

}
