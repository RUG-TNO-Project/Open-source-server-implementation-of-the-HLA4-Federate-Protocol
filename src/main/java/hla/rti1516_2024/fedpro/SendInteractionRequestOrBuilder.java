// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface SendInteractionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.SendInteractionRequest)
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
}
