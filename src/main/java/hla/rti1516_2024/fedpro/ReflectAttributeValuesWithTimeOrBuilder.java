// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface ReflectAttributeValuesWithTimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.ReflectAttributeValuesWithTime)
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
   * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   * @return Whether the attributeValues field is set.
   */
  boolean hasAttributeValues();
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   * @return The attributeValues.
   */
  hla.rti1516_2024.fedpro.AttributeHandleValueMap getAttributeValues();
  /**
   * <code>.rti1516_2024.fedpro.AttributeHandleValueMap attributeValues = 2;</code>
   */
  hla.rti1516_2024.fedpro.AttributeHandleValueMapOrBuilder getAttributeValuesOrBuilder();

  /**
   * <code>bytes userSuppliedTag = 3;</code>
   * @return The userSuppliedTag.
   */
  com.google.protobuf.ByteString getUserSuppliedTag();

  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 4;</code>
   * @return Whether the transportationType field is set.
   */
  boolean hasTransportationType();
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 4;</code>
   * @return The transportationType.
   */
  hla.rti1516_2024.fedpro.TransportationTypeHandle getTransportationType();
  /**
   * <code>.rti1516_2024.fedpro.TransportationTypeHandle transportationType = 4;</code>
   */
  hla.rti1516_2024.fedpro.TransportationTypeHandleOrBuilder getTransportationTypeOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 5;</code>
   * @return Whether the producingFederate field is set.
   */
  boolean hasProducingFederate();
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 5;</code>
   * @return The producingFederate.
   */
  hla.rti1516_2024.fedpro.FederateHandle getProducingFederate();
  /**
   * <code>.rti1516_2024.fedpro.FederateHandle producingFederate = 5;</code>
   */
  hla.rti1516_2024.fedpro.FederateHandleOrBuilder getProducingFederateOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.ConveyedRegionSet optionalSentRegions = 6;</code>
   * @return Whether the optionalSentRegions field is set.
   */
  boolean hasOptionalSentRegions();
  /**
   * <code>.rti1516_2024.fedpro.ConveyedRegionSet optionalSentRegions = 6;</code>
   * @return The optionalSentRegions.
   */
  hla.rti1516_2024.fedpro.ConveyedRegionSet getOptionalSentRegions();
  /**
   * <code>.rti1516_2024.fedpro.ConveyedRegionSet optionalSentRegions = 6;</code>
   */
  hla.rti1516_2024.fedpro.ConveyedRegionSetOrBuilder getOptionalSentRegionsOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 7;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 7;</code>
   * @return The time.
   */
  hla.rti1516_2024.fedpro.LogicalTime getTime();
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 7;</code>
   */
  hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getTimeOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.OrderType sentOrderType = 8;</code>
   * @return The enum numeric value on the wire for sentOrderType.
   */
  int getSentOrderTypeValue();
  /**
   * <code>.rti1516_2024.fedpro.OrderType sentOrderType = 8;</code>
   * @return The sentOrderType.
   */
  hla.rti1516_2024.fedpro.OrderType getSentOrderType();

  /**
   * <code>.rti1516_2024.fedpro.OrderType receivedOrderType = 9;</code>
   * @return The enum numeric value on the wire for receivedOrderType.
   */
  int getReceivedOrderTypeValue();
  /**
   * <code>.rti1516_2024.fedpro.OrderType receivedOrderType = 9;</code>
   * @return The receivedOrderType.
   */
  hla.rti1516_2024.fedpro.OrderType getReceivedOrderType();

  /**
   * <code>.rti1516_2024.fedpro.MessageRetractionHandle optionalRetraction = 10;</code>
   * @return Whether the optionalRetraction field is set.
   */
  boolean hasOptionalRetraction();
  /**
   * <code>.rti1516_2024.fedpro.MessageRetractionHandle optionalRetraction = 10;</code>
   * @return The optionalRetraction.
   */
  hla.rti1516_2024.fedpro.MessageRetractionHandle getOptionalRetraction();
  /**
   * <code>.rti1516_2024.fedpro.MessageRetractionHandle optionalRetraction = 10;</code>
   */
  hla.rti1516_2024.fedpro.MessageRetractionHandleOrBuilder getOptionalRetractionOrBuilder();
}
