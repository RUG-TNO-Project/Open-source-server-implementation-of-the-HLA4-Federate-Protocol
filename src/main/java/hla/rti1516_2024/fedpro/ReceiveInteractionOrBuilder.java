// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FederateAmbassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface ReceiveInteractionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.ReceiveInteraction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return Whether the interactionClass field is set.
   */
  boolean hasInteractionClass();
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   * @return The interactionClass.
   */
  hla.rti1516_2024.fedpro.InteractionClassHandle getInteractionClass();
  /**
   * <code>.rti1516_2024.fedpro.InteractionClassHandle interactionClass = 1;</code>
   */
  hla.rti1516_2024.fedpro.InteractionClassHandleOrBuilder getInteractionClassOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.ParameterHandleValueMap parameterValues = 2;</code>
   * @return Whether the parameterValues field is set.
   */
  boolean hasParameterValues();
  /**
   * <code>.rti1516_2024.fedpro.ParameterHandleValueMap parameterValues = 2;</code>
   * @return The parameterValues.
   */
  hla.rti1516_2024.fedpro.ParameterHandleValueMap getParameterValues();
  /**
   * <code>.rti1516_2024.fedpro.ParameterHandleValueMap parameterValues = 2;</code>
   */
  hla.rti1516_2024.fedpro.ParameterHandleValueMapOrBuilder getParameterValuesOrBuilder();

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
}
