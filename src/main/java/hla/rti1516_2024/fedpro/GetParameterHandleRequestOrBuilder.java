// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: RTIambassador.proto
// Protobuf Java Version: 4.30.1

package hla.rti1516_2024.fedpro;

public interface GetParameterHandleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rti1516_2024.fedpro.GetParameterHandleRequest)
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
   * <code>string parameterName = 2;</code>
   * @return The parameterName.
   */
  java.lang.String getParameterName();
  /**
   * <code>string parameterName = 2;</code>
   * @return The bytes for parameterName.
   */
  com.google.protobuf.ByteString
      getParameterNameBytes();
}
