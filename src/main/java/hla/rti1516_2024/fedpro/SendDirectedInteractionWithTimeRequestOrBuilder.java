// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface SendDirectedInteractionWithTimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.SendDirectedInteractionWithTimeRequest)
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
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 2;</code>
   * @return Whether the objectInstance field is set.
   */
  boolean hasObjectInstance();
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 2;</code>
   * @return The objectInstance.
   */
  hla.rti1516_2024.fedpro.ObjectInstanceHandle getObjectInstance();
  /**
   * <code>.rti1516_2024.fedpro.ObjectInstanceHandle objectInstance = 2;</code>
   */
  hla.rti1516_2024.fedpro.ObjectInstanceHandleOrBuilder getObjectInstanceOrBuilder();

  /**
   * <code>.rti1516_2024.fedpro.ParameterHandleValueMap parameterValues = 3;</code>
   * @return Whether the parameterValues field is set.
   */
  boolean hasParameterValues();
  /**
   * <code>.rti1516_2024.fedpro.ParameterHandleValueMap parameterValues = 3;</code>
   * @return The parameterValues.
   */
  hla.rti1516_2024.fedpro.ParameterHandleValueMap getParameterValues();
  /**
   * <code>.rti1516_2024.fedpro.ParameterHandleValueMap parameterValues = 3;</code>
   */
  hla.rti1516_2024.fedpro.ParameterHandleValueMapOrBuilder getParameterValuesOrBuilder();

  /**
   * <code>bytes userSuppliedTag = 4;</code>
   * @return The userSuppliedTag.
   */
  com.google.protobuf.ByteString getUserSuppliedTag();

  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 5;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 5;</code>
   * @return The time.
   */
  hla.rti1516_2024.fedpro.LogicalTime getTime();
  /**
   * <code>.rti1516_2024.fedpro.LogicalTime time = 5;</code>
   */
  hla.rti1516_2024.fedpro.LogicalTimeOrBuilder getTimeOrBuilder();
}
