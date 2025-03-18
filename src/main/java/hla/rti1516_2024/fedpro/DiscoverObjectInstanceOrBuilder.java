// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface DiscoverObjectInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.DiscoverObjectInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return Whether the objectInstance field is set.
   */
  boolean hasObjectInstance();
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   * @return The objectInstance.
   */
  hla.rti1516_2024.fedpro.ObjectInstanceHandle getObjectInstance();
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 1;</code>
   */
  hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 2;</code>
   * @return Whether the objectClass field is set.
   */
  boolean hasObjectClass();
  /**
   * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 2;</code>
   * @return The objectClass.
   */
  hla.rti1516_2024.fedpro.ObjectClassHandle getObjectClass();
  /**
   * <code>.rti1516_2024.fedpro.ObjectClassHandle objectClass = 2;</code>
   */
  hla.rti1516_2024.fedpro.ObjectClassHandleOrBuilder getObjectClassOrBuilder();

  /**
   * <code>string objectInstanceName = 3;</code>
   * @return The objectInstanceName.
   */
  java.lang.String getObjectInstanceName();
  /**
   * <code>string objectInstanceName = 3;</code>
   * @return The bytes for objectInstanceName.
   */
  com.google.protobuf.ByteString
      getObjectInstanceNameBytes();

  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 4;</code>
   * @return Whether the producingFederate field is set.
   */
  boolean hasProducingFederate();
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 4;</code>
   * @return The producingFederate.
   */
  hla.rti1516_2024.fedpro.FederateHandle getProducingFederate();
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 4;</code>
   */
  hla.rti1516_2024.fedpro.FederateHandleOrBuilder getProducingFederateOrBuilder();
}
