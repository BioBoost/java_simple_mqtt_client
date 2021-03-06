# Simple MQTT Library in Java

Wrapper library for the PAHO MQTT Client that makes it easier to use mqtt.

## How to add library

Add the JitPack repository to your `pom.xml` file:

```xml
<project>
  ...
  <repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
  </repositories>
```

Add the dependency

```xml
<project>
  ...
  <dependencies>
    ...
    <dependency>
        <groupId>com.github.BioBoost</groupId>
        <artifactId>java_simple_mqtt_client</artifactId>
        <version>0.2.0</version>
    </dependency>
  </dependencies>
```

## Example

Import the library

```java
import be.biosplanet.bioboost.mqtt.simple_mqtt_client.SimpleMQTTClient;
```

Create a new MQTT client:

```java
SimpleMQTTClient client = new SimpleMQTTClient();
```

Publishing messages to a topic:

```java
client.publish("test/oop2/hello_world", "Hello world from Java");
  // Topic: "test/oop2/hello_world"
  // Message: "Hello world from Java"
```

Subscribing to incoming messages from a topic:

```java
client.subscribe("test/oop2/incoming", new IMQTTMessageHandler(){
  @Override
  public void messageArrived(String topic, String message) {
    System.out.println("Received message " + message + " on topic " + topic);
  }
});
```

or implement the interface `IMQTTMessageHandler` and register the instance as a handler.