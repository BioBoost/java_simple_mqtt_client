package be.biosplanet.bioboost.mqtt.simple_mqtt_client;

/**
 *
 * @author BioBoost
 */
public interface IMQTTMessageHandler {
  public void messageArrived(String message, String topic);
}